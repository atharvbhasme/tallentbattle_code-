import java.util.*;
public class diamondcol {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        // upper part
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i ; j++) {
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print(k);
            }
            System.out.println();
        }
        // lower part
        for (int i = n-1; i >0; i--) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
