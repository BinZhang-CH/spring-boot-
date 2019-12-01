package com.ztkj.mapper;

import com.ztkj.pojo.User;

import java.util.List;

public interface UserDao {
    /**
     * 添加用户
     *
     * @param user
     * @return
     */
    public void addUser(User user) throws Exception;

    /**
     *
     * @param user
     * @return
     * @throws Exception
     */
    public List<User> getUsersByPage(User user) throws Exception;
}
