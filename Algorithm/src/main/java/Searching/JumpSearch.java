//Like Binary Search, Jump Search is a searching algorithm for sorted arrays.
// take an array int arr[] = {2,5,8,12,13,40,55,60,70};
// divide it into block size to be jump by
//  int jumpSize= (int)Math.floor(Math.sqrt(n));



package Searching;

public class JumpSearch {

    int jumpSearch(int array[], int x) {
        int n = array.length;

        // Finding block size to be jumped
        int jumpSize= (int)Math.floor(Math.sqrt(n));

        int prev=0;
        // Finding the block where element is present
        while (array[Math.min(jumpSize,n)-1]<x) {
            prev = jumpSize;
            jumpSize += (int)Math.floor(Math.sqrt(n));
            if (prev >= n)
                return -1;
        }
        // Doing a linear search for x in block
        // beginning with prev.
        while (array[prev]<x) {
            prev++;
            // If we reached next block or end of
            // array, element is not present.
            if (prev== Math.min(jumpSize,n))
                return  -1;
        }
        // If element is found
        if (array[prev]==x)
            return prev;

        return -1;


    }

    public static void main(String[] args) {
        JumpSearch jumpSearch = new JumpSearch();
        int arr[] = {2,5,8,12,13,40,55,60,70};
        int x = 40;

        int result = jumpSearch.jumpSearch(arr, x);
        if (result==-1)
            System.out.println("Element " + x + " not found!");
        else
            System.out.println("Element " + x + " found at index of "+result);
    }
}
