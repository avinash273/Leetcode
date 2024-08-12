package org.refresher.coupling.tightCoupling;

public class UserManager {
    private UserDatabase userDatabase = new UserDatabase();

    public String getUserInfo(){
        return userDatabase.getUserDetails();
    }
}
