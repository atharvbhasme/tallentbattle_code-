import java.util.*;
public class uppertraingular {
    public static void main(String[] args) {
        int[][] mat= { { 1, 3, 5, 3 },
        { 0, 4, 6, 2 },
        { 0, 0, 2, 5 },
        { 0, 0, 0, 6 } };
        boolean flag = true;
        for (int i = 1; i < mat.length; i++) {
            for (int j = 0; j < i; j++) {
                if (mat[i][j]!=0) {
                    flag = false;
                    break;
                }
            }
            if (!flag) {
                break;
            }
        }
        if (flag) {
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
