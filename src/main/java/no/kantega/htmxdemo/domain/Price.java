package no.kantega.htmxdemo.domain;

import java.time.LocalDate;

public class Price {

    private LocalDate validFrom;
    private double amount;

    public Price(LocalDate validFrom, double amount) {
        this.validFrom = validFrom;
        this.amount = amount;
    }

    public LocalDate getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(LocalDate validFrom) {
        this.validFrom = validFrom;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
