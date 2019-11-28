<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Liste de Personne</title>
</head>
<body>
<table>
	<tr>
		<td> <b>Nom</b></td>
		<td> <b>Prenom</b></td>
	</tr>
	<c:forEach items="${ personnes }" var = "elt">
		<tr>
			<td> <c:out value="${ elt['nom']}" /> </td>
			<td> <c:out value="${ elt['prenom'] }" /> </td>
		</tr>
	</c:forEach>
</table>
</body>
</html>