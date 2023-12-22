package com.telecommunications.mapper.encode;

import com.telecommunications.pojo.encode.ProductNotificationRelationship;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ProductNotificationRelationshipMapper {

    @Insert("insert into product_billing_relationship (serial_number, product_code, product_name, billing_code, billing_type_name) " +
            "values (#{serialNumber}, #{productCode}, #{productName}, #{billingCode}, #{billingTypeName})")
    int add(ProductNotificationRelationship relationship);

    @Delete("delete from product_billing_relationship where serial_number = #{serialNumber}")
    int delete(int serialNumber);

    @Update("update product_billing_relationship set product_code = #{productCode}, product_name = #{productName}, billing_code = #{billingCode}, billing_type_name = #{billingTypeName} where serial_number = #{serialNumber}")
    int update(ProductNotificationRelationship relationship);

    @Select("select * from product_notification_relationship")
    List<ProductNotificationRelationship> getAll();

    @Select("SELECT * FROM product_billing_relationship where serial_number = #{serialNumber}")
    ProductNotificationRelationship findBySerialNumber(int serialNumber);

    @Select("SELECT * FROM product_billing_relationship where product_code = #{productCode}")
    ProductNotificationRelationship findByProductCode(int productCode);

    @Select("SELECT * FROM product_billing_relationship where billing_code = #{billingCode}")
    ProductNotificationRelationship findByBillingCode(int billingCode);

}
