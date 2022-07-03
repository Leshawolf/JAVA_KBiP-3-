import java.io.UnsupportedEncodingException;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class FullReport
{
    public void printInfo(Employee[] mas,String language, String country) throws UnsupportedEncodingException {

        Locale current = new Locale(language, country);
        ResourceBundle rb = ResourceBundle.getBundle("text", current);
        NumberFormat nf = NumberFormat.getInstance(current);
        for (Employee item: mas) {
            System.out.println(String.format("%s %s: %s",rb.getString("worker"),item.fullname,nf.format(item.GetSalary())));
        }
        System.out.println();
    }

}
