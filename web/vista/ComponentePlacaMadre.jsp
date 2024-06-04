<%-- 
    Document   : ComponentePlacaMadre
    Created on : 3 jun. 2024, 23:29:07
    Author     : ander
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Placas Madre</title>
        <link href="<%=request.getContextPath()%>/css/headerCSS.css" rel="stylesheet" type="text/css"/>
        <link href="<%=request.getContextPath()%>/css/footerCSS.css" rel="stylesheet" type="text/css"/>
        <link href="<%=request.getContextPath()%>/css/indexCSS.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
        <link rel="icon" href="<%=request.getContextPath()%>/img/MgamatrixL.png" />
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
        <style>
            .producto {
                display: flex;
                flex-wrap: wrap;
                padding: 5px;
                margin-top: 100px;
                margin-bottom: 20px;
                margin-left: 20px;
                gap: 10px;
            }
        </style>
    </head>
    <jsp:include page="header.jsp" />
    <body>
        <div class="card-body placaMadre" >
            <c:forEach var="an" items="${PlacaMadre}">
                <div class="card" style="width: 18rem;">
                    <img src="${pageContext.request.contextPath}/img/${plm.getImagen()}" class="card-img-top" alt="PlacaMadre">
                    <div class="card-body">
                        <h5 class="card-title">${plm.getNombre()}</h5>
                        <p class="card-text">S/.${plm.getPrecio()}</p>
                        <a href="#" class="btn btn-primary">AÑADIR</a>
                    </div>
                </div>
            </c:forEach>
        </div>

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    </body>
</html>
