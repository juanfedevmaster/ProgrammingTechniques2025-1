<%-- 
    Document   : vehiculos
    Created on : 13/06/2025, 7:26:23 p. m.
    Author     : jufeq
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="Entidades.Vehiculo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Vehiculos MongoDB</title>
        <script src="https://code.jquery.com/jquery-3.7.1.js"></script>
        <script src="https://cdn.datatables.net/2.3.2/js/dataTables.js"></script>
        <link rel="stylesheet" href="https://cdn.datatables.net/2.3.2/css/dataTables.dataTables.css" />
    </head>
    <body>

        <% ArrayList<Vehiculo> vehiculos = (ArrayList<Vehiculo>) request.getAttribute("vehiculos");%>
        <table id="example" class="display">
            <thead>
                <tr>
                    <th>Brand</th>
                    <th>Name</th>
                    <th>Type</th>
                    <th>Year Introduced</th>
                </tr>
            <tbody>
                <%for(Vehiculo vehiculo : vehiculos){ %>
                <tr>
                    <td>
                        <%= vehiculo.getBrand() %>
                    </td>
                    <td>
                        <%= vehiculo.getName() %>
                    </td>
                    <td>
                        <%= vehiculo.getType() %>
                    </td>
                    <td>
                        <%= vehiculo.getYearIntroduced()%>
                    </td>
                </tr>                
                <% } %>
            </tbody>
            <tfoot>
                <tr>
                    <th>Brand</th>
                    <th>Name</th>
                    <th>Type</th>
                    <th>Year Introduced</th>
                </tr>
            </tfoot>
        </thead>
    </table>
    <script>
        new DataTable('#example');
    </script>
</body>
</html>
