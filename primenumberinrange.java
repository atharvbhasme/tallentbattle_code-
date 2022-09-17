import java.util.*;
public class primenumberinrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range Start and End");
        int start = sc.nextInt();
        int end = sc.nextInt();
        if(end<=1){
             System.out.println("please enter the right range");
        }else{
            for (int i = start; i <= end; i++) {
               int count = 0;
               for (int j = 1; j <= i; j++) {
                       if(i%j==0){
                             count = count+1;
                       }
               }
               if(count==2){
                    System.out.println(i);
               }
            }
        }

    }
}
