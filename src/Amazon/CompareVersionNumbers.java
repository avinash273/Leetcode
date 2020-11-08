package Amazon;

/**
 * T: O(N+M+max(N,M))
 * S: O(N+M)
 */
public class CompareVersionNumbers {
    class Solution {
        public int compareVersion(String version1, String version2) {
            String[] nums1 = version1.split("\\.");
            String[] nums2 = version2.split("\\.");
            int n1 = nums1.length;
            int n2 = nums2.length;
            int ver1, ver2;

            for (int i = 0; i < Math.max(n1, n2); i++) {
                ver1 = i < n1 ? Integer.parseInt(nums1[i]) : 0;
                ver2 = i < n2 ? Integer.parseInt(nums2[i]) : 0;

                if (ver1 != ver2)
                    return ver1 > ver2 ? 1 : -1;
            }
            return 0;
        }
    }
}
