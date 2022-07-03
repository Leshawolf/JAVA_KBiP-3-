package ClassNew2;

public class Class2 extends Class1
{
//	public int lenght;
//	public int width;
	public int perim;
//	public Class2()
//	{}
	public Class2(int square,int lenght,int width, int perim)
	{
		super(square,lenght,width);
		this.perim=perim;
//		this.square=square;
//		this.lenght=lenght;
//		this.width=width;
	}
	public int getLenght() {
		return lenght;
	}
	public void setLenght(int lenght) {
		this.lenght = lenght;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getPerim() {
		return perim;
	}
	public void setPerim(int perim) {
		this.perim = perim;
	}

}
