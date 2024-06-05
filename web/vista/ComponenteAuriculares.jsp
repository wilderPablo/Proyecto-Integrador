<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
     <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Auriculares</title>
        <link href="<%=request.getContextPath()%>/css/headerCSS.css" rel="stylesheet" type="text/css"/>
        <link href="<%=request.getContextPath()%>/css/footerCSS.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
        <link rel="icon" href="<%=request.getContextPath()%>/img/MgamatrixL.png" />
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
        <link href="<%=request.getContextPath()%>/css/producto.css" rel="stylesheet" type="text/css"/>
        <style>
            body {
                font-family: Arial, sans-serif;
                background-color: #f8f9fa;
                padding-top: 80px;
                transition: background-color 3s ease;
            }
        </style>
    </head>
    <jsp:include page="header.jsp" />
    <body>
        <div class="container mt-5">
            <div class="row">
                <c:forEach var="aur" items="${Auriculares}">
                    <div class="col-md-4 mb-4">
                        <div class="card">
                            <img src="${pageContext.request.contextPath}/img/${aur.getImagen()}" class="card-img-top" alt="Auriculares">
                            <div class="card-body">
                                <h5 class="card-title">${aur.getNombre()}</h5>
                                <p class="card-text">S/.${aur.getPrecio()}</p>
                                <a href="#" class="btn btn-primary">AÑADIR</a>
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </div>
        </div>
      
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
        <script>
            const colors = ['#f8f9fa', '#e0f7fa', '#ffeb3b', '#f44336', '#8bc34a'];
            let currentColorIndex = 0;

            function changeBackgroundColor() {
                document.body.style.backgroundColor = colors[currentColorIndex];
                currentColorIndex = (currentColorIndex + 1) % colors.length;
            }

            setInterval(changeBackgroundColor, 3000);
        </script>

    </body>
    <jsp:include page="footer.jsp" />
</html>
