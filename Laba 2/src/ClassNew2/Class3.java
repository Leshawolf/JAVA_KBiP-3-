package ClassNew2;

public class Class3 extends Class1
{
//	public int lenght;
//	public int width;
//	public Class3() {};

	public Class3(int lenght, int width,int square) {
		super(square,lenght,width);
	}

	public int getSquare() {
		return square;
	}
	public void setSquare(int square) {
		this.square = square;
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
}
