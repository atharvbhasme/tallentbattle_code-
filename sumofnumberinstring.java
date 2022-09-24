public class sumofnumberinstring {
    public static void main(String[] args) {
        int sum = 0;
        String str = "atharv5bhasme10";
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))){
                sum=sum+Character.getNumericValue(str.charAt(i));
            }
        }
        System.out.println(sum);
    }
}
