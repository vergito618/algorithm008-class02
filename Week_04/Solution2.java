package week4;

public class Solution2 {


    /**
     * 34. 在排序数组中查找元素的第一个和最后一个位置
     * @param nums
     * @param target
     * @return
     */
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[]{-1, -1};
        }
        int[] reslut = new int[2];
        reslut[0] = searchRangeFirst(nums, target);
        reslut[1] = searchRangeEnd(nums, target);
        return reslut;
    }

    public int searchRangeFirst(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            int cur = nums[mid];
            if (cur < target) {
                left = mid +  1;
            } else {
                right = mid;
            }
        }
        return nums[left] == target ? left : -1;
    }

    public int searchRangeEnd(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left + 1) / 2;
            int cur = nums[mid];
            if (cur > target) {
                right = mid - 1;
            } else {
                left = mid;
            }
        }
        return nums[left] == target ? left : -1;
    }

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.searchRange(new int[]{5,7,7,8,8,10}, 8));
    }

}
