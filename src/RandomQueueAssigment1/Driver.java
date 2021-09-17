package RandomQueueAssigment1;
public class Driver {

    /** Design and implement a RandomQueue.
     * This is an implementation of the Queue interface in which
     * the remove() operation removes an element that is chosen uniformly at random among all
     * the elements currently in the queue.
     * (Think of a RandomQueue as a bag in which we can add elements or reach in and blindly remove some random element.)
     * The add(x) and remove() operations in a RandomQueue should run in constant time per operation.*/

    public static void main(String[] args) {
        // Create an object from RandomQueue class
        RandomQueue<Integer> randomQueueObject = new RandomQueue<>();
        // Call add method
        randomQueueObject.add(745);
        randomQueueObject.add(578);
        randomQueueObject.add(236);

        System.out.println("Elements in the Queue after add\n" + randomQueueObject);

        // Check queue is empty
        while (!randomQueueObject.isEmpty()) {
            // Call remove method
            System.out.println(randomQueueObject.remove() + " is removed");
        }

        System.out.println("Elements in the Queue after remove\n" + randomQueueObject + "\n");
        // Create an object from RandomQueue class
        RandomQueue<Double> ranQueDoubleObject = new RandomQueue<>();
        // Call add method
        ranQueDoubleObject.add(74.32);
        ranQueDoubleObject.add(58.34);
        ranQueDoubleObject.add(32.43);

        System.out.println("Elements in the Queue after add\n" + ranQueDoubleObject);
        // Check queue is empty
        while (!ranQueDoubleObject.isEmpty()) {
            // Call remove method
            System.out.println(ranQueDoubleObject.remove() + " is removed");
        }
        System.out.println("Elements in the Queue after remove\n" + ranQueDoubleObject);
    }
}