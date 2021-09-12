<%@ include file="../common/navbar.jspf" %>
<div class="container">
    <div class="row">
        <div class="col-2"></div>
        <div class="col-8">
            <div class="card">
                <img class="card-img-top" src="${product.picture}" alt="" width="100px" height="300px">
                <div class="card-body">
                    <h4 class="card-title text-center">${product.name}</h4>
                    <p class="card-text">
                        <ul>
                            <li>Make : ${product.make}</li>
                            <li>Model : ${product.model}</li>
                            <li>Price : $ ${product.price}</li>
                            <li>Stock : ${product.stock}</li>
                        </ul>
                    </p>
                    <a href="/orders/add/{product.id}" class="btn btn-outline-success btn-lg">Add to card</a>
                </div>
            </div>
        </div>
        <div class="col-2"></div>
    </div>
</div>