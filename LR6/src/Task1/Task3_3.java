package Task1;

public class Task3_3 {

	public static void main(String[] args)
	{
		String str="Азамат";
		System.out.println("Ваше слово: "+str);
		String[] podstr = str.split("");
		int ind=(str.length()/2)-1;
		System.out.println("Буквы в центре: "+podstr[ind]+podstr[ind+1]);
	}
	
}
