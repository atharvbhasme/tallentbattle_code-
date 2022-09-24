import java.util.*;
public class matrixmultiplication {
    public static void main(String[] args) {
        int[][] arr1 = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int[][] arr2 = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int[][] ans = new int[arr1.length][arr2.length];
        int i,j;
        for (i = 0; i < ans.length; i++) {
            for (j = 0; j < ans.length; j++) {
                ans[i][j] = 0;
                for(int k=0;k<ans.length;k++)        
                {
                            ans[i][j] = ans[i][j] + (arr1[i][k] * arr2[k][j]);
                }
            }
        }
        System.out.println(Arrays.deepToString(ans));
    }
}
