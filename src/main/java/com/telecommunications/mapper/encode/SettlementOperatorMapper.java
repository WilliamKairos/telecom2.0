package com.telecommunications.mapper.encode;

import com.telecommunications.pojo.encode.SettlementOperator;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface SettlementOperatorMapper {

    @Insert("insert into settlement_operator (operator_code, operator_name) " +
            "values (#{operatorCode}, #{operatorName})")
    int add(SettlementOperator settlementOperator);

    @Delete("delete from settlement_operator where operator_code = #{operatorCode}")
    int delete(int operatorCode);

    @Update("update settlement_operator set operator_name = #{operatorName} where operator_code = #{operatorCode}")
    int update(SettlementOperator settlementOperator);

    @Select("select * from settlement_operator")
    List<SettlementOperator> getAll();

    @Select("SELECT * FROM settlement_operator where operator_code = #{operatorCode}")
    SettlementOperator findByCode(int operatorCode);

    @Select("SELECT * FROM settlement_operator where operator_name = #{operatorName}")
    SettlementOperator findByName(String operatorName);

}
