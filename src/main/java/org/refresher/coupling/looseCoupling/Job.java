package org.refresher.coupling.looseCoupling;

import org.jetbrains.annotations.NotNull;

public class Job implements Money{
    @Override
    public int getSalary() {
        return 2;
    }
}
