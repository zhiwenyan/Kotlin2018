package chapter12;

import java.util.Objects;

/**
 * Description:
 * Data：2019/3/22
 * Author: Steven
 */
public class Consumer extends Thread {
    public String consumer;
    private Storage storage;

    Consumer(){

    }
    public Consumer(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        consumer(consumer);
    }

    private void consumer(String consumer) {
        storage.consume(consumer);
    }

    public void setConsumer(String consumer) {
        this.consumer = consumer;
    }

    public String getConsumer() {
        return consumer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Consumer consumer1 = (Consumer) o;
        return Objects.equals(consumer, consumer1.consumer) &&
                Objects.equals(storage, consumer1.storage);
    }

    @Override
    public int hashCode() {

        return Objects.hash(consumer, storage);
    }

    public static void main(String[] args) {
        Consumer consumer1=new Consumer();
        Consumer consumer2=new Consumer();
        System.out.println(consumer1.equals(consumer2));
    }
}
