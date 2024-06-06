<%-- 
    Document   : verificar
    Created on : 6 jun. 2024, 10:29:43
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Verificación</title>
</head>
<body>
    <span>Vamos a verificar tu correo electrónico</span>
    <form action="SVVerificarCodigo" method="post">
        <input type="text" name="authcode" required>
        <input type="submit" value="Verify">
    </form>
</body>
</html>
