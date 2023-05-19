
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {
  font-family: Arial, Helvetica, sans-serif;
  background-color: black;
}

* {
  box-sizing: border-box;
}


.container {
  padding: 16px;
  background-color: white;
}


input[type=text], input[type=password] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
  background-color: #ddd;
  outline: none;
}


hr {
  border: 1px solid #f1f1f1;
  margin-bottom: 25px;
}


.registerbtn {
  background-color: #04AA6D;
  color: white;
  padding: 16px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}

.registerbtn:hover {
  opacity: 1;
}


a {
  color: dodgerblue;
}


.signin {
  background-color: #f1f1f1;
  text-align: center;
}
</style>
</head>
<body>

<form class="modal-content animate" action="/thinroot/userlogin" method="post" commandName="login">
  <div class="container">
    <h1>LOGIN</h1>
    <p>Please fill in this form to login into your account.</p>
    <hr>

    <label for="email"><b>username</b></label>
    <input type="text" placeholder="Enter Email" name="email" id="username" path="username" required="required" />

    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="Password" path="Password" required="required" />

    
    

    <button type="submit" class="registerbtn">LOGIN</button>
  </div>
  
  
</form>

</body>
</html>

  
 