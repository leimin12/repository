<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="/common/head.jsp"%>
</head>
<BODY BGCOLOR=#FFFFFF LEFTMARGIN=0 TOPMARGIN=0 MARGINWIDTH=0 MARGINHEIGHT=0>
<table width="780" border="0" align="center" cellpadding="0" cellspacing="0">
    <tr>
        <td colspan="5"><img src="images/top.jpg" width="780" height="213"></td>
    </tr>
    <tr>
        <td colspan="5"><img src="images/middle1.jpg" width="780" height="47"></td>
    </tr>
    <tr>
        <td width="38" background="images/middle2.jpg">&nbsp;</td>
        <td width="172">
            <table align="center">
                <tr>
                    <td><a href="fwxxController/list">返回首页</a></td>
                </tr>
            </table>
        </td>
        <td width="35" background="images/layout_24.gif">&nbsp;</td>
        <td width="495">
            <f:form action="yhController/add" method="post" modelAttribute="yh">
                <table align="center">
                    <tr>
                        <td>用户注册：</td>
                        <td></td>
                    </tr>
                    <tr>
                        <td colspan="2"><hr/></td>
                    </tr>
                    <tr>
                        <td>帐号：</td>
                        <td><f:input path="yhzh" type="text" style="width:180px;"/><f:errors path="yhzh"/></td>
                    </tr>
                    <tr>
                        <td>密码：</td>
                        <td><f:input path="yhmm" type="password" style="width:180px;"/><f:errors path="yhmm"/></td>
                    </tr>
                    <tr>
                        <td>姓名：</td>
                        <td><f:input path="uname" type="text" style="width:180px;"/><f:errors path="uname"/></td>
                    </tr>
                    <tr>
                        <td>确认密码：</td>
                        <td><input type="password" style="width:180px;"></td>
                    </tr>
                    <tr>
                        <td colspan="2" align="center">
                            <input type="submit" value="注册" class="btn">&nbsp;&nbsp;
                            <input type="reset" value="重置" class="btn">
                        </td>
                    </tr>
                </table>
            </f:form>
        </td>
        <td width="40" background="images/middle4.jpg">&nbsp;</td>
    </tr>
    <tr>
        <td colspan="5"><img src="images/bottom.jpg" width="780" height="82"></td>
    </tr>
</table>
<P align="center">2007 Beijing Aptech Beida Jade Bird Information Technology Co.,Ltd 版权所有</P>
<br/>
</body>
</html>
