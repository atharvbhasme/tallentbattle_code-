import java.util.*;
public class sumofdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int sum = 0;
        int r = 0;
        while(num>0){
            r = num%10;
            sum = sum + r;
            num = num/10;
        }
        System.out.println(sum);
    }
}
