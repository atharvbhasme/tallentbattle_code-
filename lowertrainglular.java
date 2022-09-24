public class lowertrainglular {
    public static void main(String[] args) {
        int mat[][] = { { 1, 0, 0, 0 },
        { 1, 4, 0, 0 },
        { 4, 6, 2, 0 },
        { 0, 4, 7, 6 } };
        boolean flag = true;
        for (int i = 0; i < mat.length-1; i++) {
            for (int j = i+1; j < mat.length; j++) {
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
