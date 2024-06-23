package org.code.LeetcodeAmazon;

import java.util.List;
import java.util.Stack;

/**
 * T: O(n)
 * S: (n)
 * https://leetcode.com/problems/keys-and-rooms/
 */
public class keysAndRooms {
    class Solution {
        public boolean canVisitAllRooms(List<List<Integer>> rooms) {
            if(rooms == null)
                return false;

            boolean[] unlocked = new boolean[rooms.size()];
            unlocked[0] = true;

            Stack<Integer> keys = new Stack<>();
            keys.push(0);

            while(!keys.isEmpty()){
                for(int newKey : rooms.get(keys.pop())){
                    if(!unlocked[newKey]){
                        unlocked[newKey] = true;
                        keys.push(newKey);
                    }
                }
            }

            for(int i = 0; i < unlocked.length; i++){
                if(!unlocked[i])
                    return false;
            }

            return true;
        }
    }
}
