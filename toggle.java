import java.util.*;
public class toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(tog(str));
    }
    public static String tog(String str){
        String ans = "";

        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                ans = ans +Character.toLowerCase(str.charAt(i));
            }else{
                ans = ans + Character.toUpperCase(str.charAt(i));
            }
        }
        return ans;
    }
}
