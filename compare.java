import java.util.*;
public class compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(com(str1, str2));
    }
    public static boolean com(String str1,String str2){
        if(str1.equals(str2)){
            return true;
        }else{
            return false;
        }
    }
}
