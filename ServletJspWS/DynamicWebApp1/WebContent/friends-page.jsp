<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>

<%@page import="java.util.List"%>
<jsp:include page="header.jsp" />
<h3>Friends Page</h3>
<form action="friends">
	<input type="text" name="fnm" placeholder="Your friend's name please" />
	<button>SEND</button>
</form>

<c:if test="${flist != null}">
	<ol>
		<c:forEach var="f" items="${flist }">
			<li>${f }</li> 
		</c:forEach>
	</ol>
</c:if>

<c:if test="${flist2 != null}">
	<ol>
		<c:forEach var="f" items="${flist2 }">
			<li>${f }</li> 
		</c:forEach>
	</ol>
</c:if>

<c:if test="${flist3 != null}">
	<ol>
		<c:forEach var="f" items="${flist3 }">
			<li>${f }</li> 
		</c:forEach>
	</ol>
</c:if>
 
<jsp:include page="footer.jsp" />
