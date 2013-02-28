<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Create</title>
<link rel="stylesheet" type="text/css" href="${f:url('/css/scaffolds.css')}">
</head>
<body>
<h1>New post</h1>

<html:errors/>
<s:form>
	<%@ include file="_post.jspf" %>
 	<div class="actions">
		<input name="save"  type="submit" value="Create Post" />
	</div>
</s:form>

<a href="${pageContext.request.contextPath }/posts">Back</a>

</body>
</html>