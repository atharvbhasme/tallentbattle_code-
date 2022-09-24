import java.util.*;
public class noofseats {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the seats");
        int n = sc.nextInt();
        System.out.println("enter the number of people");
        int r = sc.nextInt();
        int ans = fact(n)/fact(n-r);
        System.out.println(ans);
    }
    public static int fact(int n){
        int fact = 1;
        for (int i = 1; i <=n; i++) {
            fact= fact*i;
        }
        return fact;
    }
}
