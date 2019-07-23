<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
    <title>List Employees</title>
    <%-- 这里引入js文件不能使用单标签，否则引入无效 --%>
    <script src="/res/js/jquery-3.4.1.min.js" type="text/javascript"></script>
    <script type="text/javascript">
        $(function(){
            $(".delete").click(function(){
                    var href = $(this).attr("href");
                    $("form").attr("action", href).submit();
                    return false;

                })
        })
    </script>
</head>
<body>


<form action="" method="post">
    <input type="hidden" name="_method" value="DELETE">
</form>

<c:if test="${empty requestScope.employees}">
    数据库没有数据
</c:if>
<c:if test="${!empty requestScope.employees}">
    <table border="1px">
        <tr>
            <th>序号</th>
            <th>id</th>
            <th>名称</th>
            <th>年龄</th>
            <th>性别</th>
            <th>部门</th>
            <th>编辑</th>
            <th>删除</th>

        </tr>
        <c:forEach items="${requestScope.employees}" var="e" varStatus="vs">
            <tr>
                <td>${vs.count}</td>
                <td>${e.id}</td>
                <td>${e.name}</td>
                <td>${e.age}</td>
                <td>${e.sex == 0 ? "女":"男"}</td>
                <td>${e.department.dept_name}</td>
                <td><a class="edit" href="/emp/${e.id}">edit</a></td>
                <td><a class="delete" href="/emp/${e.id}">delete</a></td>

            </tr>


        </c:forEach>

    </table>
</c:if>


</body>
</html>
