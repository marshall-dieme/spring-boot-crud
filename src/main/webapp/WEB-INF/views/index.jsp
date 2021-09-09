<%@ include file="common/header.jspf" %>

<div class="container">
    <div class="float-none">
        <div class="card text-dark bg-light">
          <div class="card-body">
            <h2 class="card-title">Login</h2>
            <p>${credential}</p>
            <form action="login" method="POST">
                <div class="form-group">
                  <label for="username">Username</label>
                  <input type="text"
                    class="form-control" name="username" id="username" aria-describedby="helpId" placeholder="">
                  <small id="helpId" class="form-text text-muted">Username</small>
                </div>
                <div class="form-group">
                  <label for="password">Password</label>
                  <input type="password"
                    class="form-control" name="password" id="password" aria-describedby="helpId" placeholder="">
                  <small id="helpId" class="form-text text-muted">Password</small>
                </div>
                <button type="submit" class="btn btn-primary btn-block">Login</button>
            </form>
          </div>
        </div>
    </div>
</div>

<%@ include file="common/footer.jspf" %>