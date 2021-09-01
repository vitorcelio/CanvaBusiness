<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/canva?acao=AdicionarSegmento" var="linkAddParc" />
<html lang="pt-br">

  <head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Segmento de mercado - Canva Generator</title>
    <link rel="shortcut icon" href="<c:url value="/icocb.png"/>">
    <style>
      .spc{
        margin-top: 15px;
        float: right;
      }
    </style>
  </head>

  <body class="centro" style="width: 95%; background: linear-gradient(to right, #631A52, #38006B)">
    <a href="canva?acao=Inicio">
      <img src='<c:url value="/logo.png"/>' width="15%" style="margin-bottom: 15px"/>
    </a>
    <div class="row">
      <div class="col-md-4">
        <c:import url="menu.jsp"/>
      </div>

      <div class="col-md-8">
        <h1 class="text-white">Segmentos de mercado</h1>
        <div class="mb-3">
          <form action="${linkAddParc}" method="POST">
            <textarea class="form-control" id="exampleFormControlTextarea1" rows="7"  <c:if test="${lista.size() < 1}">placeholder="Digite aqui seus segmentos de mercado"</c:if>
                      style="resize: none;" name="descricao" <c:if test="${lista.size() == 1}">placeholder="ESTE ITEM JÁ FOI ADICIONADO" disabled</c:if>></textarea>
            <button class="spc btn btn-light">Salvar</button>
          </form>
        </div>

      </div>
    </div>
  </body>

</html>