<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ page  import="org.springframework.web.servlet.DispatcherServlet" %>
    <%@ page  import="org.springframework.web.context.WebApplicationContext" %>

<html>
<head>
    <title>ForT</title>
 <%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()
              +path+"/";
%>
</head>
<body>

    <form action="<%=basePath%>forlt/show "  method="post" >
        <table>
            <tbody>
                <tr>
                    <td>城市</td>
                        <td><input name="region"  value="${region}" /></td>
                    <td>内容</td>
                         <td><input name="query"  value="${query}"  /></td>
                    <td><input type="submit"  value="查询"  /></td>
                </tr>
            </tbody>
        </table>
    </form>

    <table>
        <th>
            <tr>
                <td>名称</td>
                <td>地址</td>
                <td>电话</td>
            </tr>
        </th>
        <tbody>
            <c:forEach items="${resluts}" var="result" >
                <tr>
                <td>${result.name}</td>
                <td>${result.addr}</td>
                <td>${result.telephone}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
