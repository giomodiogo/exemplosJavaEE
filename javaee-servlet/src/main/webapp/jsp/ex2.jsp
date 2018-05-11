<html>
<head>
<title>Hello World</title>
</head>

<body>
	<!-- JSP Declarations -->
	<%!int fontSize;%>
<html>
<head>
<title>Exemplo laço de repetição</title>
</head>

<body>
	<!-- Scriptlet -->
	<%
		for (fontSize = 3; fontSize <= 7; fontSize++) {
	%>
	<!-- JSP Expression -->
	<font color="green" size="<%=fontSize%>"> Univel Centro
		Universitário </font>
	<br />
	<%
		}
	%>
</body>
</html>
</body>
</html>