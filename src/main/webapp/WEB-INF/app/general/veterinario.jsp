<%-- 
    Document   : veterinario
    Created on : 28/07/2015, 10:20:04 AM
    Author     : Obed
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<t:wrapper>

    <h1 class="page-header"> Veterinario</h1>
   <%--  
    
    <form action="${pageContext.request.contextPath}/gen/veterinario/save" method="post" class="form-inline">
        <input type="hidden" name="id" value="${veterinario.id}"/>

        <div class="form-group">
            <select name="persona.id" class="form-control">
                <c:forEach items="${persona}" var="p">
                    <option value="${p.id}" ${veterinario.persona.id==p.id? 'selected':''}>${p.nombres}</option>
                </c:forEach>
            </select>
        </div>

      
        
        <div class="form-group">
            <input type="text" class="form-control" placeholder="Fecha de Registro" name="nombre" value="${veterinario.fechaRegistro}" />
        </div>

        <button type="submit" class="btn btn-primary">Guardar</button>
  
    </form>
--%>
    <br/>

    <table class="table table-striped">
        <tr>
            <td><b>Veterinario</b></td>
            <td><b>Fecha de registro</b></td>
            <td></td>
        </tr>

        <c:forEach items="${veterinario}" var="v" varStatus="i">
            <tr>
                <td>${v.persona.nombres}</td>
                <td>${v.fechaRegistro}</td>
                <td>
                    <a href="${pageContext.request.contextPath}/gen/veterinario/update/${r.id}">Editar</a>
                    <a href="${pageContext.request.contextPath}/gen/veterinario/delete/${r.id}">Eliminar</a>
                </td>
            </tr>
        </c:forEach>
    </table>


</t:wrapper>