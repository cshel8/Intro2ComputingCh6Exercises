import java.util.Scanner;
public class BinToDecimalHw {
    public static void main(String[] args) {
        String bin;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the binary number you would like to convert to decimal");
        bin = input.nextLine();
        System.out.println("Your decimal --> " + binTodec(bin));
    }
    private static int binTodec(String bin) {
        int dec = 0;
        for (int i = 0; i < bin.length(); i++) {
            if(bin.charAt(i) == '1')
                dec = dec + (int)Math.pow(2, bin.length() - i - 1);
        }
        return dec;
    }
}