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
<h1>Editing post</h1>

<html:errors/>
<s:form>
    <html:hidden property="id"/>
	<%@ include file="_post.jspf" %>
  <div class="actions">
    <input name="update" type="submit" value="Update Post" />
  </div>
</s:form>

</body>
</html>
