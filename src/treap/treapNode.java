package treap;

import java.util.Random;

public class treapNode {
    treapNode left, right;
    int priority, element;
    public treapNode()
    {
        this.element = 0;
        this.left = this;
        this.right = this;
        this.priority = Integer.MAX_VALUE;
    }

    public treapNode(int ele)
    {
        this(ele, null, null);
    }

    public treapNode(int ele, treapNode left, treapNode right)
    {
        this.element = ele;
        this.left = left;
        this.right = right;
        this.priority = new Random().nextInt( );
    }
}
