<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" language="java" %>
<%--<%request.setCharacterEncoding("UTF-8");%>--%>

<html>
<head>
    <meta charset="UTF-8">
    <title>Запрос данных</title>
</head>
<body>
<h2>Введите свои данные</h2>
<br>
<%--    <form action="showDetails" method="get">--%>
<%--        <input type="text" name="employeeName"--%>
<%--        placeholder="Введите ваше имя"/>--%>

<%--        <input type="submit" value="Кнопка >>>">--%>
<%--    </form>--%>

<form:form action="showDetails" modelAttribute="employee">

    Имя <form:input path="name" placeholder="введите имя" /> <form:errors path="name"/>
    <br><br>

    Фамилиё <form:input path="surname" placeholder="введите фамилию"/> <form:errors path="surname"/>
    <br><br>

    Зряплата <form:input path="salary"/> <form:errors path="salary"/>
    <br><br>

    Отдел <form:select path="department">
        <form:options items="${employee.departments}"/>
    </form:select>
    <br><br>

    Автомобиль <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>
    <br><br>

    Язык(и)
<%--    Английский <form:checkbox path="languages" value="English"/>--%>
<%--    Немецкий <form:checkbox path="languages" value="Deutch"/>--%>
<%--    Французский <form:checkbox path="languages" value="French"/>--%>
    <form:checkboxes path="languages" items="${employee.langList}"/>
    <br><br>

    Телефон <form:input path="phoneNumber" placeholder="введите телефон" /> <form:errors path="phoneNumber"/>
    <br><br>

    Эл. пошта <form:input path="email" placeholder="введите e-mail" /> <form:errors path="email"/>
    <br><br>

    <input type="submit" value="Пульнуть >>>">


</form:form>


</body>
</html>
