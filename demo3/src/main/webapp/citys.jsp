<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>My JSP 'testui.jsp' starting page</title>


</head>

<body>
<%-- 1.表单标签 --%>
<s:form action="#" method="post">
    <!--此处略去其他标签...-->
    <!--
    7.1多选框标签（静态）
    1）根据OGNL（list属性值）创建的Map生成一组checkbox，其中Map的key
    生成checkbox的value值，Map的value生成checkbox的label值。
    2）根据OGNL（travelCities）取值来与生成checkbox的
    value比较，若与哪个checkbox的value值一致，则将其勾选。
    -->
    <s:checkboxlist list="cities" name="customer.travelCities"
                    listKey="code"  listValue="name">
    </s:checkboxlist>
    <input type ="checkbox" value="1">AAA

    <s:select list="cities" name="customer.travelCities"
              value="customer.travelCities" listKey="code" listValue="name">

    </s:select>


</s:form>

<s:debug>测试</s:debug>

</body>
</html>
