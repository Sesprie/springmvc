<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<body>


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
<a href="/requestmapping/testAntPath/a/b/c/hello">测试带通配符的路径</a>
<br>
<a href="/requestmapping/testPathVariable/11">测试Restful风格的路径、PathVariable</a>
<br>
<a href="/testRequestParam?username=zhang&age=1">测试@RequestParam</a>
<br>
<a href="/testRequestHeader">测试@RequestHeader</a>
<br>
<br>
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



</body>
</html>
