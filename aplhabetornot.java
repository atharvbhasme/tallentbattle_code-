import java.util.*;
public class aplhabetornot{
    public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the Character");
          char ch = sc.next().charAt(0);
          check(ch);
    }
    public static void check(char ch){
           if((ch>='a' && ch<='z')||(ch>='A'&&ch<='Z')){
                System.out.println("Aplhabet");
           }else{
                System.out.println("not aplha");
           }
    }
}