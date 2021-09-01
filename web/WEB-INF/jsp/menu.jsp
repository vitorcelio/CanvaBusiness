<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Menu</title>
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <style>
        <c:import url="/WEB-INF/css/bootstrap.min.css"/>
        <c:import url="/WEB-INF/css/index.css"/>
        .accordion-item {
            margin-bottom: 10px;
            border-radius: 10px !important;
        }

        h3 {
            color: white;
        }

        a{
            text-decoration: none;
        }
        .fundo-roxo {
            background-color: #8B0CB6;
        }

        .fundo-amarelo {
            background-color: #FF9A00;
        }

        .fundo-laranja {
            background-color: #FD6A26;
        }

        .fundo-verde {
            background-color: #00AB45;
        }

        .fundo-verde-claro {
            background-color: #7FD02D;
        }

        .fundo-verde-azulado {
            background-color: #00B9A9;
        }

        .fundo-azul-verde {
            background-color: #01A0C8;
        }

        .fundo-azul {
            background-color: #2151CD;
        }

        .fundo-verde-com-azul {
            background-color: #00728D;
        }
    </style>
</head>
<body>
    <div class="accordion" id="accordionExample">
        <div class="accordion-item fundo-roxo">
            <a href="canva?acao=MostrarParceria">
                <h3 id="">
                    <i class="large material-icons">people
                    </i> Parcerias Chave
                </h3>
            </a>
        </div>
        <div class="accordion-item fundo-amarelo">
            <a href="canva?acao=MostrarAtividade">
                <h3 id="">
                    <i class="large material-icons">vpn_key
                    </i> Atividades Chave
                </h3>
            </a>
        </div>
        <div class="accordion-item fundo-laranja">
            <a href="canva?acao=MostrarRecurso">
                <h3 id="">
                    <i class="large material-icons">insert_chart
                    </i> Recursos Chave
                </h3>
            </a>
        </div>
        <div class="accordion-item fundo-verde">
            <a href="canva?acao=MostrarProposta">
                <h3 id="">
                    <i class="large material-icons">redeem
                    </i> Proposta de valor
                </h3>
            </a>
        </div>
        <div class="accordion-item fundo-verde-claro">
            <a href="canva?acao=MostrarRelacao">
                <h3 id="">
                    <i class="large material-icons">insert_emoticon
                    </i> Relações com clientes
                </h3>
            </a>
        </div>
        <div class="accordion-item fundo-verde-azulado">
            <a href="canva?acao=MostrarCanal">
                <h3 id="">
                    <i class="large material-icons">phonelink
                    </i> Canais
                </h3>
            </a>
        </div>
        <div class="accordion-item fundo-azul-verde">
            <a href="canva?acao=MostrarSegmento">
                <h3 id="">
                    <i class="large material-icons">store
                    </i> Segmentos de mercado
                </h3>
            </a>
        </div>
        <div class="accordion-item fundo-azul">
            <a href="canva?acao=MostrarCusto">
                <h3 id="">
                    <i class="large material-icons">local_offer
                    </i> Estrutura de custos
                </h3>
            </a>
        </div>
        <div class="accordion-item fundo-verde-com-azul">
            <a href="canva?acao=MostrarRenda">
                <h3 id="">
                    <i class="large material-icons">monetization_on
                    </i> Fontes de renda
                </h3>
            </a>
        </div>
        <div class="accordion-item bg-light">
          <div class="row">
            <a class="col-md-6" href="canva?acao=Sair" style="border-right: 1px solid #631A52">
                <h3 style="color: #631A52;" id="">
                    <i class="large material-icons">logout
                    </i> Sair
                </h3>
            </a>
          <a class="col-md-6" href="canva?acao=Componentes">
                <h3 style="color: #631A52;" id="">
                    <i class="large material-icons">home
                    </i> Canva
                </h3>
            </a>
          </div>
          
        </div>
    </div>
</body>
</html>