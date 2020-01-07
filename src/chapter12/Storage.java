package chapter12;

import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Description:
 * Data：2019/3/22
 * Author: Steven
 */
public class Storage {
    private static final int MAX_SIZE = 5;

    private Lock mLock = new ReentrantLock();
    // 仓库存储的载体
    private final LinkedList<Object> list = new LinkedList<>();
    private Condition full = mLock.newCondition();
    private Condition empty = mLock.newCondition();

    // 生产产品
    public void produce(String producer) {
//        synchronized (list) {
        // 如果仓库已满
        mLock.lock();
        try {
            while (list.size() == MAX_SIZE) {
                System.out.println("仓库已满，【" + producer + "】： 暂时不能执行生产任务!");
                // 由于条件不满足，生产阻塞
                full.await();
            }
            // 生产产品
            list.add(new Object());
            System.out.println("【" + producer + "】：生产了一个产品\t【现仓储量为】:" + list.size());
            empty.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            mLock.unlock();
        }
    }

    // 消费产品
    public void consume(String consumer) {
//        synchronized (list) {
        // 如果仓库存储量不足
        mLock.lock();
        try {
            while (list.size() == 0) {
                System.out.println("仓库已空，【" + consumer + "】： 暂时不能执行消费任务!");
                // 由于条件不满足，消费阻塞
                empty.await();
            }
            list.remove();
            System.out.println("【" + consumer + "】：消费了一个产品\t【现仓储量为】:" + list.size());
            full.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            mLock.unlock();
        }
    }


    public static void main(String[] args) {
        Storage storage = new Storage();
        for (int i = 0; i < 10; i++) {
            Producer producer = new Producer(storage);
            producer.setProducer("生产者" + i);
            producer.start();
        }
        for (int i = 0; i < 10; i++) {
            Consumer consumer = new Consumer(storage);
            consumer.setConsumer("消费者" + i);
            consumer.start();
        }
    }
}
