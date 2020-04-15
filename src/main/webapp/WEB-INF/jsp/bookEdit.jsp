<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>

</head>
<body>



<hr/>
<form method="post" action="/save">
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
</body>
</html>