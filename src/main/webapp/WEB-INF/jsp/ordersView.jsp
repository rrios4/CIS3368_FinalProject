<!DOCTYPE html>
<html lang="en">
<head>
  <title>Orders</title>
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
                            <h2 class="mt-5" align="center">Enter Order</h2>
                            <h5 class="mt-1" id="date">$0</h5><br>
                            <script type="text/javascript">
                                n =  new Date();
                                y = n.getFullYear();
                                m = n.getMonth() + 1;
                                d = n.getDate();
                                document.getElementById("date").innerHTML = m + "/" + d + "/" + y;
                                </script>
                                                <form method="post" action="saveOrder">
                                                    <input type="hidden" name="orderid" value="">
                                                    <input type="hidden" name="employeeid" value="">
                                                    <input type="hidden" name="customerid" value="">
                                                        <div class="input-group mb-3">
                                                            <div class="input-group-prepend">
                                                              <span class="input-group-text">Order Date </span>
                                                            </div>
                                                            <input type="text" class="form-control" placeholder="Date" value="${selectedItem.getOrderDate()}">
                                                          </div>

                                                        <div class="input-group mb-3">
                                                            <div class="input-group-prepend">
                                                                    <span class="input-group-text">Employee</span>
                                                            </div>
                                                            <input type="text" class="form-control" name="employeeF" placeholder="First Name" value="${selectedItem.getEmployeeFirstName()}">
                                                            <input type="text" class="form-control" name="employeeL"placeholder="Last Name" value="${selectedItem.getEmployeeLastName()}">
                                                          </div>
                                                        <div class="input-group mb-3">
                                                            <div class="input-group-prepend">
                                                              <span class="input-group-text">Customer</span>
                                                            </div>
                                                            <input type="text" class="form-control" placeholder="First Name" value="${selectedItem.getFirstName()}">
                                                            <input type="text" class="form-control" placeholder="Last Name" value ="${selectedItem.getLastName()}">
                                                          </div>
                                                  <table class="table table-striped">
                                                    <thead class="thead-dark">
                                                      <tr>
                                                        <th>Qty</th>
                                                        <th>Book Name</th>
                                                        <th>Unit Price</th>
                                                      </tr>
                                                    </thead>
                                                                <tbody>
                                                                    <tr>
                                                                        <td><input type="text" class"form-control" value="${selectedItem.getBookqty()}"></td>
                                                                        <td><input type="text" class"form-control" value="${selectedItem.getBookName()}"></td>
                                                                        <td><input type="text" class"form-control" value="${selectedItem.getBookPrice()}"></td>
                                                                     </tr>
                                                                 </tbody>
                                                  </table>
                                                        <div class="input-group mb-3">
                                                            <div class="input-group-prepend">
                                                              <span class="input-group-text">Order Total</span>
                                                            </div>
                                                            <input type="text" class="form-control" placeholder="Order Total" value="${selectedItem.getOrderTotal()}">

                                                          </div>
                                                    <input type="submit" value="Submit">
                                                    <br><br>
                                                </form>
                        </div>
                    </div>
               </div>

<div class="container">
<div class="row">
<div class="col-lg-12 text-center">

        <h2 class="mt-5" align="center">Order History</h2><br>

                                     <table class="table table-dark table-striped">

                                         <thead>
                                          <tr>
                                            <th>Order Date</th>
                                            <th>Employee First Name</th>
                                            <th>Employee Last Name</th>
                                            <th>Customer First Name</th>
                                            <th>Customer Last Name</th>
                                            <th>Order Total</th>
                                          </tr>
                                         </thead>
                                         <tbody>
                                         <c:forEach var="item" items="${orderList}">
                                             <tr>
                                                 <td>${item.getOrderDate()}</td>
                                                 <td>${item.getEmployeeFirstName()}</td>
                                                 <td>${item.getOrderTotal()}</td>
                                                 <td>${item.getOrderTotal()}</td>
                                                 <td>${item.getOrderTotal()}</td>
                                                 <td>${item.getOrderTotal()}</td>
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
