package Task1;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2_2 {

	public static void main(String[] args)
	{
		Function("Object-oriented programming is a programming language model organized around objects rather than \"actions\" and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla.");
	}
	public static void Function(String str)
	{
		Pattern pat=Pattern.compile("(^|\\b)Object-oriented programming($|\\b)",Pattern.CASE_INSENSITIVE);
		Matcher mat=pat.matcher(str);
		int step=1;
		StringBuffer s1=new StringBuffer();
		while(mat.find())
		{
			if(step%2==0)
			{
				mat.appendReplacement(s1,"OOP");
			}
			step++;
		}
		mat.appendTail(s1);
		System.out.println(s1);
	}
}
