package com.telecommunications.mapper.encode;

import com.telecommunications.pojo.encode.NotificationType;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface NotificationTypeMapper {

    @Insert("insert into notification_type (notification_income_code, notification_type_name) " +
            "values (#{notificationIncomeCode}, #{notificationTypeName})")
    int add(NotificationType notificationType);

    @Delete("delete from notification_type where notification_income_code = #{notificationIncomeCode}")
    int delete(int notificationIncomeCode);

    @Update("update notification_type set notification_type_name = #{notificationTypeName} where notification_income_code = #{notificationIncomeCode}")
    int update(NotificationType notificationType);

    @Select("select * from notification_type")
    List<NotificationType> getAll();

    @Select("SELECT * FROM notification_type where notification_income_code = #{notificationIncomeCode}")
    NotificationType findByCode(int notificationIncomeCode);

    @Select("SELECT * FROM notification_type where notification_type_name = #{notificationTypeName}")
    NotificationType findByName(String notificationTypeName);

}
