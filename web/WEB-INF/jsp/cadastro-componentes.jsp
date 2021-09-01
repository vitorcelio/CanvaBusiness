<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Início - Canva Generator</title>
    <link rel="shortcut icon" href="<c:url value="/icocb.png"/>">
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
            <h1 class="text-white" style="text-align: center;margin-top: 20%;font-size: 50px;">Insira as informações no
                <br>seu Canva Business</h1>
            <p class="text-white" style="text-align: center;">Clique nos componentes para adicioná-los.</p>
        </div>
    </div>
</body>

</html>