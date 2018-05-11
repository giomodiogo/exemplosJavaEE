<html>
<head>
<title>Hello World</title>
</head>

<body>
	Hello World!
	<!-- Scriptlet -->
	<br />
	<%
		out.println("<label>Forma 1: IP</label> " + request.getRemoteAddr());
	%>

	<br />
	<jsp:scriptlet>out.println("Forma 2: IP " + request.getRemoteAddr());</jsp:scriptlet>

	<br />
	<%
		System.out.println("Server side");
	%>
	<br />
	<!-- JSP Declarations -->
	<%!String univel = "Centro";%>
	<%!String universitario = "Universitário Univel";%>
	<%
		out.println(univel + "  " + universitario);
	%>

	<br />
	<!-- JSP Expression -->
	<%!String dataHoje = (new java.util.Date()).toLocaleString();%>
	<p>
		Data de hoje:
		<%=dataHoje%>
	</p>

</body>
</html>