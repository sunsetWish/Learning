package string;

import java.util.HashMap;

public class 赎金信 {
    /**
     * 给你两个字符串：ransomNote 和 magazine ，判断 ransomNote 能不能由 magazine 里面的字符构成。
     * 如果可以，返回 true ；否则返回 false 。
     * magazine 中的每个字符只能在 ransomNote 中使用一次。
     * @param args
     */
    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aab";
        System.out.println(canConstruct(ransomNote, magazine));
    }

    /**
     * 1、用map来记录magazine字符串中的字符出现的数量
     * 2、遍历ransomNote字符串将字符作为key去map中寻找存不存在，不存在就直接返回false
     * 3、存在就将key的值减一，如果当前key的值为0也直接返回false
     * @param ransomNote
     * @param magazine
     * @return
     */
    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            if(map.containsKey(magazine.charAt(i))){
                map.put(magazine.charAt(i),map.get(magazine.charAt(i))+1);
            }else{
                map.put(magazine.charAt(i),1);
            }

        }

        for(int j =0;j<ransomNote.length();j++){
            if(map.containsKey(ransomNote.charAt(j))){
                if(map.get(ransomNote.charAt(j))==0){
                    return  false;
                }
                map.put(ransomNote.charAt(j),map.get(ransomNote.charAt(j))-1);
            }else{
                return false;
            }
        }
        return true;
    }
}
