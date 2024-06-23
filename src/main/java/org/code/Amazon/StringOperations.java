package org.code.Amazon;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class StringOperations {
    public static void main(String[] args){
        try{
            /**
             * Handling logs
             */
            FileHandler handler = new FileHandler("/Users/avinashshanker/Desktop/CodeWorks/IntelliJ_workspace/Leetcode/src/Amazon/StringOps.log");
            Logger logger = Logger.getLogger("String Ops");
            logger.addHandler(handler);
            logger.warning("warning message");
            logger.info("info message");

            /**
             * Handling files
             */
            String filename = "/Users/avinashshanker/Desktop/CodeWorks/IntelliJ_workspace/Leetcode/src/Amazon/test.txt";
            File file = new File(filename);
            FileInputStream fis = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
            BufferedReader br = new BufferedReader(isr);

            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
            br.close();
        }
        catch(Exception err){
            System.err.println(err);
        }
    }
}
