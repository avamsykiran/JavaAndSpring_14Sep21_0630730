<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>

<jsp:include page="/header" />
<div class="container-fluid p-4">
	<h5>Greet Page</h5>
	<form>
		<input type="text" name="unm" placeholder="Your name please" />
		<button class="btn btn-sm btn-primary">SEND</button>
	</form>
	
	<c:if test="${greeting!=null }">
		<div class="alert alert-info p-2 m-2">
			<p><strong>${greeting }</strong></p>
		</div>
	</c:if>
</div>
<jsp:include page="/footer" />