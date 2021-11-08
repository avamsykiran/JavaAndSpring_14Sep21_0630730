
<%@page import="java.util.List"%>
<jsp:include page="header.jsp" />
<h3>Friends Page</h3>
<form action="friends">
	<input type="text" name="fnm" placeholder="Your friend's name please" />
	<button>SEND</button>
</form>

<% List<String> friends = (List<String>) request.getAttribute("flist"); %>
<% if (friends != null) {  %>
	<ol>
		<% for(String f : friends) { %>
			<li><%=f %></li>
		<%} %>
	</ol>
<% } %>

<% List<String> friends2 = (List<String>) session.getAttribute("flist2"); %>
<% if (friends2 != null) {  %>
	<ol>
		<% for(String f : friends2) { %>
			<li><%=f %></li>
		<%} %>
	</ol>
<% } %>

<% List<String> friends3 = (List<String>) application.getAttribute("flist3"); %>
<% if (friends3 != null) {  %>
	<ol>
		<% for(String f : friends3) { %>
			<li><%=f %></li>
		<%} %>
	</ol>
<% } %>
<jsp:include page="footer.jsp" />
