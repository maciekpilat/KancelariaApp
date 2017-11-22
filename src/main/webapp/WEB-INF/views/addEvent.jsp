<%-- 
    Document   : addEvent
    Created on : 2017-10-19, 13:51:40
    Author     : Pilat
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <form action="response.jsp">
            <strong>Select type of event:</strong>

            <select name="eventType">
                <c:forEach var="eventTypeList" items="${etdi.getAllEventType()}">
                    <option value="${eventTypeList.event_type_name}"></option>
                </c:forEach>

            </select>

        </form>

        <br><br>
        <input type="submit">
    </form>       
</body>
</html>
