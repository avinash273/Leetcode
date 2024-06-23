package org.code.LeetcodeAmazon;

import java.util.Arrays;

/**
 * T: O(max(n,m) log m,n) m->g and n->s
 * S: O(1)
 */
public class assignCookies {

    class Solution {
        public int findContentChildren(int[] g, int[] s) {
            //sorting to order
            Arrays.sort(g);
            Arrays.sort(s);

            int contentChild = 0;
            //start from last to get most, greediest and biggest cookie
            int i = g.length - 1; //greedy children to be staisfied
            int j = s.length - 1; //cookies

            while (i >= 0 && j >= 0) {
                //if cookie size if greater or equal, give to the greediest child
                if (s[j] >= g[i]) {
                    //increment only when a child is staisfied
                    contentChild++;
                    j--;
                    i--;
                }
                //if greediest child was not satisfies, just move to next
                else {
                    i--;
                }
            }
            return contentChild;
        }
    }
}
