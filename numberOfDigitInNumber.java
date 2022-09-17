import java.util.*;
public class numberOfDigitInNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int count = 0;
        if(num==0){
              System.out.println("the number is 0");
        }else{
            while(num!=0){
                num = num/10;
                ++count;
            }
            System.out.println("the number of digit in number is "+count);
        }
        
    }
}
