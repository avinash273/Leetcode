package org.code.Basics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RemoveAlternate {
    public static void main(String[] args) {
        try {
            File myObj = new File("/Users/avinashshanker/Desktop/CodeWorkSpace/IntelliJIdea/src/Basics/companies.txt");
            Scanner myReader = new Scanner(myObj);
            int i = 0;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if(i % 2 != 0)
                    System.out.println(data);
                i++;
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
