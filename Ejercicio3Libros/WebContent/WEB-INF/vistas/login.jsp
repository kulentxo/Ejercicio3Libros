<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="include/cabecera.jsp"%>
<main class="d-flex justify-content-center my-5">
        <form action="LoginServlet" method="post">
            <div class="mb-3">
                <label for="exampleInputEmail1" class="form-label">Correo electronico</label>
                <input type="text" class="form-control" id="exampleInputEmail1" name="email" aria-describedby="emailHelp">
            </div>
            <div class="mb-3">
                <label for="exampleInputPassword1" class="form-label">Contraseña</label>
                <input type="password" class="form-control" name="password" id="exampleInputPassword1">
            </div>
            <div class="mb-3 form-check">
                <input type="checkbox" class="form-check-input" id="exampleCheck1">
                <label class="form-check-label" for="exampleCheck1">Mantener sesion iniciado</label>
            </div>
            <button type="submit" class="btn btn-primary">Iniciar sesion</button>
             <p id="error">
        		${mensaje }
      		</p>
        </form>
       
    </main>
    <%@ include file="include/pie.jsp"%>