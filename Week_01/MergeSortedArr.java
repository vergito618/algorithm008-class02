package week1;

/**
 * 88. 合并两个有序数组(第3课作业第4题)
 * 想到的解法：
 *    1.新建一个数组，将两个有序数组对比遍历添加到新数组
 *    2.分别为两个数组定义一个指针，从头开始遍历
 *    3.第一个数组有足够空间，两个数组都有序，从尾部遍历，避免移动大量元素
 */
public class MergeSortedArr {
    
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int tail = m + n -1;
        int p1 = m -1;
        int p2 = n -1;
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[tail--] = nums1[p1--];
            } else {
                nums1[tail--] = nums2[p2--];
            }
        }
        if (p1 >= 0) {
            while (p1 >= 0) {
                nums1[tail--] = nums1[p1--];
            }
        }
        if (p2 >= 0) {
            while (p2 >= 0) {
                nums1[tail--] = nums2[p2--];
            }
        }
    }

    public static void main(String[] args) {
        merge(new int[]{0,0},
        0,
        new int[]{1},
        1);
    }

}
