<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Show</title>
<link rel="stylesheet" type="text/css" href="${f:url('/css/scaffolds.css')}">
</head>
<body>
<h1>Show post</h1>

<p>
	<b>Name:</b>${name }
</p>

<p>
	<b>Title:</b>${title }
</p>

<p>
	<b>Content:</b>${content }
</p>

<br/>

<a href="${pageContext.request.contextPath}/posts/${id}/edit">Edit</a>
|
<a href="${pageContext.request.contextPath}/posts">Back</a>
</body>
</html>
