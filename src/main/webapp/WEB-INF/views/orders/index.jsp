<%@ include file="../common/navbar.jspf" %>

<div class="container">
    <c:choose>
        <c:when test="${user.profil == 'ADMIN'}">
            <table class="table table-striped table-hover">
                <thead class="thead-dark">
                    <tr>
                        <th>N°</th>
                        <th>Date</th>
                        <th>Client</th>
                        <th>Cost</th>
                    </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="$orders" var="order">
                            <tr>
                                <td>${order.id}</td>
                                <td>${order.date}</td>
                                <td>${order.user.username}</td>
                                <td>${order.total}</td>
                            </tr>
                        </c:forEach>
                    </tbody>
            </table>
        </c:when>
        <c:otherwise>
            <br>
            <div class="float-right">
                <a href="save" class="btn btn-success <c:if test="${fn:length(user.ordered) == 0}">disabled</c:if>" >Save Command</a>
                <br><br>
            </div>
            <table class="table table-hover">
                <thead class="thead-light">
                    <tr>
                        <th>Product</th>
                        <th>Quantity</th>
                        <th>Total</th>
                    </tr>
                    </thead>
                    <tbody>
                        <c:set var="total" value="0" scope="page"/>
                        <c:forEach items="${user.ordered}" var="product">
                            <tr>    
                                <td>${product.name}</td>
                                <td>${product.command}</td>
                                <td>$ ${product.command * product.price}</td>
                                <td>
                                    <a href="remove/${product.id}" class="text-danger"><i class="fa fa-trash-o" aria-hidden="true"></i></a>
                                </td>
                            </tr>
                            <c:set var="total" value="${total + (product.command * product.price)}" />
                        </c:forEach>
                        <tr>
                            <td>Total</td>
                            <td></td>
                            <td >${total}</td>
                            
                        </tr>
                    </tbody>
            </table>
        </c:otherwise>
    </c:choose>
</div>