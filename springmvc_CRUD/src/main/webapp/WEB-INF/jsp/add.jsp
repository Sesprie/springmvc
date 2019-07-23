<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Add</title>
</head>
<body>

<%-- request中或者中需要有一个Employee对象与当前表单绑定 --%>
<%-- form标签中的path要求对应employee中的属性 --%>
<%-- 由于此页面是add与edit操作共用的，所以有判断语句，判断是否应当添加_method隐藏域 --%>
<form:form action="${pageContext.request.contextPath}/emp" method="post" modelAttribute="employee">



<%-- 如果这里employee的属性有没有显示出来的，需要在controller中定义一个@ModelAttribute修饰的方法，在map中put一个employee对象 --%>
    <c:if test="${id != null}">
        <form:hidden path="id"></form:hidden>
        <input type="hidden" name="_method" value="put"/>
    </c:if>

    姓名：<form:input path="name"/><br>
    年龄：<form:input path="age"/><br>
    <%
        Map<String, String> genders = new HashMap<String, String>();
        genders.put("1","男");
        genders.put("0","女");
        request.setAttribute("sex", genders);

    %>
    性别：<form:radiobuttons path="sex" items="${sex}" delimiter="<br>"/><br>
    <%--  输入框中的中值itemValue会赋值给department.id  --%>
    部门：<form:select path="department.id" items="${departments}" itemLabel="dept_name" itemValue="id"/>
    <input type="submit" value="submit">

</form:form>




</body>
</html>
