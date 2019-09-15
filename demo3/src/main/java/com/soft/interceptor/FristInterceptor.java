package com.soft.interceptor;


import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class FristInterceptor implements Interceptor {

    @Override
    public void destroy() {
        System.out.println("destory-----");
    }

    @Override
    public void init() {
        System.out.println("init---");
    }

    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {

        System.out.println("拦截前-----");
        Object obj =actionInvocation.getInvocationContext().getSession().get("user");
        if(null !=obj){
           actionInvocation.invoke();//放行到ACtion 方法   //反射机制
        }
      //  msg ="error";
        System.out.println("拦截后=========");
        return "loginerror";
    }

}
