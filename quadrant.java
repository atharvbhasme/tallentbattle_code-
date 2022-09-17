import java.util.*;
public class quadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the x quardinate");
        int x = sc.nextInt();
        System.out.println("enter the y quardinate");
        int y  = sc.nextInt();
        if (x>=0&&y>=0) {
            System.out.println("in 1st quardrant");
        } else if(x<=0&&y>=0) {
            System.out.println("in 2nd quad");
        }else if(x<=0&&y<=0){
            System.out.println("in 3rd quad");
        }else{
            System.out.println("in 4th quad");
        }
    }
}
