<c:import url="file:C:\Users\formation\eclipse-workspace\FirstJEEProject/personnes.xml" var="personnes" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test taglib</title>
</head>
<body>
	<c:out value="Hello World" /><br>
	
	<c:out value="${1 lt 3 and 2 > 1 }" /><br>
	<c:out value="${JEE}" default = "JSTL"/><br> <%--Affiche le contenu de la variable JEE si elle existe, sinon affiche JSTL--%>
	<c:out value="${JEE}" > JSTL </c:out><br>
	<c:out value="<p> Bonjour 'John Wick'. </p>" /><%--affiche <p> Bonjour ’John Wick’. </p>--%>
	<c:out value="<p> Bonjour 'yoann biheux'. </p>" escapeXml="false" />
	<c:set var="JEE" value="J'aime la plateforme JEE" scope="request" />
	<c:out value="${JEE}" > JSTL </c:out>
<%-- 	<c:set scope="session" var="p" value="${perso}" /> --%>
<%-- 	<br> personne avant modification :<c:out value="${p.nom } ${p.prenom }"/> --%>
<%-- 	<c:set target="${perso}" property="nom" value="Travolta" /> --%>
	<%-- l’objet p aura comme nouveau nom Travolta --%>
	<%--<br> personne apres modification :<c:out value="${p.nom} ${p.prenom}" />--%>
	<%-- affiche Travolta John --%>
	<c:remove var="JEE" />supprime la variable JEE
	<br><c:if test="${ 3 > 2 and 2 > 1 }" var="result" scope="session" >
		<c:out value = "${ result }" />
	</c:if>
<%-- 	<%-- affiche c’est facile car la condition est vraie--%> 
<!-- 	<br> -->
<%-- 	<c:forEach var = "i" begin = "0" end = "10" step = "1"> --%>
<%-- 		<c:out value = "${ i }"/><br> --%>
<%-- 	</c:forEach> --%>
<!-- 	<p> -->
<%-- 		<c:forEach items="${sport}" var="element" varStatus="status"> --%>
<%-- 			Element n : <c:out value="${status.count}"/> --%>
<%-- 			valeur <c:out value="${element}" /> --%>
<%-- 		</c:forEach> --%>
		
<!-- 	</p> -->
 	<p>

 		<c:forEach items="${persos}" var="element" varStatus="status">  
 			<br>Element n : <c:out value="${status.count}"/> 
 			valeur <c:out value="${element['nom']} ${element['prenom']}" />  
 		</c:forEach> 
		
	</p>	
<!-- 	<p> -->
<%-- 		<c:forTokens var="sousChaine" items="bonjour, c'est John;Wick" delims=";, "> --%>
<%-- 			${sousChaine}<br/> --%>
<%-- 		</c:forTokens> --%>
<!-- 	</p> -->
<%-- <%-- 	<c:url value="/mapage" var="monLien" /> --%> 
<%-- <%-- 	<a href="${monLien}">lien</a> --%> 
	
<%-- 	<c:url value="/mapage" var="monLien2"> --%> 
 <%-- 		<c:param name="nom" value="tutu"/> --%> 
 <%-- 		<c:param name="prenom" value="toto"/> --%> 
<%-- 	</c:url> --%>
 <%-- 	<a href="${monLien2}">lien2</a> --%>
 		<br>
 		${fn:length("chaine")}
		<%-- Retourne 6 --%>
		<br>
		<c:set var = "montant" value = "112233.44" />
		montant = <fmt:formatNumber value = "${ montant }" type="currency" currencySymbol="$" maxIntegerDigits="3"/>
		<br>
		<jsp:useBean id = "now" class="java.util.Date" />
		Aujourd'hui, c'est le <fmt:formatDate value = "${now }" type="date" dateStyle="short"/>
		Aujourd'hui, c'est le <fmt:formatDate value = "${now }" type="date" dateStyle="long"/>
		
		<p>
			<x:parse xml="${personnes}" var="list" />
			<x:set var="personne" select="$list/personnes/personne[@id=3]" />
			nom = <x:out select="$personne/nom"/>
		</p>
		
</body>
</html>