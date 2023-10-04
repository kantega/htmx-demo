<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<style>
    tr.htmx-swapping td {
        opacity: 0;
        transition: opacity 1s ease-out;
    }
</style>
<t:layout>
    <c:forEach var="product" items="${products}">
        <div class="card mb-3">
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
                        <td><fmt:formatNumber value="${product.price}" type="currency" currencyCode="NOK"/></td>
                    </tr>
                </table>
            </div>
            <div class="card-body">
                <button
                        class="btn btn-outline-primary"
                        hx-get="/products/${product.id}/add-price"
                        hx-target="next tbody"
                        hx-swap="afterbegin"
                >
                    Add price
                </button>
                <table class="table table-striped">
                    <thead>
                    <tr>
                        <th>Price</th>
                        <th>Valid from</th>
                        <th></th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="price" items="${product.prices}">
                        <%@ include file="price.jsp" %>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </c:forEach>
</t:layout>

