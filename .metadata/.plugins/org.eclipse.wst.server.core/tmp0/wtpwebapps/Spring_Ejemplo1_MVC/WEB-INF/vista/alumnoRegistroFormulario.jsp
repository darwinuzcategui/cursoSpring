<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulario de Registro</title>
</head>
<body>

<form:form action="procesarFormulario" modelAttribute="elAlumno">

Nombre: <form:input path="nombre"/>

<br><br><br>

Apellido: <form:input path="apellido"/>

<br><br><br>

Materias Optativas:<br/>

<form:select path="optativa" multiple="true">
	<form:option value="diseño" label="Diseño"></form:option>
	<form:option value="Beisbol" label="Beisbol"/>
	<form:option value="Comercio" label="Comercio"/>
	<form:option value="Baile" label="Baile"/>
	<form:option value="Dibujo" label="Dibujo"/>

</form:select>

<br><br><br>

<input type="submit" value="Enviar">



</form:form>


</body>
</html>