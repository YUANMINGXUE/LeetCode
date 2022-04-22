
// @Title: 螺旋矩阵 II (Spiral Matrix II)
// @Author: 2692203539@qq.com
// @Date: 2022-03-15 16:43:44
// @Runtime: 0 ms
// @Memory: 39.5 MB

class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix =new int[n][n];
        int loop =n/2;
        int count = 1;
        int start=0,end=n-1;
        while (loop>0){
            for(int i=start;i<end;i++){
                matrix[start][i]=count++;
            }
            for(int i=start;i<end;i++){
                matrix[i][end]=count++;
            }
            for (int i=end;i>start;i-- ){
                matrix[end][i] =count++;
            }
            for (int i=end;i>start;i-- ){
                matrix[i][start] =count++;
            }
            loop--;
            start++;
            end--;
        }
        if(n%2==1)matrix[n/2][n/2]=count;
        return matrix;
    }
}

