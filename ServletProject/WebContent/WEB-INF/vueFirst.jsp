<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="SecondServlet">
		Nom : <input type=text name=nom> <br/>
		Prenom : <input type=text name=prenom> <br/>
		Age : <input type=text name=age min=0 max=150> <br/>
		<button type=submit> Add </button>
	</form>

</body>
</html>