package com.soft.web;

import com.soft.biz.UserBiz;
import com.soft.biz.UserBizImpl;
import com.soft.entity.TblUser;
import org.apache.struts2.interceptor.SessionAware;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoginAction implements   SessionAware {

private int a=0;
private TblUser user;
private String uname;
private Map<String ,String>remap = new HashMap<String,String>();
private UserBiz userBiz = new UserBizImpl();
private Map<String, Object> session=null;
    public String  execute (){
        String remsg = "no";

       TblUser loginU =  userBiz.login(user.getUname(),user.getUpwd());
     if(null !=loginU ){
         //1.用户对象存在session  actionContext
       // Map<String,Object> a = ActionContext.getContext().getSession();
        // a.put("user",loginU);
//2. servlet

   //   HttpSession session =  ServletActionContext.getRequest().getSession();
     // session.setAttribute("user",loginU);
//3.
        session.put("user",loginU);
         List list = new ArrayList();
         list.add("代码");
         list.add("睡眠");
         user.setClist(list);
         remsg = "ok";
       }
        return remsg;
    }

    public TblUser getUser() {
        return user;
    }

    public void setUser(TblUser user) {
        this.user = user;
    }


    @Override
    public void setSession(Map<String, Object> map) {

        //map 来源， 谁调用setSession
        // //加载struts.xml path -> LoginAction 实例化 后，调用setSession
        //  Map<String,Object> a = ActionContext.getContext().getSession();
        // setSession(a);
        System.out.println("map = [" + map + "]");
        //session 对象来源: map
        session = map;
    }



    public String checkUname(){




        remap.put("",)

        remap.put("info","success");

        return "goods";
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Map<String, String> getRemap() {
        return remap;
    }

    public void setRemap(Map<String, String> remap) {
        this.remap = remap;
    }
}
