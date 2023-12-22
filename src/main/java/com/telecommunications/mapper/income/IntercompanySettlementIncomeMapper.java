package com.telecommunications.mapper.income;

import com.telecommunications.pojo.income.IntercompanySettlementIncome;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface IntercompanySettlementIncomeMapper {

    @Insert("insert into intercompany_settlement_income (settlement_month, city_code, product_code, settlement_operator_code, settlement_type_code, settlement_amount) " +
            "values (#{settlementMonth}, #{cityCode}, #{productCode}, #{settlementOperatorCode}, #{settlementTypeCode}, #{settlementAmount})")
    int add(IntercompanySettlementIncome intercompanySettlementIncome);

    @Delete("delete from intercompany_settlement_income where id = #{id}")
    int delete(int id);

    @Update("update intercompany_settlement_income set settlement_month = #{settlementMonth}, city_code = #{cityCode}, product_code = #{productCode}," +
            "settlement_operator_code = #{settlementOperatorCode}, settlement_type_code = #{settlementTypeCode}, settlement_amount = #{settlementAmount} where id = #{id}")
    int update(IntercompanySettlementIncome intercompanySettlementIncome);

    @Select("select * from intercompany_settlement_income")
    List<IntercompanySettlementIncome> getAll();

    @Select("SELECT isi.* FROM telecommunications.intercompany_settlement_income AS isi JOIN telecommunications.city AS c ON isi.city_code = c.city_code WHERE c.city_name = #{name}")
    List<IntercompanySettlementIncome> findByCity(String name);

    @Select("SELECT isi.* FROM telecommunications.intercompany_settlement_income AS isi JOIN telecommunications.product AS p " +
            "ON isi.product_code = p.product_code WHERE p.product_name = #{name}")
    List<IntercompanySettlementIncome> findByProduct(String name);

    @Update("update intercompany_settlement_income set audit_status = #{auditStatus} where id = #{id}")
    int updateAuditStatus(IntercompanySettlementIncome income);

}
