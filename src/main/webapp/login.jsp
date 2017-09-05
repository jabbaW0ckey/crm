<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

    <head>

        <title>登录</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <meta name="description" content=""/>
        <meta name="author" content=""/>

        <!-- CSS -->
        <link rel="stylesheet" href="assets/css/reset.css"/>
        <link rel="stylesheet" href="assets/css/supersized.css"/>
        <link rel="stylesheet" href="assets/css/style.css"/>

         <!-- Javascript -->
        <script src="js/jquery-1.8.3.js" ></script>
        <script src="assets/js/supersized.3.2.7.min.js" ></script>
        <script src="assets/js/supersized-init.js" ></script>
        <script src="assets/js/scripts.js" ></script>
    </head>

    <body>

        <div class="page-container">
            <h1>用户登录</h1>
            <s:form action="user_login.action" name="form1" method="post" theme="simple">
                <input type="text" name="username" class="username" placeholder="请输入您的用户名！"/>
                <input type="password" name="password" class="password" placeholder="请输入您的用户密码！"/>
                <button type="submit" class="submit_button">登录</button>
                <div class="error"><span id="err" style="color:red;">+</span></div>
            </s:form>
        </div>
        
    </body>

</html>

