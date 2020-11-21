import java.util.Scanner;

public class Opg6 {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a hex number: ");
        String hex = input.nextLine();

        // Handle NumberFormatException
        try {
            System.out.println("The decimal value for hex number "
                    + hex + " is " + getDecimal(hex.toUpperCase()));
        }
        catch (NumberFormatException ex) {
            System.out.println(ex.getMessage());
        }
    }

    /** Converts a hex string into a decimal number and throws a
     * NumberFormatException if the string is not a hex string */
    public static int getDecimal(String hex) throws NumberFormatException{
        String digits = "0123456789ABCDEF";
        hex = hex.toUpperCase();
        int val = 0;
        for (int i = 0; i < hex.length(); i++)
        {
            if (digits.indexOf(hex.charAt(i)) == -1){
                throw new NumberFormatException("String is not a hex String");}
            char c = hex.charAt(i);
            int d = digits.indexOf(c);
            val = 16 * val + d;
        }
        return val;
    }

}
