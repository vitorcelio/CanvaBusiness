<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">
  <head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Rodape</title>
    <style>
      <c:import url="/WEB-INF/css/bootstrap.min.css"/>

      .redes-sociais li{
        margin-left: 5px;
        margin-right: 5px;
      }

      .redes-sociais li a{
        color: white;
      }

      .redes-sociais li a:hover{
        color: #8B0CB6;
      }
    </style>
  </head>
  <body>
    <footer style="vertical-align: bottom;padding-top: 15px; background: linear-gradient(to right, #38006B, #631A52);" class="navbar-dark">
      <h4 style="text-align: center; font-size: 15px" class="text-white">Copyright © 2021. Todos direitos reservados</h4>
      <nav class="navbar navbar-expand-lg ">

        <div class="collapse navbar-collapse justify-content-md-center">


          <ul class="redes-sociais justify-content-md-center navbar-nav">
            <li class="nav-item">
              <a style="font-size: 20px" target="_blank" href="https://instagram.com/vitucelio"><ion-icon name="logo-instagram"></ion-icon></a>
            </li>
            <li class="nav-item">
              <a style="font-size: 20px" target="_blank" href="https://github.com/vitorcelio"><ion-icon name="logo-github"></ion-icon></a>
            </li>
            <li class="nav-item">
              <a style="font-size: 20px" target="_blank" href="https://twitter.com/vitucelio"><ion-icon name="logo-twitter"></ion-icon></a>
            </li>
            <li class="nav-item">
              <a style="font-size: 20px" target="_blank" href=""><ion-icon name="logo-facebook"></ion-icon></a>
            </li>
          </ul>
        </div>
      </nav>

    </footer>
    <script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
    <script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>
  </body>
</html>