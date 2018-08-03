<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>ForT</title>
 <%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort() +"/" +"30_74_8080"
              +path+"/";
%>
</head>
<body>
    <form action="<%=basePath%>card/go"  method="post" >
        <table>
            <tbody>
            <tr><td><a href="<%=basePath%>card/show">回到首页 </a></td></tr>

                <tr>
                    <td>区域：</td>
                    <td>
                        <select name="option" id="se">
                            <option value="1418">兴天园</option>
                            <option value="308">静安体育中心</option>
                            <option selected value="203">中信富泰广场</option>
                            <option value="6254">同心路医院</option>
                            <option value="10849">花园路</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>车型：</td>
                    <td>
                        <select name="carType" id="carType">
                            <option value="0">小车</option>
                            <option value="1">大车</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>电量大于：</td>
                    <td>
                        <input type="number" name="oil" min="40" value="40"/>
                    </td>
                </tr>
                <tr>
                    <td>查询频率：</td>
                    <td>
                        <input type="number" name="querySeq" min="40" value="1000"/>
                    </td>
                </tr>
                <tr>
                    <td>查询时间：</td>
                    <td>
                        <input type="number" name="queryTime" min="1" value="30"/>
                    </td>
                </tr>
                <tr><td><input type="submit" value="提交"></td></tr>

                <c:forEach items="${querys}" var="query">
                    <tr>
                        <td>
                            查询区域：${query.option}
                        </td>
                        <td>
                            查询车型：${query.carType}
                        </td>
                        <td>
                            开始时间：${query.startDate}
                        </td>
                        <td>
                            查询时间：${query.queryTime}分
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </form>
    <table>

    </table>
</body>
</html>
