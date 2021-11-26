package com.example.mybaitsspringboot.Dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mybaitsspringboot.Do.User;


import com.example.mybaitsspringboot.Vo.ShowAllUserVo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author: MA
 * @Date: 2021/11/17 14:54
 */
@Mapper
public interface UserDao extends BaseMapper<User> {
    /**
     * 通过名字找对应用户
     *
     * @param name name
     * @return User
     */
    @Select("select * from user where name=#{name}")
    User selectByName(String name);

    /**
     * 查询所有用户信息 +对应 部门名
     *
     * @return List<User>
     */
    @Select("select u.user_id, d.Department_name, u.name, u.nickname, u.phone_number, u.state, u.create_time\n" +
            "from user as u ,\n" +
            "     department as d\n" +
            "where d.Department_id in\n" +
            "      (select ud.department_id\n" +
            "       from user_department as ud\n" +
            "       where ud.user_id in\n" +
            "             (select user_id from user)\n" +
            "          and u.user_id = ud.user_id)\n" +
            ";")
    List<ShowAllUserVo> selectAll();

    /**
     * 添加用户
     *
     * @param user UserDo
     */
    @Insert("insert into user values" +
            "(null,#{name},#{password},#{nickname}," +
            "#{gender},#{state},#{phoneNumber},#{email},now(),now(),null)")
    void insertUser(User user);

}
