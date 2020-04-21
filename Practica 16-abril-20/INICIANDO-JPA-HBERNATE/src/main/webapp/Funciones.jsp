<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
</head>
<%
String idBus = request.getParameter("idBus");
String nombrePr = request.getParameter("NombreP");
String cantidadPr = request.getParameter("CantidadP");
String precioPr = request.getParameter("PrecioP");
String totalPr = request.getParameter("TotalP");

if(idBus==null){
	
	idBus="";
	nombrePr="";
	cantidadPr="";
	precioPr="";
	totalPr="";
	
}

%>
<body>


<form action="ServeletControler">
<table align="center">
	<thead>
		
	</thead>
  <tbody>
   <tr>
	<td>
		
	<p>Id</p><input type="text" name="Id" id="idcarga" value="<%=idBus%>">	 
	<p>Nombre producto</p><input type="text" name="Nproductos" id="NombreP" value="<%=nombrePr%>">
	<p>Precio producto</p><input type="text" name="Pproductos" id="PrecioP" value="<%=precioPr%>">		
	<p>Cantidad de producto</p><input type="text" name="Cproductos" id="CantidadP" value="<%=cantidadPr%>">		
	<p>Total de producto</p><input type="text" name="Tproductos" id="TotalP" value="<%=totalPr%>">		
	<br>
	<br>

	</td>	
   </tr>	
  </tbody>
  
</table>

<input type="submit" class="btn btn-info" value="Guardar" name="btn">
<input type="submit" class="btn btn-info" value="Actualizar" name="btn">

</body>
</html>