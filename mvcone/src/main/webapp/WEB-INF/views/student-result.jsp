<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <title>Student Result</title>

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<div class="container mt-5">

    <div class="row justify-content-center">
        <div class="col-md-6">

            <div class="card shadow">

                <div class="card-header bg-success text-white text-center">
                    <h4>${message}</h4>
                </div>

                <div class="card-body">

                    <table class="table table-bordered">
                        <tr>
                            <th>Name</th>
                            <td>${student.name}</td>
                        </tr>
                        <tr>
                            <th>Course</th>
                            <td>${student.course}</td>
                        </tr>
                        <tr>
                            <th>Email</th>
                            <td>${student.email}</td>
                        </tr>
                    </table>

                    <div class="text-center">
                        <a href="studentForm" class="btn btn-primary">Add Another</a>
                    </div>

                </div>

            </div>

        </div>
    </div>

</div>

</body>
</html>