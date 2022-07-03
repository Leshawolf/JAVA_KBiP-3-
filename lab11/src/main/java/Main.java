import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.out.println("Английский:");
        printInfo("en","US");
        System.out.println("Французский:");
        printInfo("fr","CA");

        System.out.println("----------------------------------");
        Employee[] emp = new Employee[3];
        emp[0] = new Employee("Васурман",123.12);
        emp[1] = new Employee("Басурман",123.42);
        emp[2] = new Employee("Армэн",12);
        FullReport fr = new FullReport();
        fr.printInfo(emp,"en","US");
        fr.printInfo(emp,"fr","CA");




    }
    private static void printInfo(String language, String country) throws UnsupportedEncodingException {
        Locale current = new Locale(language, country);
        ResourceBundle rb = ResourceBundle.getBundle("text", current);
        for (String item: rb.keySet()) {
            System.out.println(rb.getString(item));
        }
        System.out.println();
    }
}

