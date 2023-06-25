import java.util.Scanner;

class ConvertBinaryToDecimal {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter binary number: ");
        String binary = sc.nextLine();
        int result = convertBinaryNumberToDecimal(binary);
        System.out.println("Decimal: " + result);
    }
    public static int convertBinaryNumberToDecimal(String binaryNumber) {
        int sum = 0;
        for (int i = 0; i < binaryNumber.length(); i++) {
            int num = Character.getNumericValue(binaryNumber.charAt(i));
            sum += num * (int) Math.pow(2, binaryNumber.length() - i - 1);
        }
        return sum;
    }
}