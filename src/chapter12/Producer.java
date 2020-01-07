package chapter12;

/**
 * Description:
 * Data：2019/3/22
 * Author: Steven
 */
public class Producer extends Thread {
    private String producer;
    private Storage storage;

    public Producer(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        produce(producer);
    }

    private void produce(String produce) {
        storage.produce(produce);
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public Storage getStorage() {
        return storage;
    }
}
