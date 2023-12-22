package com.telecommunications.mapper.admin;

import com.telecommunications.pojo.admin.User;
import org.apache.ibatis.annotations.*;

import java.util.List;


@Mapper
public interface UserMapper {

    @Select("select * from users where user_name = #{name} and password = #{password}")
    User findUser(String name, String password);


    @Insert("insert into users (user_name, password, user_type) " +
            "values ( #{user_name}, #{password}, #{user_type})")
    int add(User user);

    @Delete("delete from users where user_id = #{id}")
    int delete(int id);

    @Update("update users set user_name = #{user_name}, password = #{password}, user_type = #{user_type} where user_id = #{user_id}")
    int update(User user);

    @Select("select * from users")
    List<User> getAll();

    @Select("select * from users where user_name = #{name}")
    User findUserByName(User user);

}
