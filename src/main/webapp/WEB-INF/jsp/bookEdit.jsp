<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Book Store</title>
      <meta charset="utf-8">
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
      <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
      <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
      <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</head>
<style type="text/css">

body {
  overflow-x: hidden;
}

#wrapper {
  padding-left: 0;
  -webkit-transition: all 0.5s ease;
  -moz-transition: all 0.5s ease;
  -o-transition: all 0.5s ease;
  transition: all 0.5s ease;
}

#wrapper.toggled {
  padding-right: 250px;
}

#sidebar-wrapper {
  z-index: 1000;
  position: fixed;
  right: 250px;
  width: 0;
  height: 100%;
  margin-right: -250px;
  overflow-y: auto;
  background: #000;
  -webkit-transition: all 0.5s ease;
  -moz-transition: all 0.5s ease;
  -o-transition: all 0.5s ease;
  transition: all 0.5s ease;
}

#wrapper.toggled #sidebar-wrapper {
  width: 250px;
}

#page-content-wrapper {
  width: 100%;
  position: absolute;
  padding: 15px;
}

#wrapper.toggled #page-content-wrapper {
  position: absolute;
  margin-right: 0px;
}


/* Sidebar Styles */

.sidebar-nav {
  position: absolute;
  top: 0;
  width: 250px;
  margin: 0;
  padding: 0;
  list-style: none;
}

.sidebar-nav li {
  text-indent: 20px;
  line-height: 40px;
}

.sidebar-nav li a {
  display: block;
  text-decoration: none;
  color: #999999;
}

.sidebar-nav li a:hover {
  text-decoration: none;
  color: #fff;
  background: rgba(255, 255, 255, 0.2);
}

.sidebar-nav li a:active, .sidebar-nav li a:focus {
  text-decoration: none;
}

.sidebar-nav>.sidebar-brand {
  height: 65px;
  font-size: 18px;
  line-height: 60px;
}

.sidebar-nav>.sidebar-brand a {
  color: #999999;
}

.sidebar-nav>.sidebar-brand a:hover {
  color: #fff;
  background: none;
}

@media(min-width:768px) {
  #wrapper {
    padding-left: 0;
  }
  #wrapper.toggled {
    padding-right: 250px;
  }
  #sidebar-wrapper {
    width: 0;
  }
  #wrapper.toggled #sidebar-wrapper {
    width: 250px;
  }
  #page-content-wrapper {
    padding: 20px;
    position: relative;
  }
  #wrapper.toggled #page-content-wrapper {
    position: relative;
    margin-right: 0;
  }
}
</style>

<body>
<nav class="navbar navbar-expand navbar-dark bg-dark"> <a href="#menu-toggle" id="menu-toggle" class="navbar-brand"><span class="navbar-toggler-icon"></span></a> <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExample02" aria-controls="navbarsExample02" aria-expanded="false" aria-label="Toggle navigation"> <span class="navbar-toggler-icon"></span> </button>
              <div class="collapse navbar-collapse" id="navbarsExample02">
                  <ul class="navbar-nav mr-auto">
                      <li class="nav-item active"> <a class="navbar-brand" href="/">Book Store</a> </li>
                  </ul>
                  <form class="form-inline my-2 my-md-0"> </form>
              </div>
          </nav>
          <script src="js/jquery.min.js"></script>
                  <script src="js/bootstrap.bundle.min.js"></script> <!-- Menu Toggle Script -->
                  <script>
                    $(function(){
                      $("#menu-toggle").click(function(e) {
                          e.preventDefault();
                          $("#wrapper").toggleClass("toggled");
                      });

                      $(window).resize(function(e) {
                        if($(window).width()<=768){
                          $("#wrapper").removeClass("toggled");
                        }else{
                          $("#wrapper").addClass("toggled");
                        }
                      });
                    });

                  </script>
   <div id="wrapper" class="toggled">
               <!-- Sidebar -->
               <div id="sidebar-wrapper">
                   <ul class="sidebar-nav">
                       <li class="sidebar-brand"> <a href="/"> Home </a> </li>
                       <li> <a href="/orderView">Orders</a> </li>
                       <li> <a href="/BookView">Books</a> </li>
                       <li> <a href="/EmployeeView">Employees</a> </li>
                       <li> <a href="/CustomerView">Customers</a> </li>
                   </ul>
               </div> <!-- /#sidebar-wrapper -->

       <div class="container">
           <div class="row">
               <div class="col-lg-12 text-center">
                   <h1 class="mt-5" align="center">Book Information</h1><br>

                   <%--Form code below is to input information into DB--%>
                    <form method="post" action="/saveBook">
                         <input type="hidden" name="bookid" value="">

                         <input type="text" placeholder="Book Name" name="bookname" value="${selectedItem.getBookName()}">

                         <input type="text" placeholder="Author Name" name="authorname" value="${selectedItem.getAuthorName()}">

                         <input type="text" placeholder="Publisher" name="publisher" value="${selectedItem.getPublisher()}">

                         <input type="text" placeholder="Price" name="bookprice" value="${selectedItem.getBookPrice()}">

                         <input type="submit" value="Submit">
                         <br><br>
                    </form>

                    <%--table code below is for table and to display information                   --%>
                   <table class="table table-dark table-striped">

                       <thead>
                       <tr>
                           <th>Book Name</th>
                           <th>Author Name</th>
                           <th>Publisher</th>
                           <th>Book Price</th>
                           <th>Modify</th>
                       </tr>
                       </thead>

                       <tbody>
                       <c:forEach var = "listitem" items = "${bookList1}">
                           <tr>
                               <td>${listitem.getBookName()}</td>
                               <td>${listitem.getAuthorName()}</td>
                               <td>${listitem.getPublisher()}</td>
                               <td>${listitem.getBookPrice()}</td>
                               <td><a href="/deleteBook/${listitem.getId()}"><button type="button">Delete</button></a></td>
                           </tr>
                       </c:forEach>
                       </tbody>



                   </table>

                    <%-- this is just watermark--%>
                   <p align="right">Powered By: AWS</p><br>

                   <%-- Code below takes you take back to main menu   --%>
                   <ul class="list-unstyled">
                       <li><a href="/"><button type="button" class="btn btn-dark">Back</button></a><br><br></li>
                   </ul>

               </div>
           </div>
       </div>

</body>
</html>




