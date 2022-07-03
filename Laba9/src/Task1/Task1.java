package Task1;
public class Task1 
{
	public static void main(String[] args)
	{
		System.out.println("Главный поток открыт...");
		Sclass thread=new Sclass();
		System.out.println(thread.getState());	
		thread.start();
		try{
			thread.join();
		}catch(InterruptedException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println(thread.getState());		
		System.out.println("Главный поток завершён...");
	}
}

