<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:import url="../_comum/header.jsp"></c:import>
    <br><br>
    <section class="center text-center">
        <img src="${time.escudoSvg}" width="90px"/>
    <h2>${time.nome}</h2>
    <h2 id="pontos">${time.pontos}</h2>
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
                    <td><strong>${j.pontos}</strong></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</section>
<script src="<c:url value='/public/js/jquery.js'></c:url>"></script>
<script>
    $(document).ready(function () {
        var pontos = document.getElementById('pontos').textContent;
        var pontosId = document.getElementById('pontos');
        
        if (parseFloat(pontos) > 0) {
            pontosId.style.color = "green";
        } else if (parseFloat(pontos) < 0) {
            pontosId.style.color = "red";
        }
    });
</script>
<c:import url="../_comum/footer.jsp"></c:import>