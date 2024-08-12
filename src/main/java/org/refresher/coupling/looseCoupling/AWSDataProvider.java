package org.refresher.coupling.looseCoupling;

public class AWSDataProvider implements UserDataProviderInterface {
    @Override
    public String getUserDetails() {
        return "Fetching data AWS provider";
    }
}
