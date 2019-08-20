<%@taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<%@page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>jsp</title>
</head>
<body>
      <table border="1px" align="center" width="50%">
         <tr>
            <th>姓名</th>
            <th>年龄</th>
         </tr>
        <c:forEach items="${list }" var="user">
            <tr>
               <td>${user.name}</td>
               <td>${user.age}</td>
            </tr>
         </c:forEach>
      </table>
</body>
</html>