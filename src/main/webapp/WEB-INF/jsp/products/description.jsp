<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<div class="card-header">
    <h2>${product.name}</h2>
    <p>${product.description}</p>
    <table>
        <tr>
            <th>Current stock:</th>
            <td>${product.stockQuantity}</td>
        </tr>
        <tr>
            <th>Current price:</th>
            <td><fmt:formatNumber value="${product.price}" type="currency"/></td>
        </tr>
    </table>
</div>
