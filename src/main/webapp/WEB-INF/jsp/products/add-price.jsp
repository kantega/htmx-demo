<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<tr>
    <td><form:input form="form-${command.id}" path="command.price" class="form-control form-control-sm"/></td>
    <td>
        <div class="d-flex">
            <form:input form="form-${command.id}" path="command.validFrom" class="form-control form-control-sm"/>
            <form:form id="form-${command.id}">
                <button class="btn btn-primary btn-sm ms-2"
                        hx-post="/products/${command.productId}/add-price"
                        hx-target="closest tr"
                        hx-swap="outerHTML"
                >
                    Add
                </button>
            </form:form>
        </div>
    </td>
</tr>
