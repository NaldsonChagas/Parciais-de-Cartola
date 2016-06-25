<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:import url="../_comum/header.jsp"></c:import>
    <br><br>
    <section class="center text-center">
        <img src="${time.escudoSvg}" width="90px"/>
    <h2>${time.nome}</h2>
</section>
<section>
    <table class="table center table-responsive center">
        <thead>
            <tr>
                <th></th>
                <th>Time</th>
                <th>Nome</th>
                <th>Parcial</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${jogadores}" var="j">
                <tr>
                    <td><img src="${j.foto}" id="img_jogador" width="70px"/></td>
                    <td>${j.nome}</td>
                    <td>${j.pontos}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</section>
<c:import url="../_comum/footer.jsp"></c:import>