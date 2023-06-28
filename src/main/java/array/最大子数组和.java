package array;

/**
 * 给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 *
 * 子数组 是数组中的一个连续部分。
 *
 * 示例 1：
 *
 * 输入：nums = [-2,1,-3,4,-1,2,1,-5,4]
 * 输出：6
 * 解释：连续子数组[4,-1,2,1] 的和最大，为 6。
 */
public class 最大子数组和 {
    public static void main(String[] args) {
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int sums = sums(nums);
        System.out.println(sums);
    }

    //求最大子数组和
    public static int sums(int[] nums){
        //记录数组的当前相加之和
        int pre = 0;
        //记录最大相加之和
        int sum = nums[0];
        for (int num : nums) {
            //记录当前数组相加之和与下一个元素相加的值那个大
            pre = Math.max(pre+num,num);
            //记录当前和跟最大和两者最大的值
            sum = Math.max(pre,sum);
        }
        return sum;
    }
}
