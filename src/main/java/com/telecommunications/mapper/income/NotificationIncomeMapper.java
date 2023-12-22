package com.telecommunications.mapper.income;

import com.telecommunications.pojo.income.NotificationIncome;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface NotificationIncomeMapper {

    @Insert("insert into notification_income (business_receipt_date, city_code, product_code, notification_income_code, business_income_amount) " +
            "values (#{businessReceiptDate}, #{cityCode}, #{productCode}, #{notificationIncomeCode}, #{businessIncomeAmount})")
    int add(NotificationIncome notificationIncome);

    @Delete("delete from notification_income where id = #{id}")
    int delete(int id);

    @Update("update notification_income set business_receipt_date = #{businessReceiptDate}, city_code = #{cityCode}, product_code = #{productCode}, notification_income_code = #{notificationIncomeCode}, business_income_amount = #{businessIncomeAmount} where id = #{id}")
    int update(NotificationIncome notificationIncome);

    @Select("select * from notification_income")
    List<NotificationIncome> getAll();

    @Select("SELECT ni.* FROM telecommunications.notification_income AS ni JOIN telecommunications.city AS c ON ni.city_code = c.city_code WHERE c.city_name = #{name}")
    List<NotificationIncome> findByCity(String name);

    @Select("SELECT ni.* FROM telecommunications.notification_income AS ni JOIN telecommunications.product AS p " +
            "ON ni.product_code = p.product_code WHERE p.product_name = #{name}")
    List<NotificationIncome> findByProduct(String name);

    @Update("update notification_income set audit_status = #{auditStatus} where id = #{id}")
    int updateAuditStatus(NotificationIncome income);

}
