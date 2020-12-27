package ru.pavel.solidexamples.employee.someimpl.co.hr;

import ru.pavel.solidexamples.employee.api.co.hr.COOable;
import ru.pavel.solidexamples.employee.api.co.hr.TimeWorkable;

import java.time.Duration;

public class SomeCOO implements COOable {
    private final TimeWorkable timeWorked;

    public SomeCOO(TimeWorkable timeWorked) {
        this.timeWorked = timeWorked;
    }

    @Override
    public void doSomething() {
        Duration hours = timeWorked.reportHours();
    }
}
