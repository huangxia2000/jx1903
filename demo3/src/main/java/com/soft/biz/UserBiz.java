package com.soft.biz;

import com.soft.entity.TblUser;

import java.util.List;

public interface UserBiz {

    public TblUser login(String uname, String upwd);
    public boolean regUser(TblUser user);
    public List<TblUser>  findByName(String uname, int pageNo);
}
