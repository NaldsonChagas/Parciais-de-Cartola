<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width">
<link rel="stylesheet" type="text/css"
	href="<c:url value='/public/bootstrap/css/bootstrap.min.css' />" />
<link rel="stylesheet" type="text/css"
	href="<c:url value='/public/css/style.css' />" />
<title>Turma da Cachaça - Liga Cartola FC</title>
</head>
<body>
	<div class="top-line"></div>
	<header>
	<div class="col-md-6 center">
		<div class="text-center">
			<img src="<c:url value='/public/img/logo.png' />" width="120px" />
		</div>
		<h3 class="h3 text-center text-capitalize">Turma da cachaça FC</h3>
		<br />
	</div>
	</header>

	<section class="col-md-10 center">
	<h3 class="h3 text-center">Confira as parciais de todos os times
		da liga</h3>
	<br />

	<table class="table talbe-striped center">
		<thead>
			<tr>
				<th>Escudo</th>
				<th>Time</th>
				<th>Cartoleiro</th>
				<th>Pontuação</th>
			</tr>
		</thead>

		<tbody>
			<c:forEach var="t" items="${time}">
				<tr>
					<td><img src="${t.escudoSvg}"
						width="80px" /></td>
					<td>${t.nome}</td>
					<td>${t.nomeJogador}</td>
					<td>${t.pontos}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	</section>

	<footer>
	<h4 class="text-center h4" style="line-height: 35px">
		Desenvolvido por <strong><u>Naldson</u></strong>
	</h4>
	</a> </footer>
</body>
</html>