import java.util.*;

public class Try {

    public static void main(String[] args) throws IllegalStateException {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        System.out.println("Queue: " + queue);

        System.out.println("Queue's head: " + queue.remove());
        System.out.println("Queue: " + queue);

        System.out.println("Queue's head: " + queue.remove());
        System.out.println("Queue: " + queue);
        queue.remove();
        queue.remove();
        System.out.println(queue);
        queue.remove();

        int[] arr1 = { 0, 1, 2, 3, 4, 5 };
        int[] arr2 = { 5, 10, 20, 30, 40, 50 };

        // copies an array from the specified source array
        System.arraycopy(arr1, 0, arr2, 0, 2);
        System.out.println(Arrays.toString(arr2));

    }
}