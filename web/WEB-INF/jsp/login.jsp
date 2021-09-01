<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/canva?acao=Login" var="linkCriarConta"/>
<!DOCTYPE html>
<html lang="pt-br">
  <head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login - Canva Generator</title>
    <link rel="shortcut icon" href="<c:url value="/icocb.png"/>">
    <style>
      <c:import url="/WEB-INF/css/bootstrap.min.css"/>

      .fundo-roxo {
        background-color: #8B0CB6;
      }

      .fundo-amarelo {
        background-color: #FF9A00!important;
        border: none!important;
      }
    </style>
  </head>
  <body style="background: linear-gradient(to right, #631A52, #38006B)">
    <div class="container">
      <header class="d-flex flex-wrap justify-content-center py-3 mb-4">
        <a href="canva?acao=Home" class="d-flex align-items-center mb-3 mb-md-0 me-md-auto text-dark text-decoration-none">
          <img src='<c:url value="/logo.png"/>' width="35%"/>
        </a>


      </header>
    </div>

    <div class="container col-xl-10 col-xxl-8 px-4 py-5">
      <div class="row align-items-center g-lg-5 py-5">
        <div class="col-lg-7 text-center text-lg-start">
          <h1 class="display-4 fw-bold lh-1 mb-3 text-white">Faça Login </h1>
          <p class="col-lg-10 fs-4 text-white">Entre e mostre  como você irá operar e gerar valor ao mercado, definindo seus principais fluxos e processos, permitindo uma análise e visualização do seu modelo de atuação no mercado.</p>
        </div>
        <div class="col-md-10 mx-auto col-lg-5">
          <form action="${linkCriarConta}" method="POST" class="p-4 p-md-5 rounded-3 fundo-roxo">
            <div class="form-floating mb-3">
              <input type="text" class="form-control" id="floatingInput" placeholder="name@example.com" name="usuario">
              <label for="floatingInput">Email (admin)</label>
            </div>
            <div class="form-floating mb-3">
              <input type="password" class="form-control" id="floatingPassword" placeholder="Password" name="senha">
              <label for="floatingPassword">Senha (admin)</label>
            </div>
            <div class="checkbox mb-3">
              <label class="text-white">
                <input type="checkbox" value="remember-me" > Lembrar-me
              </label>
            </div>
            <button class="fundo-amarelo w-100 btn btn-lg btn-primary" type="submit">Entrar</button>              
          </form>
        </div>
      </div>
    </div>
    <c:import url="rodape.jsp"/>
  </body>
</html>