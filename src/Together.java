import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Together {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Press 1 to get AM/PM time");
        System.out.println("Press 2 to get military time");
        System.out.println("Then enter your time (hours:minutes) ");

        int userInput = scanner.nextInt();

        if (userInput == 1) {

            String input = scanner.next();
            //Date/time pattern of input date
            DateFormat dateFormat = new SimpleDateFormat("HH:mm");
            //Date/time pattern of desired output date
            DateFormat outputformat = new SimpleDateFormat("hh:mm aa");
            Date date = null;
            String output = null;
            try {
                //Conversion of input String to date
                date = dateFormat.parse(input);
                //old date format to new date format
                output = outputformat.format(date);
                System.out.println(output);
            } catch (ParseException pe) {
                pe.printStackTrace();
            }
        }
        else if (userInput == 2) {
            String input2 = scanner.next();

            System.out.println(input2.replaceAll(":", ""));
        }
        else {
            System.out.println("Invalid answer");
        }


    }
}

