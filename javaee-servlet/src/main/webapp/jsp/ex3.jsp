<%@page import="java.util.Enumeration"%>
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
	<h2>HTTP Header Request Example</h2>

	<table width="100%" border="1" align="center">
		<tr bgcolor="#949494">
			<th>Header Name</th>
			<th>Header Value(s)</th>
		</tr>
		<%
			Enumeration headerNames = request.getHeaderNames();
			while (headerNames.hasMoreElements()) {
				String paramName = (String) headerNames.nextElement();
				out.print("<tr><td>" + paramName + "</td>\n");
				String paramValue = request.getHeader(paramName);
				out.println("<td> " + paramValue + "</td></tr>\n");
			}
		%>
	</table>
</body>
</html>
</body>
</html>