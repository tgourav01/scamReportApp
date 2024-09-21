<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <style>
        
       form{
        width: 30%; 
        margin-left: 37%;
        margin-top: 1%;
       }
       body{
        background-image:url(image.jpg);
        background-size: cover;
        color:black;
        font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
     }
    </style>
</head>
<body>
    
    <form action="handleReportNumber" method="post">
        <div class="mb-1">
          <label for="number" class="form-label"> Enter Number</label>
          <input  name ="number"type="number" class="form-control" id="number" aria-describedby="Help">
          <div id="Help" class="form-text">Enter the number you want to report</div>
        </div>
        <button type="submit" class="btn btn-primary">Report</button>
      </form>
</body>
</html>