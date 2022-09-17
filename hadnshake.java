import java.util.*;
public class hadnshake {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter the number of people in the room");
        int num = sc.nextInt();
        int total = (num*(num-1))/2;
        System.out.println("no of total handshake is :"+total);
    }
}
