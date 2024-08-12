package org.refresher.coupling.looseCoupling;

public class UserManager {
    private UserDataProviderInterface userDataProvider;

    public UserManager(UserDataProviderInterface userDataProvider) {
        this.userDataProvider = userDataProvider;
    }

    public String getUserInfo(){
        return userDataProvider.getUserDetails();
    }
}
