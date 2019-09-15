package com.soft.biz;

import com.soft.dao.UserDao;
import com.soft.dao.UserDaoImpl;
import com.soft.entity.TblUser;

import java.util.List;

public class UserBizImpl implements  UserBiz{

    private UserDao userDao = new UserDaoImpl();
    @Override
    public TblUser login(String uname, String upwd) {

        return userDao.findUserByUser(new TblUser(uname,upwd));
    }

    @Override
    public boolean regUser(TblUser user) {
        boolean flag = false;
        int num = userDao.regUser(user);
        if(num>0){
            flag = true;
        }
        return  flag;
    }

    @Override
    public List<TblUser> findByName(String uname, int pageNo) {
        return null;
    }
}
