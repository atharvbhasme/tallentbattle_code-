import java.util.*;
public class pascalstriangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c=1,i,j,k;
        for(i=0;i<n;i++){
            for (k = 1; k <= n-i; k++) {
                System.out.print(" ");
            }
            for (j = 0;j <= i; j++) {
                if(i==0||j==0){
                    c=1;
                }else{
                    c = c*(i-j+1)/j;
                }
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}