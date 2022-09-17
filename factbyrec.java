import java.util.*;
public class factbyrec {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        System.out.println("factorail is "+fact(num));
    }
    public static int fact(int num){
           if(num>=1){
                  return num * fact(num-1);
           }else{
            return 1;
           }
    }
}
