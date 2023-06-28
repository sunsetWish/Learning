package array;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个非负整数 numRows，生成「杨辉三角」的前 numRows 行。
 * 在「杨辉三角」中，每个数是它左上方和右上方的数的和。
 * 示例 1:
 * 输入: numRows = 5
 * 输出: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 * 示例 2:
 * 输入: numRows = 1
 * 输出: [[1]]
 */
public class 杨辉三角 {
    public static void main(String[] args) {
        List<List<Integer>> generate = generate(2);
        System.out.println(generate);
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        //传入的行数循环
        for(int i=0;i<numRows;i++){
            List<Integer> rows = new ArrayList<>();
            //根据行数往list中填入
            for(int j=0;j<=i;j++){
                //第一个元素和最后一个元素都为 1
                if(j==0 || j==i){
                    rows.add(1);
                }else{
                    //第二行的数据都是基于第一行的数据 左一加左二 依次类推的相加值
                    List<Integer> integers = result.get(i - 1);
                    //将对应下标的值填入数组中
                    rows.add(integers.get(j-1)+integers.get(j));
                }
            }
            result.add(rows);
        }
        return result;
    }
}
