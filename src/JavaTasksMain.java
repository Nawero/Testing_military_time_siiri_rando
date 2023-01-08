import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class JavaTasksMain {
    public static void main(String[] args) throws ParseException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your current EST time: ");

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


}










