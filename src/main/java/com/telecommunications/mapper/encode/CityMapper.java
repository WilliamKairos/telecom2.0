package com.telecommunications.mapper.encode;

import com.telecommunications.pojo.encode.City;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CityMapper {

    @Insert("insert into city (city_code, city_name) " +
            "values (#{cityCode}, #{cityName})")
    int add(City city);

    @Delete("delete from city where city_code = #{cityCode}")
    int delete(int cityCode);

    @Update("update city set city_name = #{cityName} where city_code = #{cityCode}")
    int update(City city);

    @Select("select * from city")
    List<City> getAll();

    @Select("SELECT * FROM city where city_code = #{cityCode}")
    City findByCode(int cityCode);

    @Select("SELECT * FROM city where city_name = #{cityName}")
    City findByName(String cityName);

}
