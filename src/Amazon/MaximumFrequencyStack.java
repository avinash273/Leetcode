package Amazon;

import java.util.HashMap;
import java.util.Stack;

/**
 * T: O(1)
 * S: O(n)
 */
public class MaximumFrequencyStack {
    class FreqStack {
        private HashMap<Integer, Integer> freq;
        private HashMap<Integer, Stack<Integer>> group;
        private int maxFreq;

        public FreqStack() {
            freq = new HashMap<>();
            group = new HashMap<>();
            maxFreq = 0;

        }

        public void push(int x) {
            int f = freq.getOrDefault(x, 0) + 1;
            freq.put(x, f);
            maxFreq = Math.max(maxFreq, f);
            if (!group.containsKey(f))
                group.put(f, new Stack<Integer>());
            group.get(f).add(x);
        }

        public int pop() {
            int x = group.get(maxFreq).pop();
            freq.put(x, maxFreq - 1);
            if (group.get(maxFreq).size() == 0)
                maxFreq--;
            return x;
        }
    }
}
