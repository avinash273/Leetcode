package Leetcode;
import java.util.*;

class kFrequentWords {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        if(words.length == 0)
            return new ArrayList<String>();

        for(String each:words){
            if(!map.containsKey(each)){
                map.put(each,1);
            }
            else
                map.put(each,map.get(each)+1);
        }
        System.out.println(map);

        List<String> candidates = new ArrayList(map.keySet());
        System.out.println(candidates);
        Collections.sort(candidates, (w1, w2) -> map.get(w1).equals(map.get(w2)) ?
                w1.compareTo(w2) : map.get(w2) - map.get(w1));

        System.out.println(candidates);

        return candidates.subList(0, k);

    }
}
