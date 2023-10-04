<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<tr>
    <td><fmt:formatNumber value="${price.amount}" type="currency" currencyCode="NOK"/></td>
    <td>${price.validFrom}</td>
    <td>
        <button class="btn btn-link text-danger"
                hx-delete="/products/${product.id}/prices/${price.id}"
                hx-target="closest tr"
                hx-swap="delete swap:1s"
        >
            <i class="bi bi-trash" ></i>
        </button>
    </td>
</tr>
