<%@ include file="../common/navbar.jspf" %>

<div class="container">
    <br>
    <form method="post" action="add">
        <div class="form-group">
            <label for="name">Name</label>
            <input type="text"
                class="form-control" name="name" id="name" aria-describedby="helpId" value="${product.name}" />
            <small id="helpId" class="form-text text-muted">Help text</small>
        </div>
        <div class="form-group">
            <label for="make">Make</label>
            <input type="text"
                class="form-control" name="make" id="make" aria-describedby="helpId" value="${product.make}">
            <small id="helpId" class="form-text text-muted">Help text</small>
        </div>
        <div class="form-group">
            <label for="model">Model</label>
            <input type="text"
                class="form-control" name="model" id="model" aria-describedby="helpId" value="${product.model}">
            <small id="helpId" class="form-text text-muted">Help text</small>
        </div>
        <div class="form-group">
            <label for="price">Price</label>
            <input type="number"
                class="form-control" name="price" id="price" aria-describedby="helpId" value="${product.price}">
            <small id="helpId" class="form-text text-muted">Help text</small>
        </div>
        <div class="form-group">
            <label for="stock">Stock</label>
            <input type="number"
                class="form-control" name="stock" id="stock" aria-describedby="helpId" value="${product.stock}">
            <small id="helpId" class="form-text text-muted">Help text</small>
        </div>
        <div class="float-right">
            <button type="submit" class="btn btn-success">Save</button>
            <c:if test="${!empty product}">
                <a href="/products/delete/${product.id}" class="btn btn-outline-danger">Delete</a>
            </c:if>
        </div>
    </form>
</div>