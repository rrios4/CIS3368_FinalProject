<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
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
                <h1 class="mt-5" align="center">Customer Information</h1><br>


                <form method="post" action="/saveCustomer">
                    <input type="hidden" name="customerid" value="">

                    <input type="text"  placeholder="First Name" name="firstname" value="${selectedItem.getFirstName()}">

                    <input type="text"  placeholder="Last Name" name="lastname" value="${selectedItem.getLastName()}">

                    <input type="text"  placeholder="Address" name="address" value="${selectedItem.getAddress()}">

                    <input type="text"  placeholder="City" name="city" value="${selectedItem.getCity()}">

                    <input type="text"  placeholder="Sate" name="state" value="${selectedItem.getState()}">

                    <input type="text"  placeholder="Zipcode" name="zipcode" value="${selectedItem.getZipcode()}">

                    <input type="text"  placeholder="Email" name="email" value="${selectedItem.getEmail()}">

                    <input type="text"  placeholder="Phone Number" name="phonenumber" value="${selectedItem.getPhoneNumber()}">

                    <input type="submit" value="Submit">
                    <br><br>
                </form>

              <table class="table table-dark table-striped">

                 <thead>
                 <tr>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Address</th>
                    <th>City</th>
                    <th>State</th>
                    <th>Zipcode</th>
                    <th>Email</th>
                    <th>Phone Number</th>
                    <th>Modify</th>

                </tr>
                </thead>


                <tbody>
                <c:forEach var = "listitem" items = "${customerList1}">
                    <tr>
                        <td>${listitem.getFirstName()}</td>
                        <td>${listitem.getLastName()}</td>
                        <td>${listitem.getAddress()}</td>
                        <td>${listitem.getCity()}</td>
                        <td>${listitem.getState()}</td>
                        <td>${listitem.getZipcode()}</td>
                        <td>${listitem.getEmail()}</td
                            <td></td>
                        <td>${listitem.getPhoneNumber()}</td
                            <td></td>
                        <td><a href="/deleteCustomer/${listitem.getCustomerId()}"><button type="button">Delete</button></a></td>

                    </tr>
                </c:forEach>
                </tbody>
                </table>

                <p align="right">Powered By: AWS</p><br>

                <ul class="list-unstyled">
                    <li><a href="/"><button type="button" class="btn btn-dark">Back</button></a><br><br></li>
                </ul>
              </div>
          </div>
    </div>

</body>
</html>
