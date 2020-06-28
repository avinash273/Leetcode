package LeetcodeAmazon;

import java.util.TreeMap;

/**
 * T: O(log n) -> TreeMap in java has complexity of (log n) for get, put and remove operation
 * It basically implements red black tree
 * S: O(n)
 */

public class straightHandCards {
    class Solution {
        public boolean isNStraightHand(int[] hand, int W) {
            TreeMap<Integer, Integer> cardCounts = new TreeMap<>();
            for (int card : hand)
                cardCounts.put(card, cardCounts.getOrDefault(card, 0) + 1);

            System.out.println(cardCounts);

            while (cardCounts.size() > 0) {
                int firstCard = cardCounts.firstKey();
                for (int i = firstCard; i < firstCard + W; i++) {
                    if (!cardCounts.containsKey(i))
                        return false;

                    if (cardCounts.get(i) == 1)
                        cardCounts.remove(i);
                    else
                        cardCounts.put(i, cardCounts.get(i) - 1);
                }
            }
            return true;
        }
    }
}
