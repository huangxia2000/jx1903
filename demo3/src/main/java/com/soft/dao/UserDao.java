package com.soft.dao;

import com.soft.entity.TblUser;

import java.util.List;

public interface UserDao {
    public TblUser findUserByUser(TblUser user);

    public int regUser(TblUser user);
    public List<TblUser>  findUserByName(String uname, int pageNo);
}
