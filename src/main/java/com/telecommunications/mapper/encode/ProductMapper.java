package com.telecommunications.mapper.encode;

import com.telecommunications.pojo.encode.Product;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ProductMapper {

    @Insert("insert into product (product_code, product_name, is_use, is_billing_income, is_card_sales_income, is_interconnect_income, is_notification_income, is_prepayment_to_income) " +
            "values (#{productCode}, #{productName}, #{isUse}, #{isBillingIncome}, #{isCardSalesIncome}, #{isInterconnectIncome}, #{isNotificationIncome}, #{isPrepaymentToIncome})")
    int add(Product product);

    @Delete("delete from product where product_code = #{productCode}")
    int delete(int productCode);

    @Update("update product set product_name = #{productName}, is_use = #{isUse}, is_billing_income = #{isBillingIncome}, is_card_sales_income = #{isCardSalesIncome}, is_interconnect_income = #{isInterconnectIncome}, is_notification_income = #{isNotificationIncome}, is_prepayment_to_income = #{isPrepaymentToIncome} where product_code = #{productCode}")
    int update(Product product);

    @Select("select * from product")
    List<Product> getAll();

    @Select("SELECT * FROM product where product_code = #{productCode}")
    Product findByCode(int productCode);

    @Select("SELECT * FROM product where product_name = #{productName}")
    Product findByName(String productName);

}
