<html>
<head>
<title>Hello World</title>
</head>

<body>
	<!-- JSP Declarations -->
	<%!int fontSize;%>
<html>
<head>
<title>Exemplo la�o de repeti��o</title>
</head>

<body>
	<!-- Scriptlet -->
	<%
		for (fontSize = 3; fontSize <= 7; fontSize++) {
	%>
	<!-- JSP Expression -->
	<font color="green" size="<%=fontSize%>"> Univel Centro
		Universit�rio </font>
	<br />
	<%
		}
	%>
</body>
</html>
</body>
</html>