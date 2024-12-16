import java.util.Scanner;
public class DecToBinaryHw {
    public static void main(String[] args) {
        int dec;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your decimal that you want to convert to binary");
        dec = input.nextInt();
        System.out.println("Your binary --> " + decTobin(dec));
    }
    private static String decTobin(int dec) {
        StringBuilder sb = new StringBuilder();
        while( dec > 1 ) {
            sb.insert(0, dec % 2);
            dec = dec / 2;
        }
        sb.insert(0, dec);
        return sb.toString();
    }
}