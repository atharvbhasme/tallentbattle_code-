import java.util.*;
public class noofdivisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int count = 0;
        for (int i = 1; i <=n; i++) {
            if (n%i==0) {
                count++;
            }
        }
        if (count==9) {
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
