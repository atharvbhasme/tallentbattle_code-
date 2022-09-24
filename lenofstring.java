import java.util.*;
public class lenofstring{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(findlen(str));
    }
    public static int findlen(String str){
        int count = 0;
        char[] ch = str.toCharArray();
        for (char c : ch) {
            count++;
        }
        return count;
    }
}