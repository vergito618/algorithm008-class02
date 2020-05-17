package week4;


public class Solution3 {


    /**
     * 33. 搜索旋转排序数组
     * @param nums
     * @param target
     * @return
     */
    public int search(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            //按左中位数   
//            if (nums[mid] < nums[right]) {//说明右侧有序
//                if (nums[mid+1] <= target && target <= nums[right]) {
//                    left = mid + 1;
//                } else {
//                    right = mid;
//                }
//            } else {
//                if (nums[left] <= target && target <= nums[mid]) {
//                    right = mid;
//                } else {
//                    left = mid + 1;
//                }
//            }
            if (nums[left] < nums[mid]) {
                if (nums[left] <= target && target <= nums[mid]) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            } else {
                if (nums[mid+1] <= target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
        }
        return nums[left] == target ? left : -1;
    }

}
