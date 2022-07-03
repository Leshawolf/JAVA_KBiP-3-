package Main;

public class Massiv 
{
	public int [] arr;
	public int [] arr1;
	public Massiv(int[] arr,int[] arr1)
	{
		this.arr=arr;
		this.arr1=arr1;
	}
	public int ZN() {
		String stroka="";
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr1[i];j++)
			{
				stroka+=Integer.toString(arr[i]);
			}
		}
		int lenght=stroka.length();
		int zn=(int)(Math.random()*(lenght+1));
		char c=stroka.charAt(zn);
		return Character.getNumericValue(c);
	}
}
