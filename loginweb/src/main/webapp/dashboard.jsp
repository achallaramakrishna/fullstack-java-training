<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>

<title>Dashboard</title>

<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

<style>

body{
    background:#f5f6fa;
}

.sidebar{
    height:100vh;
    background:#343a40;
    color:white;
}

.sidebar a{
    color:white;
    text-decoration:none;
    display:block;
    padding:10px;
}

.sidebar a:hover{
    background:#495057;
}

.header{
    background:#0d6efd;
    color:white;
    padding:10px;
}

.footer{
    background:#212529;
    color:white;
    text-align:center;
    padding:10px;
}

</style>

</head>

<body>

<!-- HEADER -->
<div class="header d-flex justify-content-between align-items-center">

    <h4 class="ms-3">My Application</h4>

    <div class="me-3">
        Welcome <b><%= session.getAttribute("username") %></b>
        |
        <a href="logout" class="text-white">Logout</a>
    </div>

</div>


<div class="container-fluid">

<div class="row">

<!-- LEFT SIDEBAR -->
<div class="col-md-2 sidebar">

    <h5 class="mt-3 text-center">Menu</h5>

    <a href="#">Dashboard</a>
    <a href="#">Users</a>
    <a href="#">Courses</a>
    <a href="#">Reports</a>
    <a href="#">Settings</a>

</div>


<!-- MAIN CONTENT -->
<div class="col-md-10 p-4">

    <h3>Dashboard</h3>

    <div class="alert alert-success mt-4">
        Welcome to the Dashboard. Your login was successful.
    </div>

</div>

</div>

</div>


<!-- FOOTER -->
<div class="footer">
    © 2026 Robo Dynamics
</div>

</body>
</html>