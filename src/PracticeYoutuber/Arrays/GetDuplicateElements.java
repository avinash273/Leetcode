package PracticeYoutuber.Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * First solution
 * T: O(n^2)
 * S: O(1)
 *
 *
 */
public class GetDuplicateElements {
    public List getDuplicates(int[] input){
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < input.length; i++){
            for(int j = 0; j < input.length; j++){
                if(i != j){
                    if(input[i] == input[j])
                        result.add(input[i]);
                }
            }
        }
        return result;
    }

    public List getDuplicates2(int[] input){
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int each : input){
            map.put(each, map.getOrDefault(each, 0) + 1);
        }

        for(int every : map.keySet()){
            if(map.get(every) > 1)
                result.add(every);
        }
        return result;
    }
}


