import java.util.*;
public class daimondrow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            //upper part
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
            // lower part
            for (int j = n-1; j>0; j--) {
                for (int j2 = 1; j2 <= n-j; j2++) {
                    System.out.print(" ");
                }
                for (int j2 = 1; j2 <= 2*j-1; j2++) {
                    System.out.print(j);
                }
                System.out.println();
            }
           
    }
}
