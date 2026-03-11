<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Login</title>

<!-- Bootstrap CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

<style>
body{
    background: linear-gradient(135deg,#1e3c72,#2a5298);
    height:100vh;
}

.login-card{
    border-radius:15px;
}
</style>

</head>

<body>

<div class="container d-flex justify-content-center align-items-center vh-100">

    <div class="card shadow-lg p-4 login-card" style="width:400px;">

        <h3 class="text-center mb-4">Login</h3>

        <form action="processLogin.jsp" method="post">

            <div class="mb-3">
                <label class="form-label">Email</label>
                <input 
                    type="email" 
                    name="email" 
                    class="form-control"
                    placeholder="Enter email"
                    required>
            </div>

            <div class="mb-3">
                <label class="form-label">Password</label>
                <input 
                    type="password" 
                    name="password" 
                    class="form-control"
                    placeholder="Enter password"
                    required>
            </div>

            <div class="d-grid">
                <button class="btn btn-primary">Login</button>
            </div>

            <div class="text-center mt-3">
                <a href="#">Forgot Password?</a>
            </div>

        </form>

    </div>

</div>

</body>
</html>