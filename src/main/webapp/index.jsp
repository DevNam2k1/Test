<%-- 
    Document   : index
    Created on : Nov 23, 2021, 7:44:32 PM
    Author     : laptop88
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tìm kiếm bác sĩ</title>
    </head>
    <body>
        <h1>Chương trình tìm kiếm theo tên của Khách Hàng!</h1>
        <table border="1px">
            <form action="<%=request.getContextPath()%>/search">
                From: <input type="number" name="customer"> 
                <input type="submit">
            </form>
  <tr>
    <th>ID</th>
    <th>Name</th>
    <th>Age</th>
    <th>Address</th>
  </tr>
  <c:forEach items="${listCustomer}" var="d">
  <tr>
    <td>${d.id}</td>
    <td>${d.name}</td>
    <td>${d.age}</td>
    <td>${d.address}</td>
  </tr>
  </c:forEach>
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
     <tr>
    <td>1</td>
    <td>Nam</td>
    <td>22</td>
    <td>London</td>
  </tr>
    <tr>
    <td>2</td>
    <td>Long</td>
    <td>30</td>
    <td>America</td>
  </tr>
    <tr>
    <td>3</td>
    <td>Hieu</td>
    <td>25</td>
    <td>Paris</td>
  </tr>
    <tr>
    <td>4</td>
    <td>Linh</td>
    <td>36</td>
    <td>America</td>
  </tr>
</table>
    </body>
</html>
