package github.aloofcoder.thread;

/**
 * @author hanle
 * @date 2020/4/1 11:24
 */
public class Demo {

    public static class MyThread1 extends Thread {
        @Override
        public void run() {
            System.out.println("Hello 1");
        }
    }

    public static class MyThread2 implements Runnable {
        @Override
        public void run() {
            System.out.println("Hello 2");
        }
    }

    public static void main(String[] args) {
        new MyThread1().start();

        new Thread(new MyThread2()).start();
    }
}
