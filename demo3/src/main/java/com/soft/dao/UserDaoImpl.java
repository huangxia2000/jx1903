package com.soft.dao;

import com.soft.entity.TblUser;

import java.util.List;

public class UserDaoImpl implements  UserDao {


// QueryRunner

    @Override
    public TblUser findUserByUser(TblUser user) {


        return new TblUser("admin","123");
    }

    @Override
    public int regUser(TblUser user) {
       return 1;
    }

    @Override
    public List<TblUser> findUserByName(String uname, int pageNo) {
        return null;
    }
}
