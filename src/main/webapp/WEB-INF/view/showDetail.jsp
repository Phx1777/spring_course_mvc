<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>
<font color="#ffba27">
<h2> Welcome ${employee.name} ${employee.surname}</h2>
</font>
<br>
<font color="#8a2be2">
Employee information
</font>
<br><br>

<font color="#00008b">
Name: ${employee.name}
<br>
Surname: ${employee.surname}
<br>
Salary: ${employee.salary}
<br>
Department: ${employee.department}
<br>
Car: ${employee.carBrand}
<br>
Language(s):
<ul>
    <c:forEach var="lang" items="${employee.languages}">
        <li>${lang}</li>
    </c:forEach>
</ul>
Phone number: ${employee.phoneNumber}
<br>
email: ${employee.email}
</font>

</body>
</html>