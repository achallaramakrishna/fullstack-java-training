<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Manage Users</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<div class="container mt-5">
    <div class="d-flex justify-content-between align-items-center mb-4">
        <h2>Manage Users</h2>
        <a href="${pageContext.request.contextPath}/users/add" class="btn btn-primary">Add User</a>
    </div>

    <div class="card shadow">
        <div class="card-body">

            <table class="table table-bordered table-hover">
                <thead class="table-dark">
                    <tr>
                        <th>ID</th>
                        <th>Name</th>
                        <th>Email</th>
                        <th>Role</th>
                        <th width="180">Actions</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="user" items="${users}">
                        <tr>
                            <td>${user.id}</td>
                            <td>${user.name}</td>
                            <td>${user.email}</td>
                            <td>${user.role}</td>
                            <td>
                                <a href="${pageContext.request.contextPath}/users/edit?id=${user.id}" class="btn btn-sm btn-warning">Edit</a>
                                <a href="${pageContext.request.contextPath}/users/delete?id=${user.id}"
                                   class="btn btn-sm btn-danger"
                                   onclick="return confirm('Are you sure you want to delete this user?');">
                                   Delete
                                </a>
                            </td>
                        </tr>
                    </c:forEach>

                    <c:if test="${empty users}">
                        <tr>
                            <td colspan="5" class="text-center">No users found</td>
                        </tr>
                    </c:if>
                </tbody>
            </table>

        </div>
    </div>
</div>

</body>
</html>