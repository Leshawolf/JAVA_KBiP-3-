package lab_3;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> buffer = new ArrayList();
        
        Thread myThread_1 = new Thread(new Runnable() {
            public void run() {
                while (true)
                {
                    try{
                        Thread.sleep(5000);
                        Random rnd = new Random();
                        buffer.add((rnd.nextInt(100)));
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread myThread_2 = new Thread(new Runnable() {

            public void run() {
                while (true)
                {
                    try{
                        Thread.sleep(1000);
                        if (!buffer.isEmpty())
                        {
                            System.out.println(buffer.get(0));
                            buffer.clear();
                        }
                        else
                            System.out.println("-");
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
            }
        });

        myThread_1.start();
        myThread_2.start();

    }
}
