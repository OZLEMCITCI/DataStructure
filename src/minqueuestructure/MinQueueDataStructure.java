package minqueuestructure;

public class MinQueueDataStructure {
    private Nodek front;
    private Nodek rear;
    private int queueSize;
    static class Nodek implements Comparable<Nodek>{
        private int data;
        private Nodek next;
        Nodek(int data){
            this.data=data;
            next=null;
        }
        public int getData(){
            return data;
        }
        public void setData(int d){
            data=d;
        }
        public Nodek getNext(){
            return next;
        }
        public void setNext(Nodek newNext){
            next=newNext;
        }
        public int compareTo(Nodek temp){
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
            front=new Nodek(data);
            rear=front;
            return;
        }
        Nodek temp=new Nodek(data);
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
        Nodek ptr=front;
        Nodek min_=front;
        while(ptr!=null) {
            if (ptr.compareTo(min_)==1) {
                min_ = ptr;
            }
            ptr = ptr.getNext();
        }
        return min_.getData();
    }
}

