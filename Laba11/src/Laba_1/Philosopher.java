package Laba_1;

public class Philosopher implements Runnable {

    private int cc;

    public Philosopher(int c) {
        cc=c;
    }
    private void doAction(String action) throws InterruptedException {
        System.out.println( Thread.currentThread().getName() + ": " + action);
        Thread.sleep(((int) (Math.random() * 100)));
    }

    @Override
    public void run() {
        try {
            int p=0;
            while (p<cc) {
                doAction("������...");
                    doAction("���� ����� �����.");
                        doAction("���� ������ ����� - ���...");
                        doAction("������� ������ �����.");
                    doAction("������� ����� �����. ����� ������...");
                p++;
            }
        }
        catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return;
        }
    }
}

