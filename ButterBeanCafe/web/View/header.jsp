<%-- 
    Document   : header
    Created on : Jan 12, 2021, 3:07:48 AM
    Author     : Hariza Syawal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<header>
 <nav class="navbar navbar-expand-md navbar-dark"
  style="background-color: tomato">
  <div>
   <a href="#index.html" class="navbar-brand"> Todo App</a>
  </div>

  <ul class="navbar-nav navbar-collapse justify-content-end">
   <li><a href="<%= request.getContextPath() %>/View/login.jsp" class="nav-link">Login</a></li>
   <li><a href="<%= request.getContextPath() %>/View/register.jsp" class="nav-link">Signup</a></li>
  </ul>
 </nav>
</header>