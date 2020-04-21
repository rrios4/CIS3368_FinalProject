<!DOCTYPE html>
<html lang="en">
<head>
  <title>BookStore</title>
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

    <!-- Page Content -->

    <div class="container">
      <div class="row">
        <div class="col-lg-12 text-center">
          <h1 class="mt-5">Welcome!</h1>
          <p class="lead">Where stories can be learned!</p>
          <p class="lead" id="date">$0</p><br>
                                      <script type="text/javascript">
                                          n =  new Date();
                                          y = n.getFullYear();
                                          m = n.getMonth() + 1;
                                          d = n.getDate();
                                          document.getElementById("date").innerHTML = m + "/" + d + "/" + y;
                                          </script>
          <ul class="list-unstyled">
          </ul>


                                          <div class="row">
                                              <div class="col-md-3">
                                                  <a href="/orderView">
                                                      <img src="https://www.advantage-marketing.com/content/uploads/2016/07/checklists-2-300x300.jpg" alt="Image" style="max-width:100%;">
                                                  </a>
                                                  <h2 class="mt-4">Orders</h2>
                                              </div>
                                              <div class="col-md-3">
                                                  <a href="/BookView">
                                                      <img src="https://www.pinclipart.com/picdir/big/169-1690579_book-icon-png-clip-art-transparent-download-book.png" alt="Image" style="max-width:100%;">
                                                  </a>
                                                  <h2 class="mt-4">Books</h2>
                                              </div>
                                              <div class="col-md-3">
                                                  <a href="/EmployeeView">
                                                      <img src="https://www.mentalhealthcommission.ca/sites/default/files/2016-07/Employees_Icon-CMYK.png" alt="Image" style="max-width:100%;">
                                                  </a>
                                                  <h2 class="mt-4">Employees</h2>
                                              </div>
                                              <div class="col-md-3">
                                                  <a href="/CustomerView">
                                                      <img src="https://chiropractorspaisley.co.uk/wp-content/uploads/2019/08/icon-3.png" alt="Image" style="max-width:100%;">
                                                  </a>
                                                  <h2 class="mt-4">Customers</h2>
                                              </div>
                                          </div>
                                          <!--.row-->

                                      <!--.item-->


        </div>
      </div>
    </div>


</body>
</html>
