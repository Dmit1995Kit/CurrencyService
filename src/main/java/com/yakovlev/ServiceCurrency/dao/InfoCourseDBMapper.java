package com.yakovlev.ServiceCurrency.dao;

import com.yakovlev.ServiceCurrency.domain.InfoCourseDB;
import com.yakovlev.ServiceCurrency.domain.RatesDB;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class InfoCourseDBMapper implements RowMapper<InfoCourseDB> {
    @Override
    public InfoCourseDB mapRow(ResultSet rs, int rowNum) throws SQLException {

        RatesDB ratesDB = (new BeanPropertyRowMapper<>(RatesDB.class)).mapRow(rs, rowNum);
        InfoCourseDB infoCourseDB = (new BeanPropertyRowMapper<>(InfoCourseDB.class)).mapRow(rs, rowNum);
        infoCourseDB.setRates(ratesDB);

//          infoCourseDB.setId(rs.getLong("id"));
//          infoCourseDB.setDisclaimer(rs.getString("disclaimer"));
//          infoCourseDB.setLicense(rs.getString("license"));
//          infoCourseDB.setBase(rs.getString("base"));
//          infoCourseDB.setRates(rs.);
        return infoCourseDB;
    }
}
