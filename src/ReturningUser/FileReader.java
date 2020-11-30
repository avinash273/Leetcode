package ReturningUser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

//what are states in java
public class FileReader {
    public Set<String> userLoggedIn(String path){
        HashSet<String> userSet = new HashSet<>();
        try{
            String filename = path;
            File file = new File(filename);
            FileInputStream fis = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);

            String line;

            while((line = br.readLine()) != null){
                String[] words = line.toLowerCase().split("//W+");
                userSet.add(words[0]);
            }

        }
        catch (Exception e){
            System.err.println(e);
        }
        return userSet;
    }


}
