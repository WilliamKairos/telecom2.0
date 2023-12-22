package com.telecommunications.mapper.encode;

import com.telecommunications.pojo.encode.ReceiptPurpose;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ReceiptPurposeMapper {

    @Insert("insert into receipt_purpose (receipt_code, receipt_name) " +
            "values (#{receiptCode}, #{receiptName})")
    int add(ReceiptPurpose receiptPurpose);

    @Delete("delete from receipt_purpose where receipt_code = #{receiptCode}")
    int delete(int receiptCode);

    @Update("update receipt_purpose set receipt_name = #{receiptName} where receipt_code = #{receiptCode}")
    int update(ReceiptPurpose receiptPurpose);

    @Select("select * from receipt_purpose")
    List<ReceiptPurpose> getAll();

    @Select("SELECT * FROM receipt_purpose where receipt_code = #{receiptCode}")
    ReceiptPurpose findByCode(int receiptCode);

    @Select("SELECT * FROM receipt_purpose where receipt_name = #{receiptName}")
    ReceiptPurpose findByName(String receiptName);

}
