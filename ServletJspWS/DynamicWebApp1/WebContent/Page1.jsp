<%@page import="java.time.LocalDateTime"%>

<html>
	<head>
		<title>First Jsp Page</title>
	</head>
	<body>
		<h1>This is my first jsp page</h1>
		<%! LocalDateTime dt = LocalDateTime.now(); %>
		<h3><%=dt%></h3>
		<div>
			<%for(int i=1;i<=100;i++) { %>
				<span>RAMA </span>
			<%} %>
		</div>
	</body>
</html>