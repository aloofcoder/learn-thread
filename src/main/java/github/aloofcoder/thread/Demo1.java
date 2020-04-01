package github.aloofcoder.thread;

import java.util.stream.IntStream;

/**
 * @author hanle
 * @date 2020/4/1 11:44
 */
public class Demo1 {

    public static void main(String[] args) {
        Thread testThread = new Thread(() -> {
            System.out.println("testThread的当前线程组名称：" + Thread.currentThread().getThreadGroup().getName());
            System.out.println("testThread线程的名字：" + Thread.currentThread().getName());
        });
        testThread.start();

        System.out.println("执行main方法的线程组名字：" + Thread.currentThread().getThreadGroup().getName());
        System.out.println("执行main方法的线程名字：" + Thread.currentThread().getName());
    }
}
