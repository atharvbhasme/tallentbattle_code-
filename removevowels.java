import java.util.*;
public class removevowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.nextLine();
        System.out.println(remove(str));
    }
    public static String remove(String str){
        char ch;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='O'||str.charAt(i)=='U'||str.charAt(i)=='I'||str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
                continue;
            }else{
                ch = str.charAt(i);
                str = str+ch;
            } 
        }
        return str;
    }
}
