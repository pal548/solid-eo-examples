package ru.pavel.solidexamples.employee.someimpl.co.hr;

import ru.pavel.solidexamples.employee.api.co.hr.TimeWorkable;
import ru.pavel.solidexamples.employee.api.employee.EmployableData;

import java.time.Duration;
import java.util.Properties;

public class SomeTimeWorked implements TimeWorkable {
    private final Properties properties;
    private final EmployableData employableData;

    public SomeTimeWorked(Properties properties, EmployableData employableData) {
        this.properties = properties;
        this.employableData = employableData;
    }

    @Override
    public Duration reportHours() {
        return Duration.ofHours(employableData.intValue());
    }
}