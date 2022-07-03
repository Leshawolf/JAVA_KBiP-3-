package Laba4;

public class Water_pig extends Animals implements Ipet{
    Water_pig(String name){
        super(name);
    }
	@Override
	public String getName() {
		return name;
	}
	@Override
	public void setNam(String name) {
		
	}
	@Override
	public void play()
	{
		System.out.println(name+" is play game");
	}
	@Override
	public void eat()
	{
		System.out.println(name+" is eat");
	}
}