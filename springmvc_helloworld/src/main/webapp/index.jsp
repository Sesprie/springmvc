<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<body>
<a href="/testHelloView">testHelloView</a>
<hr>

<a href="/testInternalResouceViewAndView">testInternalResouceViewAndView</a>
<hr>

<form action="/requestmapping/testPostSubmit" method="post">

    <input type="submit" value="test post method">

</form>
<br>

<a href="/requestmapping/testPostSubmit">使用Get方式访问post映射的路径</a>
<br>
<a href="/requestmapping/test">测试RequestMapping修饰类时的情况</a>
<br>
<a href="/requestmapping/testParams?username=li&age=10">测试RequestMapping的params属性username=li&age=10</a>
<br>
<a href="/requestmapping/testParams?username=li&age=11">测试RequestMapping的params属性username=li&age=11</a>
<br>
<a href="/requestmapping/testAntPath/abc/hello">测试带通配符的路径</a>
<br>
<a href="/requestmapping/testPathVariable/11">测试Restful风格的路径、PathVariable</a>
<br>
<a href="/testRequestParam?username=zhang&age=1">测试@RequestParam</a>
<br>
<a href="/testRequestHeader">测试@RequestHeader</a>
<br>
<a href="/testCookieValue">测试@CookieValue</a>
<hr>
<a href="/testServletApi">测试Servlet原生Api</a>
<hr>
<a href="/testModelAndView">测试ModelAndView返回值</a>
<hr>
<a href="/testMap?username=zhangsan">测试入参为Map&lt;String,Object&gt;</a>
<hr>
<a href="/testSessionAttributes">测试@SessionAttributes</a>
<hr>





<form action="/testPojo" method="post">
    用户名：<input type="text" name="username"/><br>
    密码：<input type="password" name="password"/><br>
    省：<input type="text" name="address.province"/><br>
    城市：<input type="text" name="address.city"/><br>
    <input type="submit" value="提交"/>
</form>
<hr>
<hr>
<br>
<br>
<form action="/testRest/1" method="post">
    <input type="hidden" name="_method" value="PUT"/>
    <input type="submit" value="test put"/>
</form>
<br>
<form action="/testRest/1" method="post">
    <input type="hidden" name="_method" value="DELETE"/>
    <input type="submit" value="test delete"/>
</form>
<br>
<form action="/testRest" method="post">
    <input type="hidden" name="id" value="1">
    <input type="submit" value="test post"/>
</form>
<br>
<form action="/testRest/1" method="get">
    <input type="submit" value="test get"/>
</form>
<br>

<hr>


<form action="/testModelAttribute" method="post">
    <input type="hidden" name="id" value="1">
    用户名：<input type="text" name="username" value="Tom"><br>
<%--    如果这里加上password的域，则被@ModelAttribute标记的方法所创建的属性不会生效，因为，此处的表单提交时，password是空串，空串也是值，而并非没有值    --%>
<%--    密码：<input type="password" name="password" value=""><br>--%>
    <input type="submit" value="修改">

</form>
</body>
</html>
