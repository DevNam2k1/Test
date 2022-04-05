<%-- 
    Document   : search
    Created on : Nov 23, 2021, 9:09:16 PM
    Author     : laptop88
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tìm kiếm bác sĩ</title>
    </head>
    <body>
        <h1>Chương trình tìm kiếm theo tuổi!</h1>
        <table border="1px">
            <form action="<%=request.getContextPath()%>/search" method="post">
                From: <input type="number" name="from">
                <input type="submit">
            </form>
  <tr>
    <th>ID</th>
    <th>Name</th>
    <th>Age</th>
    <th>Address</th>
  </tr>
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

</table>
    </body>
</html>

