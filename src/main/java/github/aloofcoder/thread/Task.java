package github.aloofcoder.thread;

import java.util.concurrent.*;

/**
 * @author hanle
 * @date 2020/4/1 11:36
 */
public class Task implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        Thread.sleep(1000);
        return 2;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newCachedThreadPool();
//        Task task = new Task();
//        Future<Integer> result = executor.submit(task);
//        System.out.println(result.get());

        Task task = new Task();
        FutureTask<Integer> futureTask = new FutureTask<>(task);
        executor.submit(futureTask);
        System.out.println(futureTask.get());
    }
}
