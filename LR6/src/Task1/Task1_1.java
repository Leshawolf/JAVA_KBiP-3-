package Task1;


public class Task1_1 
{

	public static void main(String[] args) 
	{
	String str="I like Java!!!";
	boolean pr=str.startsWith("!!!");
	System.out.println("��������, �������������� �� ������ !!! : "+pr);
	boolean ilike = str.startsWith("I like");
	System.out.println("��������, ����������� �� ������ � I like: "+ilike);
	boolean Contain = str.contains("Java");
	System.out.println("��������, ���� �� Java: "+Contain);
	System.out.println("Java ���������� � ��������� �����: "+str.indexOf("Java"));
	char[] chArray = str.toCharArray();
	for(int i = 0; i<chArray.length; i++){
		if(chArray[i] == 'a')
		{
			chArray[i] = 'o';
		} 
	}
	System.out.println(str.toLowerCase());
	System.out.println(str.toUpperCase());
	String n = str.substring(6, str.length()-3);
	System.out.println(n); 
	String str1 = "1+2312312 + 213 = 0 ��� = 5";
	System.out.println(str1);
	String newStr = str1.replace("=", "�����");
	System.out.println(newStr);

	
	
	}
}