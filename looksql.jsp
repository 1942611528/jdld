<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.mysql.cj.jdbc.Driver" %>
<%@ page import="java.sql.*" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
//查看结果
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");//记载数据库驱动，注册到驱动管理器
        String url="jdbc:mysql://localhost:3306/HIMS";//连接本地sys数据库
        String username="root";//数据库登陆名
        String password="123";//密码
        Connection conn=DriverManager.getConnection(url,username,password);
        if(conn!=null){
            out.println("数据库连接成功！！！");
        }else{
            out.println("数据库连接失败！！！");
        }
      //创建Statement
      Statement stmt = conn.createStatement();
      //执行查询
      ResultSet rs = stmt.executeQuery("select * from hims");
       %>
       <table border="1">
       <% 
       out.println("123");
      while(rs.next())
             {%>
            <tr>
            	<td>用户名</td>
                <td><%=rs.getString(1)%></td>
                <td>密码</td>
                <td><%=rs.getString(2)%></td>
                <td>名别</td>
                <td><%=rs.getString(3)%></td>
<%--                 <td>年龄</td>
                <td><%=rs.getString(4)%></td> --%>
            </tr>
            <%}%>
        </table>
      
   <%      
    }catch(ClassNotFoundException e){
        e.printStackTrace();
    }
%>
</body>
</html>