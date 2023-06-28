package array;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 两个数组的交集
 * 给你两个整数数组 nums1 和 nums2 ，请你以数组形式返回两数组的交集。
 * 返回结果中每个元素出现的次数，应与元素在两个数组中都出现的次数一致（如果出现次数不一致，则考虑取较小值）。
 * 可以不考虑输出结果的顺序。
 * 示例 1：
 * 输入：nums1 = [1,2,2,1,4,5], nums2 = [2,2]
 * 输出：[2,2]
 * 示例 2:
 * 输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出：[4,9]
 */
public class 两个数组的交集 {
    public static void main(String[] args) {
        int[] nums1 = new int[]{4,9,5};
        int[] nums2 =new int[]{9,4,9,8,4};
        intersect(nums1, nums2);
    }

    /**
     * 解题思路
     * 1、使用map将nums1中的元素添加一遍，将重复的元素的值加 1 。
     * 2、遍历nums2数组，判断nums2中元素在map中存不存在。
     * 3、如果在map中存在就将这个元素添加到 array数组中，并且将map中元素的值减 1。
     * 用标识当前元素在nums1数组中有相同的。
     * @param nums1
     * @param nums2
     * @return
     */
    public static int[] intersect(int[] nums1, int[] nums2){
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>(nums1.length);
        int[] array = new int[nums1.length];
        int index = 0;
        for (int i = 0; i < nums1.length; i++) {
            //判断当前元素在map中存不存在
            if(map.containsKey(nums1[i])){
                //存在就将当前元素的值加1
                map.put(nums1[i],map.get(nums1[i])+1);
                continue;
            }
            //不存在就将元素放入map中
            map.put(nums1[i],1);
        }

        for (int i = 0; i < nums2.length; i++) {
            //判断当前元素在map中存不存在
            if(map.containsKey(nums2[i])){
                //校验当前元素的值是否大于0
                if(map.get(nums2[i])>0){
                    //讲当前元素的值减1，标识当前元素与nums2有交集
                    map.put(nums2[i],map.get(nums2[i])-1);
                    //将有交集的当前元素放入结果集数组中
                    array[index++] = nums2[i];
                }
            }
        }
        return Arrays.copyOfRange(array,0,index);
    }
}
