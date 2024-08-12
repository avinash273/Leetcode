package org.refresher.coupling.tightCoupling;

// A - MySQL, PostgreSQL
// B - Web Service, MongoDB

public class UserDatabase {
    public String getUserDetails(){
        // Directly access database here
        return "User Details From Database";
    }
}
