<%@ page import="org.apache.jasper.tagplugins.jstl.core.Out"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  errorPage="Erreur.jsp"%>
    <%@ page import = "org.eclipse.model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Projet JEE</title>
</head>
<body>
	<h1>Hello world depuis JSP</h1>
	Tutut ${param.prenom} ${param.nom}
	<br>
	<%
// 	Personne p = (Personne) request.getAttribute("perso");
// 	out.print("Hello " + p.getPrenom() + " " + p.getNom());

	int x=3/0;

	
		
	%>
	<br>
<%-- 	${ true && true || false }<br> --%>
<%-- 	${ 'e' < 'f '}<br> --%>
<%-- 	${ 5 + 5 == 25 }<br> --%>
<%-- 	${ empty 'chaine' }<br> --%>
<%-- 	${ !empty 'chaine' }<br> --%>
<%-- 	${ !empty 'chaine' ? true : false }<br> --%>
<%-- 	${ 4 * 3 + 5 } <br> --%>
<%-- 	${ 8 % 2 } <br> --%>
<!-- 	<div> 7 < 5 : ${ 7 < 5 } </div> -->
<!-- 	<div> 7 < 5 : false </div> -->
	J’aime le ${ sport.get(0) } et le ${ sport[3] }.
	Je deteste le ${ sport['1'] } et le ${ sport["3"] }.
	
</body>
</html>