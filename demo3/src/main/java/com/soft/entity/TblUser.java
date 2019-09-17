package com.soft.entity;

import java.util.ArrayList;
import java.util.List;

public class TblUser {
    private String uname;
    private  String upwd;
    private int a=0;
    private List<String> clist =new ArrayList<String>();
    public TblUser( ) {

    }

    public TblUser(String uname, String upwd) {
        this.uname = uname;
        this.upwd = upwd;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public List<String> getClist() {
        return clist;
    }

    public void setClist(List<String> clist) {
        this.clist = clist;
    }
}
