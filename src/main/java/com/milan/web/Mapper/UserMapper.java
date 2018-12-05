package com.milan.web.Mapper;

import com.milan.web.entities.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapper {

    @Select("select * from user where id=#{id}")
    public User getUserById(Integer id);

    @Delete("delete from user  where id=#{id}")
    public int delUserById(Integer id);

    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into user(uname,age)  values(#{uname},#{age})")
    public int addUser(User user);

    @Update("update user set uname=#{uname},age=#{age} where id=#{id}")
    public int updateUser(User user);


}
