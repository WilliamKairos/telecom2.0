package com.telecommunications.mapper.income;

import com.telecommunications.pojo.income.PrepaidConversionIncome;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PrepaidConversionIncomeMapper {

    @Insert("insert into prepaid_conversion_income (billing_date, city_code, product_code, cancellation_type_code, billing_amount) " +
            "values (#{billingDate}, #{cityCode}, #{productCode}, #{cancellationTypeCode}, #{billingAmount})")
    int add(PrepaidConversionIncome prepaidConversionIncome);

    @Delete("delete from prepaid_conversion_income where id = #{id}")
    int delete(int id);

    @Update("update prepaid_conversion_income set billing_date = #{billingDate}, city_code = #{cityCode}, product_code = #{productCode}, cancellation_type_code = #{cancellationTypeCode}, billing_amount = #{billingAmount} where id = #{id}")
    int update(PrepaidConversionIncome prepaidConversionIncome);

    @Select("select * from prepaid_conversion_income")
    List<PrepaidConversionIncome> getAll();

    @Select("SELECT pci.* FROM telecommunications.prepaid_conversion_income AS pci JOIN telecommunications.city AS c ON pci.city_code = c.city_code WHERE c.city_name = #{name}")
    List<PrepaidConversionIncome> findByCity(String name);

    @Select("SELECT pci.* FROM telecommunications.prepaid_conversion_income AS pci JOIN telecommunications.product AS p " +
            "ON pci.product_code = p.product_code WHERE p.product_name = #{name}")
    List<PrepaidConversionIncome> findByProduct(String name);

    @Update("update prepaid_conversion_income set audit_status = #{auditStatus} where id = #{id}")
    int updateAuditStatus(PrepaidConversionIncome income);
}
