<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>${pageTitle}</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        .error-text {
            color: #dc3545;
            font-size: 0.875rem;
            margin-top: 4px;
        }
    </style>
</head>
<body class="bg-light">

<div class="container mt-5">
    <div class="row justify-content-center">
        <div class="col-md-7 col-lg-6">

            <div class="card shadow">
                <div class="card-header bg-primary text-white text-center">
                    <h4 class="mb-0">${pageTitle}</h4>
                </div>

                <div class="card-body">

                    <form:form action="${pageContext.request.contextPath}/users/${formAction}" method="post" modelAttribute="user">

                        <form:hidden path="id"/>

                        <div class="mb-3">
                            <label class="form-label">Name</label>
                            <form:input path="name" cssClass="form-control" placeholder="Enter name"/>
                            <form:errors path="name" cssClass="error-text"/>
                        </div>

                        <div class="mb-3">
                            <label class="form-label">Email</label>
                            <form:input path="email" cssClass="form-control" placeholder="Enter email"/>
                            <form:errors path="email" cssClass="error-text"/>
                        </div>

                        <div class="mb-3">
                            <label class="form-label">Role</label>
                            <form:input path="role" cssClass="form-control" placeholder="Enter role"/>
                            <form:errors path="role" cssClass="error-text"/>
                        </div>

                        <div class="d-flex justify-content-between">
                            <a href="${pageContext.request.contextPath}/users" class="btn btn-secondary">Back</a>
                            <button type="submit" class="btn btn-success">${pageTitle}</button>
                        </div>

                    </form:form>

                </div>
            </div>

        </div>
    </div>
</div>

</body>
</html>