<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculadora Funcao</title>
<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container ">
    <div class="row mt-5 mb-5">
      <div class="col-12 col-md-5 mx-auto border">
        <div class="white">
          <div class="row">
            <div class="col-12">
              <h2 class="title-main">Calculadora</h2>
              <h4>Resultado = ${requestScope.resultado}</h4>
            </div>
                <form method="post" action="Calculadora">
                   <div class="row">
                       <div class="col-3 mt-2">
                           <h6>Numero 1:</h6>
                       </div>
                       <div class="col-9">
                           <input type="number" class="form-control" name="val1">
                       </div>
                   </div>
                   <div class="row mt-3">
                        <div class="col-3 mt-2">
                            <h6>Numero 2:</h6>
                        </div>
                        <div class="col-9">
                            <input type="number" class="form-control" name="val2">
                        </div>
                    </div>

                    <div class="row">
                        <div class="align-items-center mt-3 mb-3">
                            <button type="submit" name="btnSomar" value="+" class="btn btn-secondary ">+</button>
                            <button type="submit" name="btnSub" value="-"  class="btn btn-secondary ">-</button>
                            <button type="submit" name="btnMulti" value="*" class="btn btn-secondary ">x</button>
                            <button type="submit" name="btnDiv" value="/" class="btn btn-secondary ">/</button>  
                            <button type="reset"  class="btn btn-secondary col-4">Limpar</button>
                        </div>
                    </div> 
                </form>              
            </div>
          </div>
        </div>
      </div>
    </div>
</body>
</html>