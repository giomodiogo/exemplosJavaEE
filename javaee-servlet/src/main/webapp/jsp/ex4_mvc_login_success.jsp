
<%@page import="com.javaee.bean.LoginBean"%>
<html>
<head>
<title>Login</title>
</head>

<body>
	<p>Você está logado!</p>
	<%
		LoginBean bean = (LoginBean) request.getAttribute("bean");
		out.print("Bem vindo, " + bean.getName());
	%>
</body>
</html>