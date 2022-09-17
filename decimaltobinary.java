import java.util.*;
public class decimaltobinary {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        String str = "";
        while(num>0){
            if(num%2==0){
                 str = str + "0";
            }else{
                 str = str + "1";
            }
           num = num/2;
        }
        int binarynum = Integer.parseInt(str);
        System.out.println(binarynum);

    }
}
