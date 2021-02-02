package com.yakovlev.ServiceCurrency.controller;

import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.yakovlev.ServiceCurrency.ClientFeign.ExchangeGiphyBroke;
import com.yakovlev.ServiceCurrency.ClientFeign.ExchangeGiphyRich;
import com.yakovlev.ServiceCurrency.ClientFeign.ExchangeRates;
import com.yakovlev.ServiceCurrency.dao.InfoCourseDAO;
import com.yakovlev.ServiceCurrency.domain.InfoCourseDB;
import com.yakovlev.ServiceCurrency.model.InfoCourse;
import com.yakovlev.ServiceCurrency.model.giphyModel.ByIdEndPointBroke;
import com.yakovlev.ServiceCurrency.model.giphyModel.ByIdEndpoint;
import com.yakovlev.ServiceCurrency.model.giphyModel.ReadJson.ReadByEndPoint;
import com.yakovlev.ServiceCurrency.model.giphyModel.ReadJson.ReadByEndPointBroke;
import org.asynchttpclient.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;


@Controller
public class MainController {

    private final InfoCourseDAO infoCourseDAO;

    private final ExchangeRates exchangeRates;

    private final ExchangeGiphyRich exchangeGiphyRich;

    private final ExchangeGiphyBroke exchangeGiphyBroke;

    private double last_rub;
    private double new_rub;

    @Autowired
    private ServletContext servletContext;

    public String pathname = "/home/dmitrij/IdeaProjects/ServiceCurrency/src/main/resources/json/rates.json";

    public String pathnameRich = "/home/dmitrij/IdeaProjects/ServiceCurrency/src/main/resources/json/giphyRich.json";

    public String pathnameBroke = "/home/dmitrij/IdeaProjects/ServiceCurrency/src/main/resources/json/giphyBroke.json";

    @Autowired
    public MainController(InfoCourseDAO infoCourseDAO, ExchangeGiphyRich exchangeGiphyRich,ExchangeGiphyBroke exchangeGiphyBroke, ExchangeRates exchangeRates) {
        this.exchangeRates = exchangeRates;
        this.infoCourseDAO = infoCourseDAO;
        this.exchangeGiphyRich = exchangeGiphyRich;
        this.exchangeGiphyBroke = exchangeGiphyBroke;
    }

    @GetMapping(value = "/")
    public String home() {
        return "greeting";
    }

    @RequestMapping(value = "/viewRich", method = RequestMethod.GET, produces = MediaType.IMAGE_GIF_VALUE)
    public String giphyRich() throws IOException {

        ByIdEndpoint response = exchangeGiphyRich.giphyRich();
        ObjectMapper objectMapper = new ObjectMapper();
        ObjectWriter objectWriter = objectMapper.writer(new DefaultPrettyPrinter());
        objectWriter.writeValue(new File(pathnameRich), response);

        ReadByEndPoint byEndPoint = objectMapper.readValue(new File(pathnameRich), ReadByEndPoint.class);

        AsyncHttpClient client = Dsl.asyncHttpClient();
        FileOutputStream stream = new FileOutputStream("/home/dmitrij/IdeaProjects/ServiceCurrency/src/main/resources/static/giphy/LdOyjZ7io5Msw.gif");
        client.prepareGet(byEndPoint.getData().getImages().getDownsized_large().getUrl()).execute(new AsyncCompletionHandler<FileOutputStream>() {
//"/home/dmitrij/IdeaProjects/ServiceCurrency/src/main/resources/static/giphy/LdOyjZ7io5Msw.gif"
            @Override
            public AsyncHandler.State onBodyPartReceived(HttpResponseBodyPart bodyPart)
                    throws Exception {
                stream.getChannel().write(bodyPart.getBodyByteBuffer());
                return State.CONTINUE;
            }

            @Override
            public FileOutputStream onCompleted(Response response)
                    throws Exception {
                return stream;
            }
        });
        return "greeting";
    }
    @RequestMapping(value = "/viewBroke", method = RequestMethod.GET, produces = MediaType.IMAGE_GIF_VALUE)
    public String giphyBroke() throws IOException{
        ByIdEndPointBroke response = exchangeGiphyBroke.clientGiphyBroke();
        ObjectMapper objectMapper = new ObjectMapper();
        ObjectWriter objectWriter = objectMapper.writer(new DefaultPrettyPrinter());
        objectWriter.writeValue(new File(pathnameBroke), response);

        ReadByEndPointBroke byEndPointBroke = objectMapper.readValue(new File(pathnameBroke), ReadByEndPointBroke.class);

        AsyncHttpClient client = Dsl.asyncHttpClient();
        FileOutputStream stream = new FileOutputStream("/home/dmitrij/IdeaProjects/ServiceCurrency/src/main/resources/static/giphy/LdOyKm2YiI2mzRKgw.gif");
        client.prepareGet(byEndPointBroke.getData().getImages().getDownsized_large().getUrl()).execute(new AsyncCompletionHandler<FileOutputStream>() {
//"/home/dmitrij/IdeaProjects/ServiceCurrency/src/main/resources/static/giphy/LdOyKm2YiI2mzRKgw.gif"
            @Override
            public AsyncHandler.State onBodyPartReceived(HttpResponseBodyPart bodyPart)
                    throws Exception {
                stream.getChannel().write(bodyPart.getBodyByteBuffer());
                return State.CONTINUE;
            }

            @Override
            public FileOutputStream onCompleted(Response response)
                    throws Exception {
                return stream;
            }
        });
        return "greeting";
    }

    @GetMapping(value = "/update")
    public ModelAndView updatingCourses() throws IOException {
//забираю старый курс
        List<InfoCourseDB> infoCourseDBListLast = infoCourseDAO.lastAdd();
        for (InfoCourseDB recordLast : infoCourseDBListLast) {
            last_rub = recordLast.getRates().getRUB();
            System.out.println(last_rub);
        }
//кидаю запрос на получение курсов
        InfoCourse response = exchangeRates.getExchange();
        ObjectMapper objectMapper = new ObjectMapper();
        ObjectWriter objectWriter = objectMapper.writer(new DefaultPrettyPrinter());
        objectWriter.writeValue(new File(pathname), response);
//      достаю  json
        InfoCourseDB idb = objectMapper.readValue(new File(pathname), InfoCourseDB.class);
//      Сохраняю в бд
        infoCourseDAO.insertCourse(idb);
//      получаю новый курс
        new_rub = idb.getRates().getRUB();
        System.out.println(new_rub);

        var InfoCourseDB = infoCourseDAO.getAllCourses();
        var params = new HashMap<String, Object>();
        params.put("InfoCourseDB", InfoCourseDB);
        return new ModelAndView("courses", params);
    }

    @RequestMapping(value = "/comparison", method = RequestMethod.GET, produces = MediaType.IMAGE_GIF_VALUE)
       public void compareCourses(HttpServletResponse responseH) throws IOException {
        if (new_rub > last_rub) {
            var imgFile = new ClassPathResource("static/giphy/LdOyKm2YiI2mzRKgw.gif");

            responseH.setContentType(MediaType.IMAGE_GIF_VALUE);
            StreamUtils.copy(imgFile.getInputStream(), responseH.getOutputStream());
        }
        if (new_rub < last_rub) {
            var imgFile = new ClassPathResource("static/giphy/LdOyjZ7io5Msw.gif");

            responseH.setContentType(MediaType.IMAGE_GIF_VALUE);
            StreamUtils.copy(imgFile.getInputStream(), responseH.getOutputStream());
        }
        if (last_rub == new_rub){
            var imgFile = new ClassPathResource("static/giphy/LdOyKm2YiI2mzRKgw.gif");

            responseH.setContentType(MediaType.IMAGE_GIF_VALUE);
            StreamUtils.copy(imgFile.getInputStream(), responseH.getOutputStream());
        }
    }
}

