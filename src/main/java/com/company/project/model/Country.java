package com.company.project.model;


import com.company.project.support.dbhandler.StringListTypeHandler;
import org.apache.ibatis.type.JdbcType;
import tk.mybatis.mapper.annotation.ColumnType;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.List;

/**
 * NameStyle 将类的命名和表中的名字进行转换
 * Table 映射表名
 */
//@NameStyle(Style.camelhumpAndUppercase)
@Table(name = "country")
public class Country {

    @Id
    private Integer id;
    private String  countryname;
    private String  countrycode;
    @Transient
    private String otherThings; //非数据库表中字段

    @ColumnType(
            column = "country_info",
            jdbcType = JdbcType.VARCHAR,
            typeHandler = StringListTypeHandler.class)
    private List<String> countryinfo;

    public String getOtherThings() {
        return otherThings;
    }

    public void setOtherThings(String otherThings) {
        this.otherThings = otherThings;
    }

    public List<String> getCountryinfo() {
        return countryinfo;
    }

    public void setCountryinfo(List<String> countryinfo) {
        this.countryinfo = countryinfo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }
}
