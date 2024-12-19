<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>User Details</title>
</head>
<body>
    <h1>User Details</h1>

    <c:choose>
        <c:when test="${not empty userDetails}">
            <p><strong>Name:</strong> ${userDetails.name}</p>
            <p><strong>Email:</strong> ${userDetails.email}</p>
            <!-- Avoid printing the password for security -->
        </c:when>
        <c:otherwise>
            <p>No user details available.</p>
        </c:otherwise>
    </c:choose>
</body>
</html>
