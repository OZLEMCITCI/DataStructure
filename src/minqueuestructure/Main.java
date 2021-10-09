package minqueuestructure;

public class Main  {
    public static void main(String []args) {
        MinQueueDataStructure queue=new MinQueueDataStructure();
        queue.add(10);
        queue.add(12);
        queue.add(13);
        queue.add(19);
        System.out.println(queue.remove());
        System.out.println(queue.minQueue());
        System.out.println(queue.remove());
        System.out.println(queue.minQueue());
        System.out.println(queue.remove());
        System.out.println(queue.minQueue());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }

}
