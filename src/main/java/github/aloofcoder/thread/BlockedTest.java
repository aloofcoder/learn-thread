package github.aloofcoder.thread;

import org.junit.Test;

/**
 * @author hanle
 * @date 2020/4/1 14:20
 */
public class BlockedTest {

    @Test
    public void blockedTest() throws InterruptedException {
        Thread a = new Thread(() -> testMethod(), "a");
        Thread b = new Thread(() -> testMethod(), "b");

        a.start();
//        Thread.sleep(1000L);
        b.start();
        System.out.println(a.getName() + "：" + a.getState());
        System.out.println(b.getName() + "：" + b.getState());
    }

    /**
     * 同步方法
     */
    private synchronized void testMethod() {
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
