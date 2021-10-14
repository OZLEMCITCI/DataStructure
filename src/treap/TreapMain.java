package treap;

import java.util.Scanner;

public class TreapMain {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        // Creating object of treap class
        treap tr = new treap();

        int[] arr = new int[]{ 1,2,4,5,6,8,11,13,16};  //Sorted Array
        for(int i=0; i<arr.length; i++)
        {
            tr.add(arr[i]);   // Adding sorted array elements to treap
        }

        System.out.print("\nPostorder traversal of treap is: ");
        tr.postorder();
        System.out.print("\nPreorder traversal of treap is: ");
        tr.preorder();
        System.out.print("\nInorder traversal of treap is: ");
        tr.inorder();
        System.out.println("Enter the element you want to search: ");
        System.out.println("Search result : "+ tr.search_element( scan.nextInt()));
    }
}
