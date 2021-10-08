package minQueuedatastructure;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
// Class for Min Queue Data Structure
class MinQueueStructure {
    Queue<Integer> queue = new LinkedList<>(); // Queue to store the element
    Deque<Integer> dequeue = new LinkedList<Integer>();  // Doubly ended Queue to get the minimum element in queue(1)
    public void enqueueElement(int element) {  // Method to push element into the queue
        if(queue.size() == 0) {          // Check if there is no element in the queue and add the element
            queue.add(element);
            dequeue.add(element);
        } else {
            queue.add(element);
            while(dequeue.size() != 0 && dequeue.peekLast() > element) {//Remove the elements until the element at back is greater than current element
                dequeue.removeLast();  }   // Remove from last of the dequeue
            dequeue.add(element);
        }
    }
    public void dequeueElement() {  // Function to remove the element out from the queue
        if(queue.peek()==dequeue.peekFirst()) {  // Check if the Minimum element is the element at the front of the Deque
            queue.remove();
            dequeue.removeFirst();          // remove from head of the Deque
        }
        else {
            queue.remove();
        }
    }
    public int getMin() {     // Function to get the minimum element from the queue
        return dequeue.peekFirst();   // Insert in the front
    }



    public static void main(String args[]) {

        MinQueueStructure minQueue1 = new MinQueueStructure();
        int[] arr1 = new int[]{ 10, -2,3,5,67,0, 18};

        for(int i=0; i<7; i++) {   // Loop to enqueue element
            minQueue1.enqueueElement(arr1[i]);
        }
        System.out.println("Minimum element is " + minQueue1.getMin());
        System.out.println("Initial Queue " + minQueue1.queue);
        minQueue1.dequeueElement();
        System.out.println("After 1 iteration-> Queue " + minQueue1.queue);
        System.out.println("Minimum element is " + minQueue1.getMin());
        System.out.println("SIZE of the queue is " + minQueue1.queue.size());

        System.out.println("//////////////////////////////////////");

        MinQueueStructure minQueue2 = new MinQueueStructure();
        int[] arr2 = new int[]{ -12, 11,12,64,76,10, 18,20,-7};

        for(int i=0; i<9; i++) {   // Loop to enqueue element
            minQueue2.enqueueElement(arr2[i]);
        }
        System.out.println("Minimum element is " + minQueue2.getMin());
        System.out.println("Initial Queue " + minQueue2.queue);
        minQueue2.dequeueElement();
        System.out.println("After 1 iteration-> Queue " + minQueue2.queue);
        System.out.println("Minimum element is " + minQueue2.getMin());
        System.out.println("SIZE of the queue is " + minQueue2.queue.size());
    }
}
