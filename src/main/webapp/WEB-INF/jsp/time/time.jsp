<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:import url="../_comum/header.jsp"></c:import>
    <br>
    <section class="center text-center">
        <img src="${time.escudoSvg}" width="90px"/>
    <h2>${time.nome}</h2>
    <h2 style="color: green">${time.formatPontos}</h2>
</section>
<section>
    <table class="table center table-responsive center">
        <thead>
            <tr>
                <th></th>
                <th>Foto</th>
                <th>Nome</th>
                <th>Parcial</th>
            </tr>
        </thead>
        <tbody>
        <c:forEach items="${jogadores}" var="j">
            <tr>
                <td></td>
                <td><img src="${j.foto}" id="img_jogador" width="70px"/></td>
                <td>${j.nome}</td>
                <td><strong>${j.pontos}</strong></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</section>
<c:import url="../_comum/footer.jsp"></c:import>
