package com.company.project.mapper;

import com.company.project.model.Country;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CountryMapper extends tk.mybatis.mapper.common.Mapper<Country> {


    @Select("select * from country where countryname = #{countryname}")
    Country selectByCountryName(String countryname);

    Country selectByCountryName2(@Param("countryname") String countryname);

}
