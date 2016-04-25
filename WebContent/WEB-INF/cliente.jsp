<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro de Clientes</title>
    </head>
    <body>
        <form:form action="cliente" method="post" enctype="multipart/form-data">
            Nome:
            <input type="text" size="20" id="nome" name="nome" />
            SobreNome:
            <input type="text" size="20" id="SobreNome" name="SobreNome" />
            Email:
            <input type="text" size="60" id="email" name="email" />
            
            <input type="submit" value="Enviar" />
        </form:form>
    </body>
</html>