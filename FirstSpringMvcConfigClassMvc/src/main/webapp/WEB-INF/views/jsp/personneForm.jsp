<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Formulaire Personne</title>
	<style>
		.error{color: red;}
	</style>
	</head>
	<body>
		Bonjour ${ perso.nom }
		<form:form modelAttribute="personne" action="personne" method="post">
			<form:label path="nom">nom</form:label>
			<form:input path="nom"/>
			<form:errors path="nom" cssClass ="error"/>
			<form:label path="prenom">prenom</form:label>
			<form:input path="prenom" />
			<form:errors path="prenom" cssClass ="error"/>
			<input type="submit" value="Ajouter"/>
		</form:form>
		<a href="deconnect" > déconnexion </a>
</body>
</html>
