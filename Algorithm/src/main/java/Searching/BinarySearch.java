// in binary search pass a sorted array(array[]) as a argument and the element(x) value that you want to find
//  find the mid index of array by f+(l-f)/2;
//  checking if(array[m]==x) return m; // return the index value that matched
//           else if(array[m]<X)
//              f=m+1; //move to f at index m+1;
//           else
//                l=m-1; // move to index l at m-1;
//Time Complexity: If elements are uniformly distributed, then O (log log n)). In worst case it can take upto O(n).
//        Auxiliary Space: O(1)

package Searching;

import com.sun.org.apache.xalan.internal.xsltc.runtime.Operators;

public class BinarySearch {

    int binarySearch(int arr[],int x) {
        int f=0, l=arr.length-1;
//       O (log log n))
        while (f<=l) {
            int m=f+(l-f)/2;

            if(x==arr[m])
                return m;
            else if(arr[m]<x)
                f=m+1;
            else
                l=m-1;
        }
        return -1;
    }
//    O(Log n)
    int recursiveBinarySearch(int arr[],int f, int l, int x) {
        if(f<=l) {
            int m = f+(l-f)/2;

            if(arr[m]==x)
                return m;
            else if (arr[m]<x)
                return recursiveBinarySearch(arr,m+1,l,x);
            else
                return recursiveBinarySearch(arr, f,m-1,x);
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch obj = new BinarySearch();
         int binaryArray[] = {1, 2, 5, 8, 9, 13};
       int result = obj.binarySearch(binaryArray,9);
       System.out.println("Using iteration method");
        if (result == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at "
                    + "index " + result);
        int r = obj.recursiveBinarySearch(binaryArray,0,binaryArray.length-1,9);
        System.out.println("Using recursive method");
        if (r == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at "
                    + "index " + r);

    }
}
