package Task2;

public class Program{

    public static void main(String[] args) {
        Thread t1 = new Thread(new SomeThreads("����� ������"));
        Thread t2 = new Thread(new SomeThreads("����� ������"));
        t1.start();
        t2.start();


    }
}
