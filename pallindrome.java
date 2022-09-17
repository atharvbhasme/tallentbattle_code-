import java.util.*;
public class pallindrome {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter the number");
        int num  = sc.nextInt();
        int copy = num;
        int reverse = 0,digit=0;
        while(num!=0){
            digit = num%10;
            reverse = (reverse*10)+digit;
            num = num/10;
        } 
        if(copy==reverse){
           System.out.println(copy+" number is pallindrome");
        }else{
           System.out.println(copy+" number is not pallindrome");
        }
    }
}
