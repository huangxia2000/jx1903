package com.soft.web;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {

    /*public String execute(){

    }*/
    // 查，增，删除，修改
    public String findByName(){
        // DAO
        System.out.println("-useraction----");
        return "success";
    }

    public String delUser(){
       // findByName()
        return "success";
    }

}
