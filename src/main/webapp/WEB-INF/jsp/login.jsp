<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@include file="/common/head.jsp"%>
</head>
<body>
        <br>
        <h1>登陆</h1>
        ${message}

            <f:form action="yhController/login" modelAttribute="yh">
                <f:errors path="*"/><br>
                <f:input path="yhzh" /><f:errors path="yhzh"/><br>
                <f:input path="yhmm"/><f:errors path="yhmm"/><br>
                <input type="submit" value="ok">
            </f:form>
        <a href="yhController/toReg">注册用户</a>
</body>
</html>
