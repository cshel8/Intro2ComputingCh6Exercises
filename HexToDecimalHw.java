import java.util.Scanner;
public class HexToDecimalHw {
    public static void main(String[] args) {
        String num1;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a hexadecimal that you would like to convert to decimal");
        num1 = input.nextLine();
        System.out.println("Your decimal --> " + hexTodec(num1));
    }
    private static int hexTodec(String num1) {
        return Integer.parseInt(num1, 16);
    }
}