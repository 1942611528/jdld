<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录</title>
</head>
<body>
	<form action="look" method="post">
        <table align="center" border="1" cellspacing="0">
            <tr>
                <td>
                    用户名:<input type="text" name="productEntity.name" value="">
                </td>
            </tr>
            <tr>
                <td>
                    密码:<input type="password" name="productEntity.keyes" value="">
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                	<td><a href="add.jsp">注册界面</a></td>
                    <input type="submit" value="确认">
                </td>
            </tr>
        </table>
        </form>
</body>
</html>