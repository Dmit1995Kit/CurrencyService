package com.yakovlev.ServiceCurrency.dao;

import com.yakovlev.ServiceCurrency.domain.InfoCourseDB;
import com.yakovlev.ServiceCurrency.domain.RatesDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.util.List;

@Repository
public class InfoCourseDAO extends JdbcDaoSupport {
//    private final JdbcTemplate jdbcTemplate;
//
//    @Autowired
//    public InfoCourseDAO(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }

    @Autowired
    DataSource dataSource;

    @PostConstruct
    private void initialize(){
        setDataSource(dataSource);
    }

    public List<InfoCourseDB> getAllCourses() {
      return getJdbcTemplate().query("SELECT * FROM infocourse", new InfoCourseDBMapper());
    }

     public void insertCourse(InfoCourseDB infoCourseDB) {
        String sql = "INSERT INTO infocourse " +
                "(disclaimer,license, times, base, RUB, EUR, ANG,ARS,AUD) " +
                "VALUES(?,?,?,?,?,?,?,?,?)";
        getJdbcTemplate().update(sql,new Object[]{
           infoCourseDB.getDisclaimer(),infoCourseDB.getLicense(),infoCourseDB.getTimestamp(),
           infoCourseDB.getBase(),infoCourseDB.getRates().getRUB(),infoCourseDB.getRates().getEUR(),
                infoCourseDB.getRates().getANG(),infoCourseDB.getRates().getARS(),
                infoCourseDB.getRates().getAUD()
        });

     }
     public List<InfoCourseDB> lastAdd(){
     return getJdbcTemplate().query("SELECT RUB FROM infocourse ORDER BY " +
             "rub DESC LIMIT 1", new InfoCourseDBMapper());
     }
     @Transactional
     public List<InfoCourseDB>cursor() {
        return getJdbcTemplate().query("BEGIN WORK;declare li scroll cursor for select * from infocourse;" +
                "fetch prior from li;close li; COMMIT WORK",new InfoCourseDBMapper());
     }
}
