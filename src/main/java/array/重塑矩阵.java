package array;

/**
 * 在 MATLAB 中，有一个非常有用的函数 reshape ，它可以将一个m x n 矩阵重塑为另一个大小不同（r x c）的新矩阵，
 * 但保留其原始数据。
 * 给你一个由二维数组 mat 表示的m x n 矩阵，以及两个正整数 r 和 c ，分别表示想要的重构的矩阵的行数和列数。
 * 重构后的矩阵需要将原始矩阵的所有元素以相同的 行遍历顺序 填充。
 * 如果具有给定参数的 reshape 操作是可行且合理的，则输出新的重塑矩阵；否则，输出原始矩阵。
 * 示列1:
 * 输入：mat = [[1,2],[3,4]], r = 1, c = 4
 * 输出：[[1,2,3,4]]
 */
public class 重塑矩阵 {
    public static void main(String[] args) {
        int[][] array = {{1,2,3,4,5,6}, {7,8,9,10,11,12}};
        int[][] ints = matrixReshape(array, 3, 4);
    }

    public static int[][] matrixReshape(int[][] mat, int r, int c){

        int m = mat.length;
        int n = mat[0].length;

        //判断这个二维数字的元素够不够新矩阵的排列 不等就直接返回原数组
        if(m*n != r*c){
            return mat;
        }

        int[][] result = new int[r][c];

        for (int x = 0; x < m * n; ++x) {
            //x/c 和 x%c 设置新数组的元素下标，x / n 和 x % n 拿原矩形的元素数据
            result[x / c][x % c] = mat[x / n][x % n];
        }

        return result;
    }
}
