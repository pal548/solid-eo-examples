package ru.pavel.solidexamples.employee.someimpl.employee;

import ru.pavel.solidexamples.employee.api.employee.EmployableData;

import java.math.BigDecimal;

public class EmployeeData implements EmployableData {
    private final int someInt;
    private final String someString;
    private final BigDecimal someBigDecimal;

    public EmployeeData(int someInt, String someString, BigDecimal someBigDecimal) {
        this.someInt = someInt;
        this.someString = someString;
        this.someBigDecimal = someBigDecimal;
    }

    @Override
    public int intValue() {
        return someInt;
    }

    @Override
    public String stringValue() {
        return someString;
    }

    @Override
    public BigDecimal bigDecimalValue() {
        return someBigDecimal;
    }
}
