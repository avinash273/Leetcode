package org.refresher.coupling.looseCoupling;

public class LooseCouplingExample {
    public static void main(String[] args) {
        UserDataProvider dataProvider = new UserDatabaseProvider();
        UserManager userManager = new UserManager(dataProvider);

        UserDataProvider awsDataProvider = new AWSDataProvider();
        UserManager userManagerAWS = new UserManager(awsDataProvider);

        System.out.println(userManager.getUserInfo());
        System.out.println(userManagerAWS.getUserInfo());

    }
}
