package Task1;

public class Task10_10 {
	public static void main(String[] args) 
	{
		String s="Если есть хвосты по дз, начните с шалаш 1 не сданного задания. 123 324 111 4554";
		s=s.replace(",", "");
		s=s.replace(".", "");
		String[] mas=s.split(" ");
		for(int i=0;i<mas.length;i++){
			if(Function(mas[i]).compareTo(mas[i])==0){
				System.out.println("Палиндром: "+mas[i]);
			}
		}
	}
	public static String Function(String s){
		if(s.length()<=1){
			return "Слово меньше двух символов.";
		}
		char[] s1 = s.toCharArray();
		String r = "";
		for (int i = s1.length - 1; i >= 0; i--) {
			if(Character.isDigit(s1[i])){
				r = r + s1[i];
			}
			else{
				return "Слово не состоит только из цифр.";
			}
		}
		return r;
	}
}
