<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 2019/7/5
  Time: 14:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>



<hr>


<c:if test="${msg} != null">
    ${msg}
    ${requestScope.msg}
</c:if>


<c:if test="${sessionScope.date != null}">
    session date: ${sessionScope.date}
    request date: ${sessionScope.date}
</c:if>


<c:if test="${sessionScope.user != null}">
    session date: ${sessionScope.user}
    request date: ${sessionScope.user}
</c:if>









<h2>Request Success!</h2>
</body>
</html>
