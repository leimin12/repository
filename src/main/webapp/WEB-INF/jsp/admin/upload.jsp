<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="/common/head.jsp"%>
    <script>
        function myf() {
             var myElement = document.createElement('input');
             myElement.type = "file";
             myElement.name = "mf";
             document.getElementById("div1").appendChild(myElement);
        }
    </script>
</head>
<BODY>
    <form action="upload" method="post" enctype="multipart/form-data">
       <div id="div1"><input name="mf" type="file" /></div><a href="javascript:myf()">+</a><br>
        <input type="submit" value="ok">
    </form>
</BODY>
</html>
