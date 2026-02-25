<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <form action="Login"> <!-- once user clicks on login button , it will call login servlet i.e Login.java -->
  <!-- Here the default method will be get since we are not specifying anything -->
  Enter username : <input type="text" name="uname"><br>
  Enter Password <input type="password" name="pass">
  
  <input type="submit" value="Login">
  
  </form>
</body>
</html>