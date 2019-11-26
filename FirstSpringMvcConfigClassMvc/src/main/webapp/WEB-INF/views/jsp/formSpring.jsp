<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulaire Personne Sexe</title>
</head>
<body>
	homme : <form:radiobutton path="genre" value="homme"/>
	femme : <form:radiobutton path="genre" value="femme"/>
</body>
</html>