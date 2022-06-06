<%@ page import="com.example.register.Entity.Account" %>
<%
    Account account = (Account) request.getAttribute("account");
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Alert Example</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body>
<div class="container mt-3">

    <div class="alert alert-info">
        <strong>Thong bao!</strong> Register success!
        <button type="button" class="close" data-dismiss="alert" aria-label="Close">x</button>
    </div>
    <div>Username: <%= account.getUsername()%>
    </div>
    <div>Fullname: <%= account.getFullName()%>
    </div>
    <div>Email: <%= account.getEmail()%>
    </div>
    <div>Phone: <%= account.getPhone()%>
    </div>
    <div>Birthday: <%= account.getBirthday()%>
    </div>
</div>


    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>

</body>
</html>
