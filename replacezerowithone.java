import java.util.*;
public class replacezerowithone{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int sum = 0;
        while(num!=0){
            int digit  = num%10;
            if(digit==0){
                  digit = 1;
            }
            sum = (sum*10) + digit; 
            num = num/10;
        }
        num = 0 ;
        while(sum>0)
        {
         int r = sum%10;
         num= num*10 + r;
         sum =sum / 10;
        }
         System.out.println("New number is: "+num);
    }
}