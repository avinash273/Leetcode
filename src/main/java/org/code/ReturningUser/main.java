package org.code.ReturningUser;

import java.util.Set;

public class main {
    public static void main(String[] args){
        String day1Path = "src/ReturningUser/Day1.txt";
        String day2Path = "src/ReturningUser/Day2.txt";

        FileReader user1 = new FileReader();
        FileReader user2 = new FileReader();

        Set<String> Day1Users = user1.userLoggedIn(day1Path);
        Set<String> Day2Users = user1.userLoggedIn(day2Path);

        System.out.println("Day1Users: " + Day1Users.size());
        System.out.println("Day2Users: " + Day2Users.size());

        float lastDayUser = 0;
        float currentLoggedInCount = Day2Users.size();
        float perecentReturn;
        //DecimalFormat df = new DecimalFormat("0.00");
        //more precise

        for(String user : Day2Users){
            if(Day1Users.contains(user)){
                lastDayUser++;
            }
        }

        System.out.println("lastDayUser: " + lastDayUser);
        perecentReturn = (lastDayUser / currentLoggedInCount) * 100;
        //df.setRoundingMode(RoundingMode.UP);
        System.out.printf("Percentage of returning user is: %.2f" , perecentReturn);
    }
}
