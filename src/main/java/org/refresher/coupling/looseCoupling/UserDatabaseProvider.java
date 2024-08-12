package org.refresher.coupling.looseCoupling;

// A - MySQL, PostgreSQL
// B - Web Service, MongoDB

public class UserDatabaseProvider implements UserDataProviderInterface {
    @Override
    public String getUserDetails() {
        return "User details from database";
    }
}
