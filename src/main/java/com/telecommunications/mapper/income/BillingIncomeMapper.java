package com.telecommunications.mapper.income;

import com.telecommunications.pojo.income.BillingIncome;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BillingIncomeMapper {

    @Insert("insert into billing_income (entry_month, city_code, product_code, billing_type_code, entry_amount) " +
            "values (#{entryMonth}, #{cityCode}, #{productCode}, #{billingTypeCode}, #{entryAmount})")
    int add(BillingIncome billingIncome);

    @Delete("delete from billing_income where id = #{id}")
    int delete(int id);

    @Update("update billing_income set entry_month = #{entryMonth}, city_code = #{cityCode}, product_code = #{productCode}, billing_type_code = #{billingTypeCode}, entry_amount = #{entryAmount}, audit_status = #{auditStatus} where id = #{id}")
    int update(BillingIncome billingIncome);

    @Select("select * from billing_income")
    List<BillingIncome> getAll();

    @Select("SELECT bi.* FROM telecommunications.billing_income AS bi JOIN telecommunications.city AS c ON bi.city_code = c.city_code WHERE c.city_name = #{name}")
    List<BillingIncome> findByCity(String name);

    @Select("SELECT bi.* FROM telecommunications.billing_income AS bi JOIN telecommunications.product AS p " +
            "ON bi.product_code = p.product_code WHERE p.product_name = #{name}")
    List<BillingIncome> findByProduct(String name);

    @Update("update billing_income set audit_status = #{auditStatus} where id = #{id}")
    int updateAuditStatus(BillingIncome billingIncome);



}
