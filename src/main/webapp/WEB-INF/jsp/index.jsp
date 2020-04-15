<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>

<head>
    <style>

    </style>
</head>

<body>

<a href="bookEdit.jsp"> <button>Books</button> </a>

<form method="post" action="/saveBook">
    <input type="hidden" name="bookid" value="">
    <br>Book Name: <br>
    <input type="text" name="bookname" value="${selectedItem.getBookName()}">
    <br>Author Name: <br>
    <input type="text" name="authorname" value="${selectedItem.getAuthorName()}">
    <br>Book Type: <br>
    <input type="text" name="booktype" value="${selectedItem.getBookType()}">
    <br>Book Price: <br>
    <input type="text" name="bookprice" value="${selectedItem.getBookPrice()}">
    <br>Quantity: <br>
    <input type="text" name="qty" value="${selectedItem.getQTY()}">
    <br><br>
    <input type="submit" value="Submit">
</form>

<br><br>
<a href="customerEdit.jsp"> <button>Customers</button> </a>

<form method="post" action="/saveCustomer">
    <input type="hidden" name="id" value="">
    <br>First Name: <br>
    <input type="text" name="firstname" value="${selectedItem.getFirstName()}">
    <br>Last Name: <br>
    <input type="text" name="lastname" value="${selectedItem.getLastName()}">
    <br>Address: <br>
    <input type="text" name="address" value="${selectedItem.getAddress()}">
    <br>Email: <br>
    <input type="text" name="email" value="${selectedItem.getEmail()}">
    <br><br>
    <input type="submit" value="Submit">
</form>

<br><br>
<a href="employeeEdit.jsp"> <button>Employees</button> </a>

<form method="post" action="saveEmployee">
    <input type="hidden" name="employeeid" value="">
    <br>First Name: <br>
    <input type="text" name="employeefirstname" value="${selectedItem.getEmployeeFirstName()}">
    <br>Last Name: <br>
    <input type="text" name="employeelastname" value="${selectedItem.getEmployeeLastName()}">
    <br>Postion: <br>
    <input type="text" name="position" value="${selectedItem.getPosition()}">
    <br><br>
    <input type="submit" value="Submit">
</form>

<br><br>
<a href="ordersView.jsp"> <button>Orders</button> </a>

<table>
    <tr>
        <th>Order ID</th>
        <th>Customer ID</th>
        <th>Employee ID</th>
        <th>Book ID</th>
    </tr>


</table>

</body>

</html>