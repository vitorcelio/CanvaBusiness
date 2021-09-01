<%@page language="Java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html lang="pt-br">

  <head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <title>Canva Generator</title>
    <link rel="shortcut icon" href="<c:url value="/icocb.png"/>">
    <style>
      <c:import url="/WEB-INF/css/reset.css"/>
      <c:import url="/WEB-INF/css/bootstrap.min.css"/>
      <c:import url="/WEB-INF/css/index.css"/>
      <c:import url="/WEB-INF/css/cores.css"/>
    </style>
    <style>
      a{
        text-decoration: none;
      }

      p{
        margin-bottom: 0!important;
      }
      .mb {
        margin-bottom: 15px;
      }

      .li-b{
        margin-top: 8px;
      }
      .large{
        padding-top: 6px;
        font-size: 25px;
      }

      .border2{
        border: none;
        margin-left: 4px;
        margin-right: 4px;
        margin-top: 4px;
        border-radius: 10px;
      }

      .cor-del-edit{
        color: rgba(255, 255, 255, 0.063);
      }

      .mb:hover > a{
        color: white;
      }

      .fonte-pequena{
        font-size: 13px;
      }

      .fundo-roxo{
        background-color: #8B0CB6;
      }

      .fundo-amarelo{
        background-color: #FF9A00;
      }

      .fundo-laranja{
        background-color: #FD6A26;
      }

      .fundo-verde{
        background-color: #00AB45;
      }

      .fundo-verde-claro{
        background-color: #7FD02D;
      }

      .fundo-verde-azulado{
        background-color: #00B9A9;
      }

      .fundo-azul-verde{
        background-color: #01A0C8;
      }

      .fundo-azul{
        background-color: #2151CD;
      }

      .fundo-verde-com-azul{
        background-color: #00728D;
      }
      
      
    </style>
  </head>

  <body class="centro" style="width: 95%; background: linear-gradient(to right, #631A52, #38006B)">
    <a href="canva?acao=Inicio">
      <img src='<c:url value="/logo.png"/>' width="15%" style="margin-bottom: 15px"/>
    </a>
    
    <div class="linha1">
      <div class="row align-items-md-stretch">

        <div class="col-md-2 pad-zero">
          <div class="h-100 fundo-roxo p-c border2">
            <h3 class="text-white"><i class="large material-icons">people
              </i> <br>  Parcerias Chave</h3>
            <ul>
              <c:forEach var="parceria" items="${parcerias}">
                <li class="mb">
                  <p class="p-c2 fonte-pequena text-white ">${parceria.descricao}</p>
                  <a href="canva?acao=RemoverParceria&id=${parceria.id}" class="cor-del-edit"><i class="large material-icons">delete</i></a>
                  <a href="" class="cor-del-edit"><i class="large material-icons">border_color
                    </i></a>
                </li>
              </c:forEach>
            </ul>
          </div>
        </div>


        <ul class="col-md-3 pad-zero">
          <li>
            <div class="pad-zero">
              <div class=" p-c fundo-amarelo border2">
                <h3 class="text-white"><i class="large material-icons">vpn_key
                  </i>  <br> Atividades Chave</h3>
                <ul>
                  <c:forEach var="atividade" items="${atividades}">

                    <li class="mb">
                      <p class="p-c2 fonte-pequena text-white ">${atividade.descricao}</p>
                      <a href="canva?acao=RemoverAtividade&id=${atividade.id}" class="cor-del-edit"><i class="large material-icons">delete</i></a>
                      <a href="" class="cor-del-edit"><i class="large material-icons">border_color
                        </i></a>
                    </li>

                  </c:forEach>
                </ul>
              </div>
            </div>
          </li>
          <li>
            <div class="li-b pad-zero">
              <div class=" p-c fundo-laranja border2">
                <h3 class="text-white"><i class="large material-icons">insert_chart
                  </i> <br>  Recursos Chave</h3>
                <ul>
                  <c:forEach var="recurso" items="${recursos}">

                    <li class="mb">
                      <p class="p-c2 fonte-pequena text-white">${recurso.descricao}</p>
                      <a href="canva?acao=RemoverRecursos&id=${recurso.id}" class="cor-del-edit"><i class="large material-icons">delete</i></a>
                      <a href="" class="cor-del-edit"><i class="large material-icons">border_color
                        </i></a>
                    </li>

                  </c:forEach>
                </ul>
              </div>
            </div>
          </li>
        </ul>

        <div class="col-md-2 pad-zero">
          <div class="h-100 p-c fundo-verde border2 ">
            <h3 class="text-white"><i class="large material-icons">redeem
              </i> <br>  Proposta de valor</h3>
            <ul>
              <c:forEach var="proposta" items="${propostas}">

                <li class="mb">
                  <p class="p-c2 fonte-pequena text-white">${proposta.descricao}</p>
                  <a href="canva?acao=RemoverProposta&id=${proposta.id}" class="cor-del-edit"><i class="large material-icons">delete</i></a>
                  <a href="" class="cor-del-edit"><i class="large material-icons">border_color
                    </i></a>
                </li>

              </c:forEach>
            </ul>
          </div>
        </div>

        <ul class="col-md-3 pad-zero">
          <li>
            <div class="pad-zero">
              <div class="fundo-verde-claro  p-c border2 ">
                <h3 class="text-white"><i class="large material-icons">insert_emoticon
                  </i> <br>  Relações com clientes</h3>
                <ul>
                  <c:forEach var="relacao" items="${relacoes}">

                    <li class="mb">
                      <p class="p-c2 fonte-pequena text-white">${relacao.descricao}</p>
                      <a href="canva?acao=RemoverRelacoes&id=${relacao.id}" class="cor-del-edit"><i class="large material-icons">delete</i></a>
                      <a href="" class="cor-del-edit"><i class="large material-icons">border_color
                        </i></a>
                    </li>

                  </c:forEach>
                </ul>
              </div>
            </div>
          </li>
          <li>
            <div class="li-b pad-zero">
              <div class=" fundo-verde-azulado  p-c  border2 ">
                <h3 class="text-white"><i class="large material-icons">phonelink
                  </i>  <br> Canais</h3>
                <ul>
                  <c:forEach var="canal" items="${canais}">

                    <li class="mb">
                      <p class="p-c2 fonte-pequena text-white">${canal.descricao}</p>
                      <a href="canva?acao=RemoverCanal&id=${canal.id}" class="cor-del-edit"><i class="large material-icons">delete</i></a>
                      <a href="" class="cor-del-edit"><i class="large material-icons">border_color
                        </i></a>
                    </li>

                  </c:forEach>
                </ul>
              </div>
            </div>
          </li>
        </ul>

        <div class="col-md-2 pad-zero">
          <div class="fundo-azul-verde h-100 p-c border2 ">
            <h3 class="text-white"><i class="large material-icons">store
              </i> <br>  Segmentos de mercado</h3>
            <ul>
              <c:forEach var="segmento" items="${segmentos}">
                <li class="mb">
                  <p class="p-c2 fonte-pequena text-white">${segmento.descricao}</p>
                  <a href="canva?acao=RemoverSegmento&id=${segmento.id}" class="cor-del-edit"><i class="large material-icons">delete</i></a>
                  <a href="" class="cor-del-edit"><i class="large material-icons">border_color
                    </i></a>
                </li>
              </c:forEach>
            </ul>
          </div>
        </div>


      </div>
    </div>
    <div class="row align-items-md-stretch" style="margin-top: 6px;">
      <div class="col-md-6 pad-zero">
        <div class="h-100 fundo-azul p-c border2">
          <h3 class="text-white"><i class="large material-icons">local_offer
            </i> <br>  Estrutura de custos</h3>
          <ul>
            <c:forEach var="custo" items="${custos}">
              <li class="mb">
                <p class="p-c2  fonte-pequena text-white">${custo.descricao}</p>
                <a href="canva?acao=RemoverCusto&id=${custo.id}" class="cor-del-edit"><i class="large material-icons">delete</i></a>
                <a href="" class="cor-del-edit"><i class="large material-icons">border_color
                  </i></a>
              </li>
            </c:forEach>
          </ul>
        </div>
      </div>
      <div class="col-md-6 pad-zero">
        <div class="h-100 fundo-verde-com-azul p-c border2">
          <h3 class="text-white"><i class="large material-icons">monetization_on
            </i>  <br> Fontes de renda</h3>
          <ul>
            <c:forEach var="fonte" items="${fontes}">
              <li class="mb">
                <p class="p-c2 fonte-pequena text-white">${fonte.descricao}</p>
                <a href="canva?acao=RemoverFontes&id=${fonte.id}" class="cor-del-edit"><i class="large material-icons">delete</i></a>
                <a href="" class="cor-del-edit"><i class="large material-icons">border_color
                  </i></a>
              </li>
            </c:forEach>
          </ul>
        </div>
      </div>
    </div>
    
  </body>

</html>