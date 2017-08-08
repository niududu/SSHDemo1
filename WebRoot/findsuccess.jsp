<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    
    <title>结果</title>
	
  </head>
  
  <body>
    查找数据成功
    数据显示为：
    <h1>
    <c:forEach items="${users}" var="user">
	   用户名： ${user.username}<br>
	   密码：    ${user.password} 
    </c:forEach>
    </h1>
  </body>
</html>
