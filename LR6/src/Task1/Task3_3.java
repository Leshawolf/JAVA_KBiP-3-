package Task1;

public class Task3_3 {

	public static void main(String[] args)
	{
		String str="������";
		System.out.println("���� �����: "+str);
		String[] podstr = str.split("");
		int ind=(str.length()/2)-1;
		System.out.println("����� � ������: "+podstr[ind]+podstr[ind+1]);
	}
	
}
