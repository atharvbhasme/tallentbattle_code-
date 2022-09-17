import java.util.*;
public class postiveornegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("enter the number");
        int num = sc.nextInt();
        if(num>0){
            if (num==0) {
                System.out.println("the number is 0");
            }else{
                System.out.println("number is positive");
            }

        }else{
           System.out.println("ther number is negative");
        }
    }
}
