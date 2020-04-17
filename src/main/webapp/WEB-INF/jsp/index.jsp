<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>

<head>
    <style>

    </style>
</head>

<body>



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