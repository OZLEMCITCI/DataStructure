package com.permutation;
public class Permutation1 {
    //Method to print permutation
    public static void PermutationCalculator(String set, int p)
    {

        String [] set1=set.split("");
        int n = set1.length;
        //recursive method is being called
        permutationPrinter(set1, "", n, p);
    }

    //recursive method
    public static void permutationPrinter(String[] set, String prefix, int n, int p) {
        //After printing new prefix it stop the recursion and print the number
        if (p == 0) {
            for(int i=0;i<prefix.length()-1;i++){
                //remove if a string has the same elements like 11 22 33
                if(prefix.charAt(i)==prefix.charAt(i+1)){
                    return;
                }
            }
            System.out.print(prefix+"-");

            return;
        }
        //makes recursive call
        for (int i = 0; i < n; ++i) {
            String newPrefix = prefix + set[i];
            permutationPrinter(set, newPrefix,
                    n, p - 1);
        }
    }
    //Driver class to run the data
    public static void main(String[] args)
    {
        String set1 = "123";
        int k = 2;
        PermutationCalculator(set1, k);
    }
}
