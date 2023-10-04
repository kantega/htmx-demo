<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<tr>
    <td><fmt:formatNumber value="${price.amount}" type="currency" currencyCode="NOK" /></td>
    <td>${price.validFrom}</td>
</tr>
