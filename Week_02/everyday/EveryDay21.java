package April;

/**
 * 350. 两个数组的交集 II
 */
public class EveryDay21 {

    public int[] intersect(int[] nums1, int[] nums2) {

        return nums1;
    }

    /**
     * 392. 判断子序列
     * @param s
     * @param t
     * @return
     */
    public boolean isSubsequence(String s, String t) {
        char[] arr = s.toCharArray();
        int j = -1;
        for(int i = 0;i<arr.length;i++) {
            j = t.indexOf(arr[i],j+1);
            if(j==-1) {
                return false;
            }
        }
        return true;
    }

}
