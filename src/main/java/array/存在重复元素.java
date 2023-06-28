package array;

import java.util.Arrays;

/**
 * 给你一个整数数组 nums 。如果任一值在数组中出现 至少两次 ，返回 true ；如果数组中每个元素互不相同，返回 false 。
 *
 * 示例 1：
 *
 * 输入：nums = [1,2,3,1]
 * 输出：true
 * 示例 2：
 *
 * 输入：nums = [1,2,3,4]
 * 输出：false
 */
public class 存在重复元素 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,1};
        int[] nums1 = new int[]{1,2,3,4,5,6};
        System.out.println(inputNum(nums1));
        System.out.println(inputNum(nums));
    }

   public static boolean inputNum(int[] nums) {
       //第一步：先将数组排序
       Arrays.sort(nums);
       //第二步：循环数组，判断相邻的元素的值是否相等，相等直接返回true
       for (int i = 0; i < nums.length - 1; i++) {
           if (nums[i] == nums[i + 1]) {
               return true;
           }
       }
       return false;
   }
}
