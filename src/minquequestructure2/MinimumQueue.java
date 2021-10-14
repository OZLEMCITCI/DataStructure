package minquequestructure2;
public class MinimumQueue {
    public Element top;
    private int queueSize=0;
    public MinimumQueue() { }
    public void add(int x) {
        if (top == null) {//Check if the top is null
            top = new Element(x, x);//assign new element obj
        } else {
            Element e = new Element(x, Math.min(x, top.min));// Pushing the element on to stack top and re-assigning the minimum value
            e.next = top;
            top = e;
        }
        queueSize ++; //controls to size of the queue
    }
    public void remove() {
        if(top == null)//check if top is null return nothing
            return;
        Element temp = top.next;
        top.next = null;//remove the element
        top = temp;

        queueSize --;//controls to size of the queue
    }
    public int top() {//to check the top element
        if(top == null)
            return -1;
        return top.item;
    }
    public int findMin() {
        if(top == null)
            return -1;
        return top.min;
    }
    public int size(){

        return queueSize;
    }
    public static void main(String args[])//Driver method for the above codes
    {
        MinimumQueue m = new MinimumQueue();
        m.add(13);
        m.add(15);
        m.add(27);
        System.out.println("After adding");
        System.out.println("The size is : " + m.size());
        System.out.println("The top Element is : " + m.top());
        System.out.println("The min Element is : " + m.findMin());
        m.remove();
        System.out.println("After removing");
        System.out.println("The size is : " + m.size());
        System.out.println("The top Element is : " + m.top());
        System.out.println("The min Element is : " + m.findMin());
    }
}
