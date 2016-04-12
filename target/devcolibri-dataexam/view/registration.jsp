<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="input" uri="http://www.springframework.org/tags/form" %>

<%--
  Created by IntelliJ IDEA.
  User: dima
  Date: 3/6/16
  Time: 11:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" session="true"  %>
<html>
<head>
    <title>Registration</title>
</head>
<body>

<h1>Form</h1>
<<h1>Sign Up</h1>

<form:form method="post" action="addUser">
    <table>
        <tr>
            Login:<td><input type="text" name="login" /></td>
        </tr>

        <tr>
           Password <td><input type="text" name="password" /></td>
        </tr>

        <tr>
          Confirm Password  <td><input type="text" name="password" /></td>
        </tr>

        <tr>
            <td colspan="3"><input type="submit" value="Registration" /></td>
        </tr>
    </table>
</form:form>

</body>
</html>
