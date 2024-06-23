package org.code.Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class anagram {
    public ArrayList<ArrayList<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList();
        HashMap<String, List> ans = new HashMap<String, List>();
        System.out.println("strs:" + Arrays.toString(strs));
        for (String s : strs) {
            System.out.println("s:" + s);
            char[] ca = s.toCharArray();
            System.out.println("ca before:" + Arrays.toString(ca));
            Arrays.sort(ca);
            System.out.println("ca after:" + Arrays.toString(ca));
            String key = String.valueOf(ca);
            System.out.println("key:" + key);
            if (!ans.containsKey(key)) ans.put(key, new ArrayList());
            ans.get(key).add(s);
        }
        System.out.println("ans:" + ans);
        System.out.println("new ArrayListDo(ans.values())" + new ArrayList(ans.values()));
        return new ArrayList(ans.values());
    }
}
