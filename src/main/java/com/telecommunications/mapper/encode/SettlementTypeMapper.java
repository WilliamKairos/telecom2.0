package com.telecommunications.mapper.encode;

import com.telecommunications.pojo.encode.SettlementType;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface SettlementTypeMapper {

    @Insert("insert into settlement_type (settlement_code, settlement_name) " +
            "values (#{settlementCode}, #{settlementName})")
    int add(SettlementType settlementType);

    @Delete("delete from settlement_type where settlement_code = #{settlementCode}")
    int delete(int settlementCode);

    @Update("update settlement_type set settlement_name = #{settlementName} where settlement_code = #{settlementCode}")
    int update(SettlementType settlementType);

    @Select("select * from settlement_type")
    List<SettlementType> getAll();

    @Select("SELECT * FROM settlement_type where settlement_code = #{settlementCode}")
    SettlementType findByCode(int settlementCode);

    @Select("SELECT * FROM settlement_type where settlement_name = #{settlementName}")
    SettlementType findByName(String settlementName);

}
