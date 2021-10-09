package minqueuestructure;

public interface QueueInterface {
    void add(int item);
    int remove();
    int size();
    int minQueue();
}
