

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1 aling="center">Pacientes</h1>
        <table style="border-collapse: collapse" cellpadding="7px" border="1" aling="center">
            <tr>
                <th>Cédula</th>
                <th>Nombre</th>
                <th>Apellido</th>
                <th>Fecha de Nacimiento</th>
                <th>Teléfono</th>
                <th>Consultorio</th>
                
        
            </tr>
              
            <c:forEach items="$(lst)" var="p">
                <tr>
                    <td>$(p.documento)</td>
                    <td>$(p.nombre)</td>
                    <td>$(p.apellido)</td>
                    <td>$(p.fechanac)</td>
                    <td>$(p.cel)</td>
                    <td>$(p.lugar_consulta)</td>
                    
                </tr>
        </table>
                
            </c:forEach>
        
        
        
        
        
        
        
        
        
    </body>
</html>
