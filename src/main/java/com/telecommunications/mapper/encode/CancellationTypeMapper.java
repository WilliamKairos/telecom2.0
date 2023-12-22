package com.telecommunications.mapper.encode;

import com.telecommunications.pojo.encode.CancellationType;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CancellationTypeMapper {

    @Insert("insert into cancellation_type (cancellation_code, cancellation_name) " +
            "values (#{cancellationCode}, #{cancellationName})")
    int add(CancellationType cancellationType);

    @Delete("delete from cancellation_type where cancellation_code = #{cancellationCode}")
    int delete(String cancellationCode);

    @Update("update cancellation_type set cancellation_name = #{cancellationName} where cancellation_code = #{cancellationCode}")
    int update(CancellationType cancellationType);

    @Select("select * from cancellation_type")
    List<CancellationType> getAll();

    @Select("SELECT * FROM cancellation_type where cancellation_code = #{cancellationCode}")
    CancellationType findByCode(String cancellationCode);

    @Select("SELECT * FROM cancellation_type where cancellation_name = #{cancellationName}")
    CancellationType findByName(String cancellationName);

}
