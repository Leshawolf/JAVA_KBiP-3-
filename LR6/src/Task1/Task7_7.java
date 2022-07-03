package Task1;
import java.util.regex.Pattern;

public class Task7_7 {
	public static void main(String[] args)
	{
		Task7("Versions: Java 5, Java 6, Java 7, Java 8, Java 12,Java 10, Java X");
		
	}
	public static void Task7(String str)
	{
		Pattern pat=Pattern.compile("\\bJava\\s\\d+\\b");
		java.util.regex.Matcher m=pat.matcher(str);
		while(m.find())
		{
			System.out.println(str.substring(m.start(),m.end()));
		}
		
	}
}
