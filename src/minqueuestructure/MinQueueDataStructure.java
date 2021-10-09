package minqueuestructure;

public class MinQueueDataStructure {
    private Node front;
    private Node rear;
    private int queueSize;
    static class Node implements Comparable<Node>{
        private int data;
        private Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
        public int getData(){
            return data;
        }
        public void setData(int d){
            data=d;
        }
        public Node getNext(){
            return next;
        }
        public void setNext(Node newNext){
            next=newNext;
        }
        public int compareTo(Node temp){
            if(data==temp.getData()){
                return 0;
            }
            if(data<temp.getData()){
                return 1;
            }
            return -1;
        }
    }
    public void MinQueueData(){
        front=rear=null;
        queueSize=0;
    }
    public void add(int data){
        queueSize++;
        if(front==null){
            front=new Node(data);
            rear=front;
            return;
        }
        Node temp=new Node(data);
        rear.setNext(temp);
        rear=temp;

    }
    public int remove(){
        if(front==null){
            return -1;
        }
        queueSize--;
        int data=front.getData();
        if(front==rear){
            front=rear=null;
            return data;
        }
        front=front.getNext();
        return data;
    }
    public int size(){
        return queueSize;
    }
    public int minQueue(){
        if(rear==null)
            return 10000000;
        Node ptr=front;
        Node min_=front;
        while(ptr!=null) {
            if (ptr.compareTo(min_)==1) {
                min_ = ptr;
            }
            ptr = ptr.getNext();
        }
        return min_.getData();
    }
}

