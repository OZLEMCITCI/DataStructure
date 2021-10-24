package treap;
import java.util.Random;
// Treap node class
public class TreapNode {
    TreapNode left, right;
    int priority, element;
    // constructors
    public TreapNode() {
        this.element = 0;
        this.left = this;
        this.right = this;
        this.priority = Integer.MAX_VALUE;
    }

    public TreapNode(int element, TreapNode left, TreapNode right) {
        this.element = element;
        this.left = left;
        this.right = right;
        this.priority = new Random().nextInt( );
    }
}


