
<jsp:include page="header.jsp" />
<h3>Greet Page</h3>
<form action="greet">
	<input type="text" name="unm" placeholder="Your name please" />
	<button>SEND</button>
</form>

<%
String msg = (String) request.getAttribute("msg");
if (msg != null) {
	out.println(String.format("<hr /><p><strong>%s</strong></p>",msg));
}
%>
<jsp:include page="footer.jsp" />
