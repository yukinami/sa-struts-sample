<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Edit</title>
<link rel="stylesheet" type="text/css" href="${f:url('/css/scaffolds.css')}">
</head>
<body>
<h1>Listing posts</h1>

<table>
	<tr>
		<th>Name</th>
    	<th>Title</th>
    	<th>Content</th>
    	<th></th>
    	<th></th>
    	<th></th>
  </tr>
  <c:forEach items="${posts}" var="post">
  	<tr>
  		<td>${post.name }</td>
  		<td>${post.title }</td>
  		<td>${post.content }</td>
  		<td><a href="${post.id}">Show</a></td>
  		<td><a href="${post.id}/edit">Edit</a></td>
  		<td><a href="${post.id}/destroy" onclick="return confirm('Are you sure?')">Destroy</a></td>
  	</tr>
  </c:forEach>
</table>

<a href="create">New post</a>

</body>
</html>
