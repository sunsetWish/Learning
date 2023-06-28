package string;

import java.util.Arrays;
import java.util.HashMap;

public class 优质字符串 {

    public static void main(String[] args) {
        int i = minDeletions("abc");
        System.out.println(i);
    }
    public static int minDeletions(String s) {
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < charArray.length; i++) {
            map.put(charArray[i],map.get(charArray[i])==null?1:map.get(charArray[i])+1);
        }

        int minDeletionsnums = 0;
        for (int i = 0; i < charArray.length; i++) {
            if(i!=charArray.length-1){
                if(charArray[i]!=charArray[i+1]){
                    if(map.get(charArray[i])== map.get(charArray[i+1])){
                        minDeletionsnums += map.get(charArray[i]);
                    }
                }
            }
        }
        return minDeletionsnums;
    }

//    int[] freq = new int[26];
//        for (int i = 0; i < s.length(); i++) {
//        freq[s.charAt(i) - 'a']++;
//    }
//        Arrays.sort(freq);
//    int maxCount = freq[25];
//    int numCharsToDelete = 0;
//        for (int i = 24; i >= 0; i--) {
//        if (freq[i] >= maxCount) {
//            if (maxCount == 0) {
//                numCharsToDelete += freq[i];
//            } else {
//                numCharsToDelete += freq[i] - maxCount + 1;
//                maxCount--;
//            }
//        } else {
//            maxCount = freq[i];
//        }
//    }
//        return numCharsToDelete;
}
