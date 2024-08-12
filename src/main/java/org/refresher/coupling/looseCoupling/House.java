package org.refresher.coupling.looseCoupling;

public interface House extends Comparable<House> {
    String getName();
    String getDescription();
    int getPrice();
}
