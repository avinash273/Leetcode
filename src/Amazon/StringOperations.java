package Amazon;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class StringOperations {
    public static void main(String[] args){
        try{
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
