package minquequestructure2;

public class MinimumStack {
    public Element top;
    public MinimumStack() { }

    public void push(int x) {
        if (top == null) {
            top = new Element(x, x);
        } else {
            Element e = new Element(x, Math.min(x, top.min));       // Pushing the element on to stack top and re assigning the minimum value
            e.next = top;
            top = e;
        }
    }

    public void pop() {
        if(top == null)
            return;
        Element temp = top.next;
        top.next = null;
        top = temp;

    }

    public int top() {
        if(top == null)
            return -1;
        return top.value;
    }

    public int findMin() {
        if(top == null)
            return -1;
        return top.min;
    }

    public static void main(String args[])           // Driver code to implement the above class.
    {
        MinimumStack m = new MinimumStack();
        m.push(10);
        m.push(20);
        m.push(30);
        System.out.println("The top Elementent is : " + m.top());
        System.out.println("The min Elementent is : " + m.findMin());
        m.pop();
        System.out.println("After Popping");
        System.out.println("The top Elementent is : " + m.top());
        System.out.println("The min Elementent is : " + m.findMin());
    }



}
