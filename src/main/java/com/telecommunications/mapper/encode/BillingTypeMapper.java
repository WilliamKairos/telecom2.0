package com.telecommunications.mapper.encode;

import com.telecommunications.pojo.encode.BillingType;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BillingTypeMapper {

    @Insert("insert into billing_type (billing_code, billing_type_name) " +
            "values (#{billingCode}, #{billingTypeName})")
    int add(BillingType billingType);

    @Delete("delete from billing_type where billing_code = #{billingCode}")
    int delete(int billingCode);

    @Update("update billing_type set billing_type_name = #{billingTypeName} where billing_code = #{billingCode}")
    int update(BillingType billingType);

    @Select("select * from billing_type")
    List<BillingType> getAll();

    @Select("SELECT * FROM billing_type where billing_code = #{billingCode}")
    BillingType findByCode(int billingCode);

    @Select("SELECT * FROM billing_type where billing_type_name = #{billingTypeName}")
    BillingType findByName(String billingTypeName);

}
