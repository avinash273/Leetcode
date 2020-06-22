package LeetcodeAmazon;



/**
 * T: O(n k log n)
 *  N is the length of strs, and K is the maximum length of a string in strs.
 * S: O(n k)
 *
 */
public class groupAnagrams {
    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            List<List<String>> output = new ArrayList<>();
            HashMap<String, List<String>> map = new HashMap<>();

            for(String current: strs){
                char[] characters = current.toCharArray();
                Arrays.sort(characters);
                String sorted = new String(characters);

                if(!map.containsKey(sorted))
                    map.put(sorted, new ArrayList<String>());
                map.get(sorted).add(current);
            }
            output.addAll(map.values());
            return output;
        }
    }
}
