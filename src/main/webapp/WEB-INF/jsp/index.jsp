<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="/common/head.jsp"%>
    <script>
        function doSwitch(id){
            var o = document.getElementById(id);
            if (o){
                if (o.style.display == "none"){ o.style.display = "block"; } else {o.style.display = "none";}
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
            <%@include file="/common/myHref.jsp"%>
        </td>
        <td width="35" background="images/layout_24.gif">&nbsp;</td>
        <td width="495" align="center"><br/>
            <form action="fwxxController/list" method="post">
                <div style="text-align:left;width:88%;">
                    <input name="bt" value="" type="text">
                    <input type="submit" value="查询" class="btn">&nbsp;<span onclick="doSwitch('advSearch');" style="cursor:hand;color:blue;">高级搜索</span>
                </div>
                <table width="100%;" id="advSearch" style="border:solid 0px #000;display:none;">
                    <tr>
                        <td>房屋类型：</td>
                        <td>
                            <select name="lxbh" style='width:80px;'><option value=''>--请选择--</option><option value='1'>1室1厅</option><option value='2'>2室1厅</option><option value='3'>2室2厅</option><option value='4'>3室1厅</option><option value='5'>3室2厅</option></select>
                        </td>
                    </tr>
                    <tr>
                        <td>租金：</td>
                        <td><input name="money1" type="text" style="width:80px;">至<input name="money2" type="text" style="width:80px;">元/月</td>
                    </tr>
                    <tr>
                        <td colspan='3'><hr/></td>
                    </tr>
                </table>
            </form>
                <table width="88%" cellspacing="0">
                    <tr>
                        <td width='250' class="table_title">标题</td>
                        <td width='90' align='center' class="table_title">月租金</td>
                        <td align='center' class="table_title">发布日期</td>
                    </tr>
                    <%--<c:if test="${fwxxList==null}">
                        <jsp:forward page="/fwxxController/list"/>
                    </c:if>--%>
                    <c:forEach items="${fwxxList}" var="v">
                        <tr>
                            <td><a href='fwxxController/load?fwbh=${v.fwbh}'>${v.bt}</a></td>
                            <td align='center' style='height:30px;'>${v.zj}元</td>
                            <td align='center'><fmt:formatDate value="${v.fbrq}" pattern="yyyy-MM-dd"/></td>
                        </tr>
                    </c:forEach>
                    <tr>
                        <td colspan='3'><hr/></td>
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
