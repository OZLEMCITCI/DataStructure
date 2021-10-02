package RandomQueueAssigment1;
public class RandomQueue<Type> implements QueueInterface<Type> {
    // The array keep items in
    private Type[] queue;

    // Size of the stack
    private int total;

    // Declare queue size
    private static final int SIZE = 80;
    // Implementation of default constructor
    public RandomQueue() {
        total = 0;
        queue = (Type[]) new Object[SIZE];
    }
    // Add an item to queue
    @Override
    public void add(Type element) {

        // check total is equal to queue length
        if (total == queue.length) {

            // Declare temporary as type of T and initialize it
            Type[] temporary = (Type[]) new Object[total * 2];

            // call arraycopy function
            System.arraycopy(queue, 0, temporary, 0, total);


            // assign temporary to queue
            queue = temporary;
        }

        // assign element to queue
        queue[total] = element;

        total += 1;
    }
    // Remove an item from queue and return the item
    @Override
    public Type remove() {
        if (isEmpty())
            throw new RuntimeException("Illegal state");
        int randomIndexValue;
        // Initialize random value
        randomIndexValue = (int) (Math.random() * total);
        // Declare element as type of T
        Type element = queue[randomIndexValue];
        // assign queue[total-1] to queue[randomIndexValue]
        queue[randomIndexValue] = queue[total - 1];

        total -= 1;
        return element;}

    // Check queue is empty
    @Override
    public boolean isEmpty() {
        return total == 0;
    }

    // Implementation of toString function
    public String toString() {
        StringBuilder output = new StringBuilder("[");
        int k = 0;
        while (k < total) {
            // add queue[k] to output
            output.append(queue[k]);
            if (k != total - 1) {
                output.append(", ");
            }
            k += 1;
        }
        output.append("]");
        return output.toString();
    }
}
