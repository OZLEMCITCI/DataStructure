package minQueuedatastructure;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/*Exercise 3.15.Design and implement aMinQueuedata structure that
can store comparable elements and supports the queue operations add(x),remove(),
and size(), as well as the min() operation,
which returns the minimum value currently stored in the data structure.
All operations should run in constant amortized time.*/

// Class for Min Queue Data Structure
class MinQueue {
    Queue<Integer> Q = new LinkedList<>(); // Queue to store the element
    Deque<Integer> D = new LinkedList<Integer>();  // Doubly ended Queue to get the minimum element in O(1)

    public void enque_element(int element) {  // Function to push element into the queue
        if(Q.size() == 0) {          // Chceck if there is no element in the queue
            Q.add(element);
            D.add(element);
        }
        else {
            Q.add(element);

            while(D.size() != 0 && D.peekLast() > element) {  //Remove the elements out until the element at back is greater than current element
                D.removeLast();     // Remove from last of the Deque
            }
            D.add(element);
        }
    }
    public void deque_element() {  // Function to remove the element out from the queue
        if(Q.peek() == D.peekFirst()) {  // Check if the Minimum element is the element at the front of the Deque
            Q.remove();
            D.removeFirst();          // remove from head of the Deque
        }
        else {
            Q.remove();
        }
    }
    public int getMin() {     // Function to get the minimum element from the queue
        return D.peekFirst();   // Insert in the front
    }

    public static void main(String args[]) {

        MinQueue k = new MinQueue();
        int[] arr = new int[]{ -2, 1,2,4,677,0, 18};

        for(int i=0; i<7; i++) {   // Loop to enque element
            k.enque_element(arr[i]);
        }
        System.out.println("Minimum element is " + k.getMin());
        System.out.println("Initial Queue " + k.Q);
        k.deque_element();
        System.out.println("After 1 iteration-> Queue " + k.Q);
        System.out.println("Minimum element is " + k.getMin());
        System.out.println("SIZE of the queue is " + k.Q.size());
    }
}
