package LeetcodeAmazon;

import java.util.*;

/**
 * T: O(m)
 * S: O(n)
 */

public class movingAverage {
    class MovingAverage {
        private Queue<Integer> queue;
        private int maxSize;
        private double sum;
        /** Initialize your data structure here. */
        public MovingAverage(int size) {
            queue = new LinkedList<Integer>();
            maxSize = size;
            sum = 0.0;
        }

        public double next(int val) {
            if(queue.size() == maxSize)
                sum -= queue.remove();

            queue.add(val);
            sum += val;
            return sum / queue.size();
        }
    }

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */
}
