import java.util.*;
public class reverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int reverse = 0;
        int digit = 0;
        while(num>0){
            digit = num%10;
            reverse = (reverse*10)+digit;
            num = num/10;
        }
        System.out.println("reverse number is "+reverse);
    }
} 