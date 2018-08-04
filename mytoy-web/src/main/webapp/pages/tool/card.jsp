<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <meta charset="utf-8">
    <title>ChartTestDemo</title>
    <script src="../../js/jquery/jquery-3.3.1.js"></script>
    <script type="text/javascript">
        var phoneWidth =  parseInt(window.screen.width);
        var phoneScale = phoneWidth/640;
        var ua = navigator.userAgent;
        if (/Android (\d+\.\d+)/.test(ua)){
            var version = parseFloat(RegExp.$1);
            if(version>2.3){
                document.write('<meta name="viewport" content="width=640, minimum-scale = '+phoneScale+', maximum-scale = '+phoneScale+', target-densitydpi=device-dpi">');
            }else{
                document.write('<meta name="viewport" content="width=640, target-densitydpi=device-dpi">');
            }
        } else {
            document.write('<meta name="viewport" content="width=640, user-scalable=no, target-densitydpi=device-dpi">');
        }
    </script>

    <style>
        th
        {
            text-align:left;
            font-size: 15px;
        }
        .show td
        {
            text-align:left;
            font-size: 30px;
        }
        select
        {
            width: 180px;
            height: 40px;
            font-size: 22px;

        }
        input{
            font-size: 27px;
        }
    </style>

    <title>ForT</title>
 <%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort() +"/" +"30_74_8080"
              +path+"/";
%>
</head>
<body>
    <form action="<%=basePath%>card/go"  method="post" >
        <table cellpadding="0" cellspacing="0" width="100%" height="50%" style="font-size:30px;">
            <tbody >
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
                        <input type="number" name="queryTime" min="1" value="120"/>
                    </td>
                </tr>
                <tr align="center"><td colspan="2"><input type="submit" style="width: 200px;height: 50px;font-size: 30px" value="提交"></td></tr>
            </tbody>
        </table>
        <table id="show" cellpadding="0" cellspacing="0" width="90%" height="10%" style="font-size:15px;">
            <thead>
                <th>查询区域</th>
                <th>查询车型</th>
                <th>开始时间</th>
                <th>查询时间</th>
            </thead>
            <tbody >
            <c:forEach items="${querys}" var="query">
                <tr>
                    <td>
                        ${query.option}
                    </td>
                    <td>
                        ${query.carType}
                    </td>
                    <td>
                       ${query.strStartDate}
                    </td>
                    <td>
                        ${query.queryTime}分
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>


    </form>
    <table>

    </table>
</body>


<script type="text/javascript">
    var phoneWidth =  parseInt(window.screen.width);
    var phoneScale = phoneWidth/640;
    var ua = navigator.userAgent;
    if (/Android (\d+\.\d+)/.test(ua)){
        var version = parseFloat(RegExp.$1);
        if(version>2.3){
            document.write('<meta name="viewport" content="width=640, minimum-scale = '+phoneScale+', maximum-scale = '+phoneScale+', target-densitydpi=device-dpi">');
        }else{
            document.write('<meta name="viewport" content="width=640, target-densitydpi=device-dpi">');
        }
    } else {
        document.write('<meta name="viewport" content="width=640, user-scalable=no, target-densitydpi=device-dpi">');
    }
</script>

</html>
