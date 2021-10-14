package treap;

public class treap {
    private treapNode root;
    private static treapNode nil = new treapNode();

    public treap() {
        root = nil;
    }

    // Functions to insert elements of array in tree
    public void add(int X) {
        root = add(X, root);
    }

    private treapNode add(int X, treapNode T) {
        if (T == nil)
            return new treapNode(X, nil, nil);
        else if (X < T.element) {
            T.left = add(X, T.left);
            if (T.left.priority < T.priority) {
                treapNode L = T.left;
                T.left = L.right;
                L.right = T;
                return L;
            }
        } else if (X > T.element) {
            T.right = add(X, T.right);
            if (T.right.priority < T.priority) {
                treapNode R = T.right;
                T.right = R.left;
                R.left = T;
                return R;
            }
        }
        return T;
    }
    // Functions to search for an element in trip
    public boolean search_element(int val)
    {
        return search_element(root, val);
    }
    private boolean search_element(treapNode r, int val)
    {
        boolean found = false;
        while ((r != nil) && !found)
        {
            int rval = r.element;
            if (val < rval)
                r = r.left;
            else if (val > rval)
                r = r.right;
            else
            {
                found = true;
                break;
            }
            found = search_element(r, val);
        }
        return found;
    }
    public void inorder()
    {
        inorder(root);
    }
    private void inorder(treapNode r)  // Inorder traversal java function
    {
        if (r != nil)
        {
            inorder(r.left);
            System.out.print(r.element +" ");
            inorder(r.right);
        }
    }

    // Function for preorder traversal
    public void preorder()
    {
        preorder(root);
    }
    private void preorder(treapNode r)  // Preorder traversal java function
    {
        if (r != nil)
        {
            System.out.print(r.element +" ");
            preorder(r.left);
            preorder(r.right);
        }
    }
    public void postorder()  // Post order traversal java function
    {
        postorder(root);
    }
    private void postorder(treapNode r)
    {
        if (r != nil)
        {
            postorder(r.left);
            postorder(r.right);
            System.out.print(r.element +" ");
        }
    }
}
