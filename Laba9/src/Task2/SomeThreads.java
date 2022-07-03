package Task2;

class SomeThreads implements Runnable{
    Thread t;
    public SomeThreads(String threadName){
        t=new Thread(this,threadName);
    }

    @Override
    public void run()
    {
    	int p=0;
        while (p<5){
                try
                {
                    Thread.sleep(1000);
                    p++;
                    System.out.println(t.getName());
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
        }

    }
}
