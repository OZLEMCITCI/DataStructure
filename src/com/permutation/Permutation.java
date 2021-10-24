package com.permutation;

public class Permutation {
    // The method that prints all possible strings of length k. It is mainly a wrapper over recursive function printAllKLengthRec()
    static void printAllKLength(char set[], int k)
    {
        int n = set.length;
        printAllKLengthRec(set, "", n, k);
    }
    // The recursive method to print all possible strings of length k
    static void printAllKLengthRec(char set[],String prefix,int n, int k)
    {
        // Base case: k is 0,
        // print prefix
        if (k == 0)
        {
            System.out.println(prefix);
            return;
        }

        // One by one add all characters
        // from set and recursively
        // call for k equals to k-1
        for (int i = 0; i < n; ++i)
        {

            // Next character of input added
            String newPrefix = prefix + set[i];
            // k is decreased, because
            // we have added a new character
            printAllKLengthRec(set, newPrefix, n, k - 1);
        }
    }

    // Driver Code
    public static void main(String[] args)
    {
        System.out.println("SAMPLE CASE 1");
        char[] arr1 = {'1', '2','3'};
        int k = 2;
        printAllKLength(arr1, k);
        System.out.println("SAMPLE CASE 2");
        char[] arr2 = {'a', 'b', 'c', 'd'};
        k = 3;
        printAllKLength(arr2, k);
    }
}
