<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width" />
        <meta content="Liga turma da cachaça FC." name="description" />
        <link rel="stylesheet" type="text/css"
              href="<c:url value='/public/bootstrap/css/bootstrap.min.css' />" />
        <link rel="stylesheet" type="text/css"
              href="<c:url value='/public/css/style.css' />" />
        <link rel="icon" href="<c:url value='/public/img/favicon.ico' />">
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

    <div class="col-md-11 center">
        <section>
            <h3 class="h3 text-center">Confira as parciais de todos os times
                da liga</h3>
            <br />

            <table class="table center table-responsive">
                <thead>
                    <tr>
                        <th>Escudo</th>
                        <th>Time</th>
                        <th>Jogador</th>
                        <th>Parcial</th>
                    </tr>
                </thead>

                <tbody>
                    <c:forEach var="t" items="${times}">
                        <tr>
                            <td><img src="${t.escudoSvg}" width="50px" /></td>
                            <td><strong>${t.nome}</strong></td>
                            <td><strong>${t.nomeJogador}</strong></td>
                            <td><strong style="color: green;">${t.formatPontos}</strong></td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </section>
        <h4 class="h5 text-muted">
            Desenvolvido por: <a href="mailto:naldson.bc@gmail.com"><u>Naldson Chagas</u></a>
        </h4>
    </div>
</body>
</html>