import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Opg12 {


    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.out.println("Usage: java filename");
            System.exit(1);
        }

        // Check if file exists
        File file = new File(args[0]);
        if (!file.exists()) {
            System.out.println("File " + args[0] + " does not exist");
            System.exit(2);
        }

        int characters = 0;	// Number of character
        int words = 0;			// Number of words
        int lines = 0;			// Number of lines

        try (
                // Create input file
                Scanner input = new Scanner(file);
        ) {
            while (input.hasNext()) {
                lines++;
                String line = input.nextLine();
                characters += line.length();
            }
        }

        try (
                // Create input file
                Scanner input = new Scanner(file);
        ) {
            while (input.hasNext()) {
                String line = input.next();
                words++;
            }
        }

        // Display results
        System.out.println("File " + file.getName() + " has");
        System.out.println(characters + " characters");
        System.out.println(words + " words");
        System.out.println(lines + " lines");
    }


    public static int words(Scanner file) {
        int count = 0;
        while(file.hasNext()) {
            count++;
        }
        return count;
    }

    public static int lines(Scanner file) {
        int count = 0;
        while(file.hasNext()) {
            count++;
        }
            return count;
    }

    public static int characters(Scanner file) {
        int count = 0;
        while(file.hasNext()) {
            String victim = file.next();
            for (int i = 0; i < victim.length(); i++) {
                count++;
            }
        }
        return count;
    }

}