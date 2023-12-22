package com.telecommunications.mapper.income;

import com.telecommunications.pojo.income.CardSalesIncome;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CardSalesIncomeMapper {

    @Insert("INSERT INTO card_sales_income (entry_date, city_code, product_code, card_sales_quantity, face_value_amount, card_total_amount, discounted_total_amount) " +
            "VALUES (#{entryDate}, #{cityCode}, #{productCode}, #{cardSalesQuantity}, #{faceValueAmount}, #{cardTotalAmount}, #{discountedTotalAmount})")
    int add(CardSalesIncome cardSalesIncome);

    @Delete("DELETE FROM card_sales_income WHERE id = #{id}")
    int delete(int id);

    @Update("UPDATE card_sales_income SET entry_date = #{entryDate}, city_code = #{cityCode}, product_code = #{productCode}, " +
            "card_sales_quantity = #{cardSalesQuantity}, face_value_amount = #{faceValueAmount}, card_total_amount = #{cardTotalAmount}, " +
            "discounted_total_amount = #{discountedTotalAmount} WHERE id = #{id}")
    int update(CardSalesIncome cardSalesIncome);

    @Select("select * from card_sales_income")
    List<CardSalesIncome> getAll();

    @Select("SELECT csi.* FROM telecommunications.card_sales_income AS csi JOIN telecommunications.city AS c " +
            "ON csi.city_code = c.city_code WHERE c.city_name = #{name}")
    List<CardSalesIncome> findByCity(String name);

    @Select("SELECT csi.* FROM telecommunications.card_sales_income AS csi JOIN telecommunications.product AS p " +
            "ON csi.product_code = p.product_code WHERE p.product_name = #{name}")
    List<CardSalesIncome> findByProduct(String name);

    @Update("update card_sales_income set audit_status = #{auditStatus} where id = #{id}")
    int updateAuditStatus(CardSalesIncome cardSalesIncome);


}
