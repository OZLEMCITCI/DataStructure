package treap;
// treap main class
public class TreapMain {
    public static void main(String[] args) {
        // Creating object from treap class
        Treap tr = new Treap();
        int[] arr = new int[]{1, 2, 4, 5, 6, 7, 10, 12, 17}; // Sorted Array
        for (int j : arr) {
            tr.add(j); // Adding sorted array elements to treap
        }
        // call the functions and print treap with Depth First Traversals
        System.out.print("\nPostorder traversal of treap is: ");
        tr.postOrder();
        System.out.print("\n\nPreorder traversal of treap is: ");
        tr.preOrder();
        System.out.print("\n\nInorder traversal of treap is: ");
        tr.inOrder();
        System.out.println();
    }
}

