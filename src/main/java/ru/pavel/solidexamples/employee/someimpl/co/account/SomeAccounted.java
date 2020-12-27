package ru.pavel.solidexamples.employee.someimpl.co.account;

import ru.pavel.solidexamples.employee.api.co.account.Accountable;
import ru.pavel.solidexamples.employee.api.employee.EmployableData;

import java.math.BigDecimal;
import java.util.Properties;

public class SomeAccounted implements Accountable {
    private final Properties properties;
    private final EmployableData employableData;

    public SomeAccounted(Properties properties, EmployableData employableData) {
        this.properties = properties;
        this.employableData = employableData;
    }

    @Override
    public BigDecimal calculatePay() {
        return new BigDecimal(employableData.intValue());
    }
}
