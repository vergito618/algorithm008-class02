package week4;

public class Solution1 {

    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        int left = 1;
        int right = x / 2;
        while (left < right) {
            int mid = left + (right - left) / 2;
            int square = mid * mid;
            if (square > x) {
                right = mid -1;
            } else {
                left = mid;
            }
        }
        return left;
    }

    /**
     * 704. 二分查找
     * @param nums
     * @param target
     * @return
     */
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cur = nums[mid];
            if (cur == target) {
                return mid;
            } else if (cur < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
    public int search1(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            //当出现left==mid时，需要+1向上取整，否则会死循环
            int mid = left + (right - left + 1) / 2;
            int cur = nums[mid];
            if (cur > target) {
                right = mid - 1;
            } else {
                left = mid;
            }
        }
        if (nums[left] == target) {
            return left;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.mySqrt(8));
    }

}
