package Task1;



import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task8_8 {

	public static void main(String[] args) 
	{
		String s="One two three ��� dngdsngjdsng ��� ��� one1 two2 1230";
		String[] mas=s.split(" ");
		int k=0;
		for(int i=0;i<mas.length;i++)
		{
			if(Function(mas[i]))
			{
				k++;
			}
		}
		System.out.println("���������� ����, ���������� ������ ������� ���������� ��������: "+k);
	}
	public static boolean Function(String s)
	{
		Pattern p=Pattern.compile("\\b[a-zA-Z]+\\b");
		Matcher m=p.matcher(s);
		return m.matches();
	}

}