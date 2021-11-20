<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" language="java" %>
<%--<%request.setCharacterEncoding("UTF-8");%>--%>

<html>
<head>
    <meta charset="UTF-8">
    <title>Отображение данных</title>
</head>
<body>

<h2>Привет!</h2>
<br>

Ваше имя: ${employee.name}
<br>
Ваша фамилия: ${employee.surname}
<br>
Ваша зарплата: ${employee.salary}
<br>
Ваш отдел: ${employee.department}
<br>
Автомобиль: ${employee.carBrand}
<br>
Язык(и):
<ul>
    <c:forEach var="lang" items="${employee.languages}">
        <li> ${lang} </li>
    </c:forEach>
</ul>
<br>
Телефон: ${employee.phoneNumber}
<br>
Почта: ${employee.email}

</body>
</html>
