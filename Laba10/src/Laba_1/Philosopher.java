package Laba_1;

public class Philosopher implements Runnable {

    private Object leftFork;
    private Object rightFork;
    private int cc;

    public Philosopher(int c,Object leftFork, Object rightFork) {
        this.leftFork = leftFork;
        this.rightFork = rightFork;
        cc=c;
    }
    private void doAction(String action) throws InterruptedException {
        System.out.println( Thread.currentThread().getName() + " " + action);
        Thread.sleep(1000);
    }

    @Override
    public void run() {
        try {
            int p=0;
            while (p<cc) {
                doAction("������ ����� ���");
                synchronized (leftFork) {
                    doAction("����� ����� ����� �����");
                    synchronized (rightFork) {
                        doAction("����� ����� ������ ����� � ����� ��� ���������");
                        doAction("������� ������ �����");
                    }
                    doAction("������� ����� ����� �� ����. ����� ������ ����� ���");
                }
                p++;
            }
        }
        catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return;
        }
    }
}

