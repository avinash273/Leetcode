package Amazon;

import java.util.PriorityQueue;

/**
 * T: O(5 log n) + O(1) ~ O(log n)
 * 3heap insertions + 2 deletions = 5  and O(1) for calculating median
 * S: O(n)
 */
public class FindMedianFromDataStream {
    class MedianFinder {

        private PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        private PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        public MedianFinder() {

        }

        public void addNum(int num) {
            maxHeap.add(num);
            minHeap.add(maxHeap.poll());
            if (maxHeap.size() < minHeap.size())
                maxHeap.add(minHeap.poll());
        }

        public double findMedian() {
            return maxHeap.size() > minHeap.size() ? maxHeap.peek() : (maxHeap.peek() + minHeap.peek()) / 2.0;
        }
    }
}
