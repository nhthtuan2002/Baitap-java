<%@ page import="com.example.register.entity.Account" %><%
    Account currentName = (Account) request.getAttribute("accout");
    Object student;%>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<!------ Include the above in your HEAD tag ---------->
<style>
    form { margin: 0px 10px; }

    h2 {
        margin-top: 2px;
        margin-bottom: 2px;
    }

    .container { max-width: 360px; }

    .divider {
        text-align: center;
        margin-top: 20px;
        margin-bottom: 5px;
    }

    .divider hr {
        margin: 7px 0px;
        width: 35%;
    }

    .left { float: left; }

    .right { float: right; }
</style>

<div class="container">
    <div class="row">
        <div class="panel panel-primary">
            <div class="panel-body">
                <form method="POST" action="/register" role="form">
                    <div class="form-group">
                        <h2>Register</h2>
                    </div>
                    <div class="form-group">
                        <label class="control-label" for="signupName">Username</label>
                        <input id="signupName" type="text" name="username" required placeholder="" maxlength="50" class="form-control">
                    </div>
                    <div class="form-group">
                        <label class="control-label" for="signupPassword">Password</label>
                        <input id="signupPassword" type="password" name="password" required maxlength="25" class="form-control"  length="40">
                    </div>
                    <div class="form-group">
                        <label class="control-label" for="signupPasswordagain">Confirm Password</label>
                        <input id="signupPasswordagain" type="password" name="confirmpassword" required maxlength="25" class="form-control">
                    </div>
                    <div class="form-group">
                        <label class="control-label" for="signupEmail">FullName</label>
                        <input id="signupEmail" type="text" name="fullName" required maxlength="50" class="form-control">
                    </div>
                    <div class="form-group">
                        <label class="control-label" for="signupEmailagain">Email </label>
                        <input id="signupEmailagain" type="email" name="email" required maxlength="50" class="form-control">
                    </div>
                    <div class="form-group">
                        <label class="control-label" for="signupphone">Phone </label>
                        <input id="signupphone" type="text" name="phone" required maxlength="13" class="form-control">
                    </div>
                    <div class="form-group">
                        <label class="control-label" for="signupphone">Birthday </label>
                        <input id="signupdate" type="date" name="birthday" required  class="form-control">
                    </div>

                    <div class="form-group">
                        <button id="signupSubmit" type="submit" class="btn btn-info btn-block">Register</button>
                    </div>
                    <div class="form-group">
                        <button id="signupReset" type="reset" class="btn btn-info btn-block">Reset</button>
                    </div>
                    <p></p>Already have an account? <a href="#">Sign in</a></p>
                </form>
            </div>
        </div>
    </div>
</div>