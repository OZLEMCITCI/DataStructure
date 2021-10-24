package treap;
// Treap methods class
// A treap is a binary search tree where each node is assigned a random numeric priority
public class Treap {
    private TreapNode root;
    private static TreapNode treapNode = new TreapNode();
    // constructor
    public Treap() {
        root = treapNode;
    }
    // Recursive function to insert a given key
    public void add(int X) {
        root = add(X, root);
    }
    // Recursive function to insert a given key with a priority into treap
    private TreapNode add(int data, TreapNode r) {
        // base case
        if (r == treapNode)
            return new TreapNode(data, treapNode, treapNode);

        // if data is less than the root node, insert in the left subtree
        else if (data < r.element) {
            r.left = add(data, r.left);
            if (r.left.priority < r.priority) {
                TreapNode L = r.left;
                r.left = L.right;
                L.right = r;
                return L;
            }
        }
        //  if data is bigger than the root node, insert in the right subtree
        else if (data > r.element) {
            r.right = add(data, r.right);
            if (r.right.priority < r.priority) {
                TreapNode R = r.right;
                r.right = R.left;
                R.left = r;
                return R;
            }
        }
        return r;
    }
    // Depth First Traversals: Inorder, Preorder, Postorder
    // Inorder traversal java function
    public void inOrder() {
        inOrder(root);
    }
    // Inorder (Left, Root, Right)
    private void inOrder(TreapNode r) {
        if (r != treapNode) {
            inOrder(r.left);
            System.out.print(r.element +" ");
            inOrder(r.right);
        }
    }
    // Preorder traversal java function
    public void preOrder() {
        preOrder(root);
    }

    // Preorder (Root, Left, Right)
    private void preOrder(TreapNode r) {
        if (r != treapNode) {
            System.out.print(r.element +" ");
            preOrder(r.left);
            preOrder(r.right);
        }
    }
    // Post order traversal java function
    public void postOrder() {
        postOrder(root);
    }
    // Postorder (Left, Right, Root)
    private void postOrder(TreapNode r) {
        if (r != treapNode) {
            postOrder(r.left);
            postOrder(r.right);
            System.out.print(r.element +" ");
        }
    }
}
