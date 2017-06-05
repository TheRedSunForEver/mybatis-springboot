package org.x.mybatisspringboot.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.x.mybatisspringboot.domain.User;

@Mapper
public interface UserDao {
    @Select("select * from user where id=#{id}")
    User findUserById(@Param("id") Integer id);

    @Select("select count(*) cnt from user")
    int countAll();
}
