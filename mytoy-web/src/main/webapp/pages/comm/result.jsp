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
        <h1>${result}</h1>
        <h1>${message}</h1>
</body>
</html>
