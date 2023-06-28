package string;

import java.util.Arrays;

public class 有效的字母异位词 {
    /**
     * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
     * 注意：若s 和 t中每个字符出现的次数都相同，则称s 和 t互为字母异位词。
     * 示例:
     * 输入: s = "anagram", t = "nagaram"
     * 输出: true
     * 示例 2:
     * 输入: s = "rat", t = "car"
     * 输出: false
     * @param args
     */
    public static void main(String[] args) {

        System.out.println(isAnagram(new String("abcd"),new String("dgea")));
    }

    /**
     * 1、判断两个字符串的长度是否相同
     * 2、将两个字符串转成数组
     * 3、分别对两个数组进行排序
     * 4、比较两个数字的元素是否相同
     * @param s
     * @param t
     * @return
     */
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[] charArray = s.toCharArray();
        char[] charArray1 = t.toCharArray();
        Arrays.sort(charArray);
        Arrays.sort(charArray1);
        return Arrays.equals(charArray,charArray1);
    }
}
