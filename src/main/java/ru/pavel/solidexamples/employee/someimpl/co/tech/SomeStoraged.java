package ru.pavel.solidexamples.employee.someimpl.co.tech;

import ru.pavel.solidexamples.employee.api.co.tech.Storagable;
import ru.pavel.solidexamples.employee.api.employee.EmployableData;

import java.util.Properties;

public class SomeStoraged implements Storagable {
    private final Properties properties;
    private final EmployableData employableData;

    public SomeStoraged(Properties properties, EmployableData employableData) {
        this.properties = properties;
        this.employableData = employableData;
    }

    @Override
    public void save() {
        String s = employableData.stringValue() + employableData.intValue() + employableData.bigDecimalValue().toString();
    }
}