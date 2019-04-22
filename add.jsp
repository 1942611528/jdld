<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!--修改于 2019/4.17/14.30 -->
<html>
<head>
    <title>添加</title>
</head>
<body>
    <form action="insert" method="post"><!-- 提交到映射设置struct.xml中的添加操作 -->
        <table align="center" border="1" cellspacing="0">
            <tr>
                <td><!-- 通过productEntity.变量名 的方法给变量赋值(转到productEntity.java里) -->
                    用户名(请使用纯数字):<INPUT type="text" name="productEntity.users" value="">
                </td>
            </tr>
            <tr>
                <td>
                    密码(请使用纯数字):<INPUT type="password" name="productEntity.keyes" value="">
                </td>
            </tr>
            <tr>
            	<td>
            		年龄:<INPUT type="text" id="age" name="productEntity.age" value="0"/>
            		<select id="sex" name="productEntity.sex">
					  <option value ="man" >男</option>
					  <option value ="women" >女</option>
					</select>
            	</td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="注册">
                </td>
            </tr>
        </table>
    </form>
</body>
</html>