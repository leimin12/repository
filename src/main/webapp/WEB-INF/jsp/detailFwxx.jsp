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
        <td width="172" valign="top" align="center">
            <p>&nbsp;</p>
            <%@include file="/common/myHref.jsp"%>
        </td>
        <td width="35" background="images/layout_24.gif">&nbsp;</td>
        <td width="495" align="center">
            <table width="450">
                <tr>
                    <td id=listTitle>${f.bt}</td>
                </tr>
                <tr>
                    <td id=listTitle2><hr/></td>
                </tr>
                <tr>
                    <td><strong>地址：</strong>${f.dz}</td>
                </tr>
                <tr>
                    <td><strong>租金：</strong>${f.zj}</td>
                </tr>
                <tr>
                    <td><strong>联系人：</strong>${f.lxr}</td>
                </tr>
                <tr>
                    <td><strong>联系电话：</strong>${f.lxdh}</td>
                </tr>
                <tr>
                    <td><strong>房屋类型：</strong>
                        <c:if test="${f.lxbh==1}">1室1厅</c:if>
                        <c:if test="${f.lxbh==2}">2室1厅</c:if>
                        <c:if test="${f.lxbh==3}">2室2厅</c:if>
                        <c:if test="${f.lxbh==4}">3室1厅</c:if>
                        <c:if test="${f.lxbh==5}">3室2厅</c:if>
                        </td>
                </tr>
                <tr>
                    <td>
                        <strong>装修情况：</strong>
                        <c:if test="${f.zxqk==1}">毛坯房</c:if>
                        <c:if test="${f.zxqk==2}">简单装修</c:if>
                        <c:if test="${f.zxqk==3}">精装修</c:if>
                        <c:if test="${f.zxqk==4}">豪华装修</c:if>
                    </td>
                </tr>
                <tr>
                    <td><strong>所在楼层：</strong>
                        <c:if test="${f.szlc==1}">一层</c:if>
                        <c:if test="${f.szlc==2}">二层</c:if>
                        <c:if test="${f.szlc==3}">三层</c:if>
                        <c:if test="${f.szlc==4}">四层~六层</c:if>
                        <c:if test="${f.szlc==5}">七层~以上</c:if>
                    </td>
                </tr>
                <tr>
                    <td>
                        <strong>房屋朝向：</strong>
                        <c:if test="${f.fwcx==1}">东</c:if>
                        <c:if test="${f.fwcx==2}">南</c:if>
                        <c:if test="${f.fwcx==3}">西</c:if>
                        <c:if test="${f.fwcx==4}">北</c:if>
                        <c:if test="${f.fwcx==5}">东西</c:if>
                        <c:if test="${f.fwcx==6}">南北</c:if>
                    </td>
                </tr>
                <tr>
                    <td><strong>发布时间：</strong> <fmt:formatDate value="${f.fbrq}" pattern="yyyy-MM-dd"/></td>
                </tr>
                <tr>
                    <td><hr></td>
                </tr>
                <tr>
                    <td>
                        <!-- 文本域中的内容是有格式的，必须要用pre标签 -->
                        <pre>${f.bz}</pre>
                    </td>
                </tr>
                <tr>
                    <td><input type="button" value="后退" class="btn" onclick="javascript:history.back();"></td>
                </tr>
            </table>
        </td>
        <td width="40" background="images/middle4.jpg">&nbsp;</td>
    </tr>
    <tr>
        <td colspan="5"><img src="images/bottom.jpg" width="780" height="82"></td>
    </tr>
</table>
<P align="center">2007 Beijing Aptech Beida Jade Bird Information Technology Co.,Ltd 版权所有</P>
<br/>
</BODY>
</html>
