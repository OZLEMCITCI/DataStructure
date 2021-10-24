package com.permutation;

public class Permutation1 {

//    Write a recursive method to return all possible k permutations of the given String non-zeros number
//
//    Sample input : "123" , 2
//
//    output : "1-2", "1-3", "2-3", "2-1", "3-1", "3-2"
    static void printNPermutation(char[] set, int k)
    {
        int n = set.length;
        permutationHelper(set, "", n, k);
    }

    static void permutationHelper(char[] set,
                                  String prefix,
                                  int n, int k)
    {
        if (k == 0)
        {
            System.out.println(prefix);
            return;
        }
        for (int i = 0; i < n; ++i)
        {
            String newPrefix = prefix + set[i];
            permutationHelper(set, newPrefix,
                    n, k - 1);
        }
    }
    public static void main(String[] args)
    {
        char[] set1 = {'1', '2','3'};
        int k = 2;
        printNPermutation(set1, k);
    }
}
