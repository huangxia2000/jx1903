<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="com.soft.entity.TblUser" %>



<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
out.println(basePath);
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
    登录成功，<a href="">点击此处</a>返回登录页 <br>


    <s:property value="#session.user.uname"></s:property>



    <s:property value="user.clist[1]"></s:property>
  <s:iterator value="user.clist" var="c" status="st">
      <s:property  value="#st.index"></s:property> --<s:property value="c"></s:property>
  </s:iterator>



  </body>
</html>
