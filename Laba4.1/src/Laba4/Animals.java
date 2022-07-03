package Laba4;

public abstract class Animals {
	public String name;
    Animals(String name){
        this.name=name;
    }
    public void eat()
    {
        System.out.println(name+"is Eat");
    }
    public void waik()
    {
        System.out.println(name+" walk");
    }
}
