package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 给定一个整数数组 nums和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那两个整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * 你可以按任意顺序返回答案。
 * 示例 1：
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 * 示例 2：
 * 输入：nums = [3,2,4], target = 6
 * 输出：[1,2]
 */
public class 两数之和 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7};
        int len = nums.length;
        int target = 6;
        int[] sums = sums(nums, len, target);
        for (int sum : sums) {
            System.out.print(sum+",");
        }
    }

    /**
     * 解体思路
     * 用哈希表记录target-nums[i]的值
     * 每次循环的时候先判断一下target-nums[i]在map里存不存在，不存在就存入map，
     * 存在就直接返回当前nums[i]和target-nums[i]的下标
     * @param nums  数组
     * @param len   数组长度
     * @param target 和
     * @return 两数之和的下标
     */
    private static int[] sums(int[] nums, int len, int target) {
        HashMap<Integer,Integer> hashMap = new HashMap<Integer, Integer>(len -1);
        hashMap.put(nums[0],0);
        for(int i = 1; i<= len -1; i++){
            if(hashMap.containsKey(target - nums[i])){
                return new int[]{hashMap.get(target - nums[i]), i};
            }
            hashMap.put(nums[i], i);
        }
        return new int[0];
    }
}
