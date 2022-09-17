import java.util.*;
public class countprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range Start and End");
        int end = sc.nextInt();
        int count = 0;
        if(end<=1){
             System.out.println("please enter the right range");
        }else{
            for (int i = 0; i <= end; i++) {
               for (int j = 1; j <= i; j++) {
                       if(i%j==0){
                             count = count+1;
                       }
               }
            }
        }
        System.out.println(count);
    }
}
