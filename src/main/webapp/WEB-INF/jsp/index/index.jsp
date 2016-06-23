<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:import url="../_comum/header.jsp"></c:import>
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
                    <td><a href="time/${t.slug}"><img src="${t.escudoSvg}" width="50px" /></a></td>
                    <td><a href="time/${t.slug}"><strong>${t.nome}</strong></a></td>
                    <td><strong>${t.nomeJogador}</strong></td>
                    <td><strong style="color: green;">${t.formatPontos}</strong></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</section>
<c:import url="../_comum/footer.jsp"></c:import>