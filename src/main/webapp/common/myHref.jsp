<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script>
    function myf() {
       var a=confirm("您确定要注销吗？");
        if(a==true){
            location.href="exit.jsp";
        }
}
</script>
<c:if test="${sessionScope.Yh==null}">
    <f:form action="yhController/doLogin" method="post">
        <table align="center">
            <tr>
                <td colspan="2">帐号：</td>
            </tr>
            <tr>
                <td colspan="2"><f:input type="text" path="yhzh" style="width: 100px;"/><f:errors path="yhzh"/></td>
            </tr>
            <tr>
                <td colspan="2">密码：</td>
            </tr>
            <tr>
                <td colspan="2"><f:input type="password" path="yhmm" style="width: 100px;"/><f:errors path="yhmm"/></td>
            </tr>
            <tr>
                <td>
                    <input type="submit" value="登陆" class='btn'>
                    <input type="reset" value="重置" class='btn'>
                </td>
            </tr>
            <tr>
                <td><a href="yhController/toReg">注册用户</a></td>
            </tr>
        </table>
    </f:form>
</c:if>
<c:if test="${sessionScope.Yh!=null}">
    <table align="center">
        <tr>
            <td width=''>
                <font color='red'>当前用户：${sessionScope.Yh.yhzh}</font>
            </td>
        </tr>
        <tr>
            <td width='150'><a href="fwxxController/myList">管理我的租房信息</a></td>
        </tr>
        <tr>
            <td width='100'><a href="fwxxController/toAddFwxx">发布租房信息</a></td>
        </tr>
        <tr>
            <td width='100'><a href="fwxxController/list">返回首页</a></td>
        </tr>
        <tr>
            <td width='100'><a href="javascript:myf();">[注销]</a></td>
        </tr>
    </table>
</c:if>
