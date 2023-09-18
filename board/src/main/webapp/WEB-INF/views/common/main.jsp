<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>main Page</title>
</head>
<body>
	<h1>main</h1>
	
	 <div id="boardmenu">
    <ul>
        <li><a href="<c:url value='/'/>">home</a></li>
        <li><a href="<c:url value='/board/list'/>">board</a></li>
        <li><a href="<c:url value='/'/>">login</a></li>
    </ul>
</div>

</body>
</html>