<%@ include file="../common/navbar.jspf" %>
<div class="container">
    <div class="card">
        <img class="card-img-top" src="${product.picture}" alt="">
        <div class="card-body">
            <h4 class="card-title">${product.name}</h4>
            <p class="card-text">Text</p>
            <a href="/orders/add/{product.id}" class="btn btn-outline-success btn-lg">Add to card</a>
        </div>
    </div>
</div>