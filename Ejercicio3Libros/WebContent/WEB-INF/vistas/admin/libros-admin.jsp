<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="../include/cabecera.jsp"%>
    <main>
    <table class="table table-striped">
		  <thead>
		    <tr>
		      <th scope="col">Id</th>
		      <th scope="col">Nombre</th>
		      <th scope="col">Precio</th>
		      <th scope="col">Descuento</th>
		      <th scope="col">Opciones</th>
		    </tr>
		  </thead>
		  <tbody>
		    <tr>
		      <th scope="row">1</th>
		      <td>Libro1</td>
		      <td>12€</td>
		      <td>%12</td>
		      <td><button type="button" class="btn btn-primary">Editar</button><button type="button" class="btn btn-danger">Borrar</button></td>
		    </tr>
		    <tr>
		      <th scope="row">2</th>
		     <td>Libro1</td>
		      <td>12€</td>
		      <td>%12</td>
		      <td><button type="button" class="btn btn-primary">Editar</button><button type="button" class="btn btn-danger">Borrar</button></td>
		    </tr>
		    <tr>
		      <th scope="row">3</th>
		   	  <td>Libro1</td>
		      <td>12€</td>
		      <td>%12</td>
		      <td><button type="button" class="btn btn-primary">Editar</button><button type="button" class="btn btn-danger">Borrar</button></td>
		    </tr>
		  </tbody>
		</table>
		<button type="button" class="btn btn-secondary">Añadir libro</button>
    </main>	
    <%@ include file="../include/pie.jsp"%>