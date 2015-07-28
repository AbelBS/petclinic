<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<t:wrapper>
    <h1 class="page-header">Especies</h1>
    
    <form action="${pageContext.request.contextPath}/gen/especie/save" method="post" class="form-inline">
        <input type="hidden" name="id" value="${especie.id}"/>
        <div class="form-group">
            <input type="text" class="form-control" placeholder="Especie" name="nombre" value="${especie.nombre}"/>
        </div>
        
        <button type="submit" class="btn btn-primary">Guardar</button>
    </form>
            
    <br/>
    
    <table class="table table-striped">
        <tr>
            <td><b>Especie</b></td>
            <td><b>Edicion</b></td>
            
        </tr>
        <c:forEach items="${especies}" var="e" varStatus="i">
            <tr>
                <td>${e.nombre}</td>
                <td>
                    <a href="${pageContext.request.contextPath}/gen/especie/update/${e.id}">Editar</a>
                    <a href="${pageContext.request.contextPath}/gen/especie/delete/${e.id}">Eliminar</a>
                </td>
                
            </tr>
        </c:forEach>
        
    </table>
</t:wrapper>