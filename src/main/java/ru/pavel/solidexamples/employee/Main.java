package ru.pavel.solidexamples.employee;

import ru.pavel.solidexamples.employee.api.co.account.CFOable;
import ru.pavel.solidexamples.employee.api.co.hr.COOable;
import ru.pavel.solidexamples.employee.api.co.tech.CTOable;
import ru.pavel.solidexamples.employee.api.employee.EmployableData;
import ru.pavel.solidexamples.employee.someimpl.co.account.SomeAccounted;
import ru.pavel.solidexamples.employee.someimpl.co.account.SomeCFO;
import ru.pavel.solidexamples.employee.someimpl.co.hr.SomeCOO;
import ru.pavel.solidexamples.employee.someimpl.co.hr.SomeTimeWorked;
import ru.pavel.solidexamples.employee.someimpl.co.tech.SomeCTO;
import ru.pavel.solidexamples.employee.someimpl.co.tech.SomeStoraged;
import ru.pavel.solidexamples.employee.someimpl.employee.EmployeeData;

import java.math.BigDecimal;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        Properties someProps = new Properties();

        EmployableData someEmployeeData = new EmployeeData(123, "aaa bbb ccc", BigDecimal.valueOf(777.888f));

        SomeAccounted accounted = new SomeAccounted(someProps, someEmployeeData);
        SomeTimeWorked timeWorked = new SomeTimeWorked(someProps, someEmployeeData);
        SomeStoraged storaged = new SomeStoraged(someProps, someEmployeeData);

        CFOable cfo = new SomeCFO(accounted);
        COOable coo = new SomeCOO(timeWorked);
        CTOable cto = new SomeCTO(storaged);

        cfo.doSomething();
        coo.doSomething();
        cto.doSomething();
    }
}
