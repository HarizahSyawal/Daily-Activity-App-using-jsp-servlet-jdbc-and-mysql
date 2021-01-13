<%-- 
    Document   : todolist
    Created on : Jan 12, 2021, 12:12:22 AM
    Author     : Hariza Syawal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- Created By CodingNepal - www.codingnepalweb.com -->
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/style.css">
    <script src="https://kit.fontawesome.com/a076d05399.js"></script>
</head>
<body>
  <div class="wrapper">
    <header>Todo Application</header>
    <div class="inputField">
      <input type="text" placeholder="Add your new activity">
      <button><i class="fas fa-plus"></i></button>
    </div>
    <ul class="todoList">
      <!-- data are comes from local storage -->
    </ul>
    <div class="footer">
      <span>You have <span class="pendingTasks"></span> pending tasks</span>
      <button>Clear All</button>
    </div>
  </div>

  <script src="js/jquery-3.2.1.min.js"></script>

</body>
</html>
