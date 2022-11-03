<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="styLesheet type="text/css" href="${pageContext.request.contextPath}/recursos/estilos/miEstilo.css">
</head>
<body>
Hola  ${param.nombreAlumno }. Bienvenido al curso Spring

<p><br>
<h2>Antención a todos</h2>
${mensajeClaro}
<p>
<!--pageContext.request.contextPath esto devuelve la ubiucacion raiz del proyecto  -->
<img alt="foto" src="${pageContext.request.contextPath}/recursos/img/img.jpg">

</body>
</html>