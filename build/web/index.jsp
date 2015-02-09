
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:import url="cabecalho1.jsp" />
<title>SAP Concultores</title>
<link rel="stylesheet" type="text/css" href = "css/slideShow.css"/>
<script  type="text/javascript" src= "js/jquery.min.js"></script>
<script  type="text/javascript" src= "js/jquery.cycle.all.js"></script>
<script  type="text/javascript" src= "js/comandosSlideShow.js"></script>
<c:import url="cabecalho2.jsp" />
<c:import url="formularioEntrar.jsp" />
    <%-- Apresentação do Slide Show --%>
<div class="slideShow">
    <ul>
        <li> <img src="imagens/aSlide.jpg" alt="PrimeiraImagem"/> </li>
        <li> <img src="imagens/bSlide.jpg" alt="SegundaImagem"/> </li>
        <li> <img src="imagens/cSlide.jpg" alt="TerceiraImagem"/> </li>
        <li> <img src="imagens/dSlide.jpg" alt="QuartaImagem"/> </li>
    </ul>
</div>
<c:import url="rodape.jsp" />