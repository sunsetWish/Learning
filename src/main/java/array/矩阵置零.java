package array;

import java.util.HashMap;

/**
 * 给定一个 m x n 的矩阵，如果一个元素为 0 ，则将其所在行和列的所有元素都设为 0 。请使用 原地 算法。
 */
public class 矩阵置零 {
    public static void main(String[] args) {
        int[][] array = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        int[][] ints = setZeroes(array);
        System.out.println(ints);

    }

    /**
     * 输入：matrix = [[1,1,1],[1,0,1],[1,1,1]]
     * 输出：[[1,0,1],[0,0,0],[1,0,1]]
     * @param matrix
     * @return
     */
    public static int[][] setZeroes(int[][] matrix) {
        boolean[] h = new boolean[matrix.length];
        boolean[] l = new boolean[matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j< matrix[0].length;j++){
                if(matrix[i][j] ==0){
                    h[i] = l[j] = true;
                }
            }
        }
        for (int i = 0; i < h.length; i++) {
            if (h[i]) {
                for (int j = 0; j < l.length; j++) {
                    matrix[i][j] = 0;
                }
            } else {
                for (int j = 0; j < l.length; j++) {
                    if (l[j]) {
                        matrix[i][j] = 0;
                    }
                }
            }
        }


//        for (int i = 0; i < h.length; i++) {
//            for (int j = 0; j < l.length; j++) {
//                if(h[i] || l[j]){
//                    matrix[i][j] = 0;
//                }
//            }
//
//        }
        return matrix;
    }
}

