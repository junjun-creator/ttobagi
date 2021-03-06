<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><tiles:getAsString name="title" /></title>

<link rel="stylesheet" href="/css/reset.css">
<link rel="stylesheet" href="/css/layout.css">

<link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Poor+Story&display=swap" rel="stylesheet">
<script src="https://use.fontawesome.com/releases/v5.2.0/js/all.js"></script>


</head>
<body>
	<!-- header 부분 -->
	<tiles:insertAttribute name="header" />
 
	<!-- visual 부분 -->
 	<tiles:insertAttribute name="visual" />
 	
    <!-- --------------------------- <body> --------------------------------------- -->
	  	
	<tiles:insertAttribute name="main" />


    <!-- ------------------- <footer> --------------------------------------- -->
	<tiles:insertAttribute name="footer" />
	
</body>
</html>