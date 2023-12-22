package com.telecommunications.mapper.encode;

import com.telecommunications.pojo.encode.ProductBillingRelationship;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ProductBillingRelationshipMapper {

    @Insert("insert into product_billing_relationship (serial_number, product_code, product_name, billing_code, billing_type_name) " +
            "values (#{serialNumber}, #{productCode}, #{productName}, #{billingCode}, #{billingTypeName})")
    int add(ProductBillingRelationship relationship);

    @Delete("delete from product_billing_relationship where serial_number = #{serialNumber}")
    int delete(int serialNumber);

    @Update("update product_billing_relationship set product_code = #{productCode}, product_name = #{productName}, billing_code = #{billingCode}, billing_type_name = #{billingTypeName} where serial_number = #{serialNumber}")
    int update(ProductBillingRelationship relationship);

    @Select("select * from product_billing_relationship")
    List<ProductBillingRelationship> getAll();

    @Select("SELECT * FROM product_billing_relationship where serial_number = #{serialNumber}")
    ProductBillingRelationship findBySerialNumber(int serialNumber);

    @Select("SELECT * FROM product_billing_relationship where product_code = #{productCode}")
    ProductBillingRelationship findByProductCode(int productCode);

    @Select("SELECT * FROM product_billing_relationship where billing_code = #{billingCode}")
    ProductBillingRelationship findByBillingCode(int billingCode);

}
