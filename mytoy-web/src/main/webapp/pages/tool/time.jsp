<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
  <head>
    <title>服务器时间</title>
</head> 
<body>
	 
	<fmt:formatDate value="${time}" pattern="yyyy-MM-dd HH:mm:ss"/> 
 
</body>
</html>
