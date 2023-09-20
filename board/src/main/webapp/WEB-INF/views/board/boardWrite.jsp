<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>boardWrite</title>
</head>
<body>
<h1>게시글 쓰는 페이지</h1>
<form action="enroll" method="post">
    <div class="input_wrap">
        제목
        <input type="text" name="title">
    </div>

    <div class="input_wrap">
        내용
        <input type="text" name="content">
    </div>

    <div class="input_wrap">
        글쓴이
        <input type="text" name="writer">
    </div>
    <button>등록</button>
</form>

</body>
</html>