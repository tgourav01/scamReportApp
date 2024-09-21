<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
   <style>
    body{
        background-image:url(image.jpg);
        background-size: cover;
        color:black;
        font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
     }
     #div2{
        margin-left: 1%;
     }
    </style>
</head>
<body >
     
    <nav class="navbar navbar-light bg-light">
        <div class="container-fluid">
          <a class="navbar-brand" href="#">
            <img src="scam.jpg" alt="" width="50" height="24" class="d-inline-block align-text-top">
            SCAM REPORT
          </a>
          <h2>REPORT EVERY SCAM ,HELP OTHERS</h2>
        </div>
      </nav>
   <hr>
   <div id="div2">
   <h4>REPORT NUMBER</h4>
   <input type="button" onclick="window.location.href='http://localhost:8080/reportNumber' ;" value="cilck here">
   <br><br>
   <h4>REPORT EMAIL</h4>
   <input type="button" onclick="window.location.href='http://localhost:8080/reportEmail' ;" value="cilck here">
     <br><br>
     <h4>SEARCH NUMBER</h4>
   <input type="button" onclick="window.location.href='http://localhost:8080/searchNumber' ;" value="cilck here">
   <br><br>
   <h4>SEARCH EMAIL</h4>
   <input type="button" onclick="window.location.href='http://localhost:8080/searchEmail' ;" value="cilck here">
     
</div>
</body>
</html>