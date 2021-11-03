<%@page import="java.time.LocalDateTime"%>
<%! LocalDateTime dt = LocalDateTime.now(); %>
	
<jsp:include page="header.jsp" />
		<h1>This is my first jsp page</h1>
	
		<h3><%=dt%></h3>
		<div>
			<%for(int i=1;i<=100;i++) { %>
				<span>RAMA </span>
			<%} %>
		</div>
<jsp:include page="footer.jsp" />	