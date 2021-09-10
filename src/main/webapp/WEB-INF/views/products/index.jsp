<%@ include file="../common/navbar.jspf" %>

<div class="container">
    <br>
    <c:if test="${user.profil == 'ADMIN'}">
        <div class="float-right">
            <a href="new" class="btn btn-outline-primary">Add Product</a>
        </div>
        <br><br>
    </c:if>
    <div class="row">
        <c:forEach items="${products}" var="product">
            <div class="col-4">
                <div class="card text-left">
                  <img class="card-img-top" src="holder.js/100px180/" alt="">
                  <div class="card-body">
                    <h4 class="card-title">${product.name}</h4>
                    <p class="card-text">$ ${product.price} </p>
                    <c:choose>
                        <c:when test="${user.profil == 'ADMIN'}">
                            <a href="edit/${product.id}" class="btn btn- btn-block text-white" style="background-color: #2980b9;">Edit</a>
                        </c:when>
                        <c:otherwise>
                            <div class="row">
                                <div class="col"><a href="show/${product.id}" class="btn btn-warning btn-block" style="background-color: #16a085;">Details</a></div>
                                <div class="col"><a href="add/${product.id}" class="btn btn-success btn-block" style="background-color: #d35400;">Add to Card</a></div>
                            </div>
                        </c:otherwise>
                    </c:choose>
                  </div>
                </div>
            </div>
        </c:forEach>
    </div>
</div>