package ru.pavel.solidexamples.employee.someimpl.co.tech;

import ru.pavel.solidexamples.employee.api.co.tech.CTOable;
import ru.pavel.solidexamples.employee.api.co.tech.Storagable;

public class SomeCTO implements CTOable {
    private final Storagable storagable;

    public SomeCTO(Storagable storagable) {
        this.storagable = storagable;
    }

    @Override
    public void doSomething() {
        storagable.save();
    }
}
