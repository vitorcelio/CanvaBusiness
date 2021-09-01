<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="pt-br">

  <head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Página Inicial - Canva Generator</title>
    <link rel="shortcut icon" href="<c:url value="/icocb.png"/>">
    <style>
      <c:import url="/WEB-INF/css/bootstrap.min.css"/>
      .centro {
        margin: 0 auto;
        display: block;
      }

      #fundo-verde {
        background-color: #00AB45;
      }

      #fundo-azul-verde {
        background-color: #01A0C8;
      }

      .edit-border {
        color: white!important;
        border: 1px solid white!important;
      }
      
      
    </style>
  </head>

  <body style="background: linear-gradient(to right, #631A52, #38006B)">
    <div class="centro" >
      <div class="container">
        <header class="d-flex flex-wrap justify-content-center py-3 mb-4">
          <a href="#" class="d-flex align-items-center mb-3 mb-md-0 me-md-auto text-dark text-decoration-none">
            <img src='<c:url value="/logo.png"/>' width="35%"/>
          </a>

          <ul class="nav nav-pills">

            <li class="nav-item"><a href="canva?acao=LoginForm" class="nav-link text-white">Entrar</a></li>
            <li class="nav-item"><a href="#" class="fundo-verde nav-link active" id="fundo-verde">Criar
                Conta</a></li>
          </ul>
        </header>
      </div>

      <div class="px-4 pt-5 text-center"
           style="padding-bottom: 200px;background-image: url(<c:url value="/cb.png"/>); background-repeat: no-repeat;background-position: bottom;background-size: cover;">
        <h1 class="display-4 fw-bold text-white">Crie seu Canva de Negócios</h1>
        <div class="col-lg-6 mx-auto">
          <p class="lead mb-4 text-white">O jeito mais fácil de criar sua ferramenta de planejamento estratégico.
            Permite desenvolver e esboçar modelos de negócios novos ou existentes. Que sua empresa vai oferecer
            para o mercado que realmente terá valor para os clientes.</p>
          <div class="d-grid gap-2 d-sm-flex justify-content-sm-center mb-5">
            <button type="button" class="btn btn-primary btn-lg px-4 me-sm-3 edit-border">Criar Conta</button>
            <a href="canva?acao=LoginForm" class="btn btn-outline-secondary btn-lg px-4 edit-border text-white" 
               id="fundo-azul-verde">Entrar</a>
          </div>
        </div>
      </div>
    </div>
           <c:import url="rodape.jsp"/>
  </body>

</html>