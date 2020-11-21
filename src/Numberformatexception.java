import java.util.InputMismatchException;
import java.util.Scanner;

public class Numberformatexception extends Throwable {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] month = new String[] {"Jan","Feb","Mar","April","May","June","July","August","September","Okt", "november", "Dec"};
        int[] days = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};


        boolean switcher = true;
        do {
            try {
                int i = scanner.nextInt();
                System.out.println(month[i] + " : " + "have " + days[i] + " days");
                switcher = false;
            } catch (InputMismatchException ex) {
                System.out.println("You need to input a rounded number, try again\n" + ex);
                scanner.nextLine();
            } catch (ArrayIndexOutOfBoundsException ex){
                System.out.println("You've gone too far!\n" + ex);
                scanner.nextLine();
        }
        }while (switcher == true);

 }
}
