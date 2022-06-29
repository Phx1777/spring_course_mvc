<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="wl" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<body>
<h2>
    Hello, enter you name
</h2>

<form:form action="/employee/showDetail" modelAttribute="employee" method="post">

    Name <form:input path="name"/>
    <font color="red">
        <form:errors path="name"/>
    </font>

    <br><br>

    Surname <form:input path="surname"/>
    <font color="red">
        <form:errors path="surname"/>
    </font>

    <br><br>

    Salary <form:input path="salary"/>
    <font color="red">
        <form:errors path="salary"/>
    </font>

    <br><br>
    Department <form:select path="department">
    <form:options items="${employee.departments}"/>
</form:select>
    <br><br>
    Which car do you want?
    <br><br>
    <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>
    <br><br>
    What language do you know?
    <br><br>
    <form:checkboxes path="languages" items="${employee.languagesList}"/>
    <br><br>
    Phone number <form:input path="phoneNumber"/>
    <font color="red">
        <form:errors path="phoneNumber"/>
    </font>

    <br><br>
    email <form:input path="email"/>
    <font color="red">
        <form:errors path="email"/>
    </font>

    <br><br>
    <input type="submit" value="OK">
</form:form>
</body>
</html>