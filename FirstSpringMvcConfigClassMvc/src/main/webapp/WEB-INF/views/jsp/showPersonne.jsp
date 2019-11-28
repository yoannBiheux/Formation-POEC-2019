<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<title>List of Personnes</title>
	</head>
	<body>
	<h1>One person (Private access)</h1>
	<table>
	<tr>
	<td> <b>Nom</b></td><td> <i>Prenom</i></td>
	</tr>
	<tr>
	<td> <c:out value="${ personne['nom']}" /> </td>
	<td> <c:out value="${ personne['prenom'] }" /> </td>
	</tr>
	</table>
	</body>
</html>