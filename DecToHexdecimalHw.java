import java.util.Scanner;
public class DecToHexdecimalHw {
    public static void main(String[] args) {
        int num1;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a decimal that you want to convert to a Hexadecimal");
        num1 = input.nextInt();
        System.out.println("Your hexadecimal --> " + dec2hex(num1));
    }
    private static String dec2hex( int num1 ) {
        return Integer.toHexString(num1);
    }
}