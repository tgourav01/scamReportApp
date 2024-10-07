<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
   <style>
    body{
        background-image:url(newscam.jpg);
        background-size: cover;
        color:black;
        font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
     }
     #div2{
        margin-left: 1%;
     }
       #nav1{
               color:white;
                background-color:#042b62;
                }

    </style>
</head>
<body >
    <nav id="nav1" class="navbar navbar-light ">
           <div class="container-fluid">

            <h2> SCAM REPORT<h2>
             <h2>REPORT EVERY SCAM ,HELP OTHERS</h2>
           </div>
         </nav>
      <hr>

       <div class="container">
   <h2> SEARCH REPORT
   <table class="table">
    <tr>
    <th>EMAIL/NUMBER</th>
    <th>REPORTS</th>

    </tr>
      <tr>
        <td>${id}</td>
        <td>${count}</td>
        </tr>
   </table>
   <h2>THANK YOU<h2>

</div>
<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
</body>
</html>