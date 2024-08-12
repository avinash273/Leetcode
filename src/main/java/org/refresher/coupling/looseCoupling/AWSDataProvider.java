package org.refresher.coupling.looseCoupling;

public class AWSDataProvider implements UserDataProvider{
    @Override
    public String getUserDetails() {
        return "Fetching data AWS provider";
    }
}
