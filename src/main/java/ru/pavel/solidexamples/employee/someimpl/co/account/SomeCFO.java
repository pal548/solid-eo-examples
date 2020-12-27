package ru.pavel.solidexamples.employee.someimpl.co.account;

import ru.pavel.solidexamples.employee.api.co.account.Accountable;
import ru.pavel.solidexamples.employee.api.co.account.CFOable;

import java.math.BigDecimal;

public class SomeCFO implements CFOable {
    private final Accountable accountable;

    public SomeCFO(Accountable accountable) {
        this.accountable = accountable;
    }

    @Override
    public void doSomething() {
        BigDecimal pay = accountable.calculatePay();
    }
}
