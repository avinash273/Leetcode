package org.refresher.coupling.looseCoupling;

public class LooseCouplingExample {
    public static void main(String[] args) {
        UserDataProviderInterface dataProvider = new UserDatabaseProvider();
        UserManager userManager = new UserManager(dataProvider);

        UserDataProviderInterface awsDataProvider = new AWSDataProvider();
        UserManager userManagerAWS = new UserManager(awsDataProvider);

        System.out.println(userManager.getUserInfo());
        System.out.println(userManagerAWS.getUserInfo());

    }
}
