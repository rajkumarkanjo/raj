import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Office {

    public static void main(String[] args) throws ParseException {


        String dateString = "20220101";
        LocalDate date = LocalDate.parse(dateString, DateTimeFormatter.BASIC_ISO_DATE);
        String ccc = date.toString();

        System.out.println(ccc);

        System.out.println(date.minusDays(1).toString());




     Integer ac = 37 ;
     Integer sc = 87 ;

     Double a = Double.valueOf(ac);
     Double b = Double.valueOf(sc);

     Double cccc = (a/b)*100;

        Double byCapacityPercentage = Double.parseDouble(new DecimalFormat("##.##").
                format((a/b)*100));
        System.out.println(cccc);

        System.out.println(byCapacityPercentage);


        Scanner scanner = new Scanner(System.in);


        String arr[] = new String[2];

        for (int i = 0 ; i<arr.length ; i++ ){

            System.out.println("Enter String ");
            String str = scanner.nextLine();

            arr[i] = str;
        }

        System.out.println(Arrays.toString(arr));

    }
}
