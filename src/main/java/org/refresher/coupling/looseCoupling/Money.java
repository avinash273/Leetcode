package org.refresher.coupling.looseCoupling;

public interface Money  {
    default int getSalary(){
        return 3;
    }
}
