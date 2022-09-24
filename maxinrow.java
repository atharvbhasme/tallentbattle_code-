public class maxinrow {
    public static void main(String[] args) {
        int[][] ans = {{1,2,3},
        {6,5,4},
        {12,30,1}
        };
        for (int i = 0; i < 3; i++) {
            int max = 0;
            for (int j = 0; j < 3; j++) {
                if(ans[i][j]>max){
                    max = ans[i][j];
                }
            }
            System.out.println(max);
        }

    }
}
