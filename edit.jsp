<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!--修改于 2019/4.17/14.30 -->
<html>
    <head>
        <title>修改</title>
    </head>
    <body>
    <form action="update" method="post">
        <table align="center" border="1" cellspacing="0">
            <tr>
                <td>
                    新的用户名(请使用纯数字):<input type="text" name="productEntity.users" value="${productEntity.users}">
                </td>
            </tr>
            <tr>
                <td>
                    新的密码(请使用纯数字):<input type="password" name="productEntity.keyes" value="${productEntity.keyes}">
                </td>
            </tr>
            <tr>
            	<td>
            		更改年龄:<INPUT type="text" id="age" name="productEntity.age" value="${productEntity.age}"/>
            	</td>
            </tr>
            <tr>
            	<tr>
					<select id="sex" name="productEntity.sex">
					  <option value ="${productEntity.sex}" >男</option>
					  <option value ="${productEntity.sex2}" >女</option>
					</select>
			   </tr>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="hidden" name="productEntity.id" value="${productEntity.id}">
                    <input type="submit" value="确认">
                </td>
            </tr>
        </table>
        </form>
    </body>
</html>