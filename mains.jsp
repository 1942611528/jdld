<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <title>首页</title>
</head>
<body>
<table border="1"  align="center" >
    <tr>
        <th>用户名</th>
        <th>密码</th>
        <th>年龄</th>
        <td>性别</td>
        <th colspan="2">可用操作</th>
    </tr>
    <!--productEntityList是action类中GetList方法返回的结果(刚开始时是不显示的由index显示)-->
    <s:iterator value="productEntityList" var="p">
        <tr>
            <td>${p.users}</td>
            <td>${p.keyes}</td>
            <td>${p.age}</td>
            <td>${p.sex}</td>
            <td><a href="detail?productEntity.id=${p.id}">修改个人信息</a></td>
            <td><a href="delete?productEntity.id=${p.id}">删除账户(注意!一但删除无法找回!)</a></td>
        </tr>
    </s:iterator>
 
    <!--添加--->
    <tr>
        <td colspan="5" align="center"><a href="add.jsp">新建用户</a></td><td><a href="viplog.jsp">返回登录界面</a></td>
    </tr>
 
</table>
</body>
</html>