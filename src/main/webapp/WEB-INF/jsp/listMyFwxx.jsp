<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="/common/head.jsp"%>
    <script>
        function mydel(id) {
            var a=confirm("您确定要删除吗？");
            if(a==true){
                location.href="fwxxController/del?fwbh="+id;
            }
        }
    </script>
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
        <td width="172" valign="top" align="center">
            <p>&nbsp;</p>
           <%@include file="../../common/myHref.jsp"%>
        </td>
        <td width="35" background="images/layout_24.gif">&nbsp;</td>
        <td width="495" align="center">
            <table>
                <tr>
                    <td width="3%">&nbsp;</td>
                    <td width="97%">
                        <table style="width: 450px;">
                            <tr>
                                <td style="width: 280px;">标题</td>
                                <td style="width: 100px;" align='center'>月租金</td>
                                <td style="width: 100px;" align='center'>发布日期</td>
                                <td style="width: 50px;">&nbsp;</td>
                                <td style="width: 50px;">&nbsp;</td>
                            </tr>
                            <tr>
                                <td colspan='5'><hr/></td>
                            </tr>
                            <c:forEach items="${fwxxList}" var="v">
                            <tr>
                                <td><a href='fwxxController/load?fwbh=${v.fwbh}'>${v.bt}</a></td>
                                <td align='center' style='height:30px;'>${v.zj}元</td>
                                <td align='center'><fmt:formatDate value="${v.fbrq}" pattern="yyyy-MM-dd"/></td>
                                <td align='center' style='height:30px;'><a href='javascript:mydel(${v.fwbh})'>[删除]</a></td>
                                <td align='center' style='height:30px;'><a href='fwxxController/toEditFwxx?fwbh=${v.fwbh}'>[修改]</a></td>
                            </tr>
                            </c:forEach>
                            <tr>
                                <td colspan='5'><hr/></td>
                            </tr>
                        </table>
                    </td>
                </tr>
                <tr>
                    <td colspan="2"></td>
                </tr>
            </table>
            <m:page pageBean="${pageBean}"/>
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
