import java.util.*;
public class pyramidnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <=n; i++) {
            for (int j = i; j <=n; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            for (int l = i-1; l >0; l--) {
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
