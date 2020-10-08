// Take an array to find the element in array
// There is no need to be sorted array

// To find the value of x in arr[]
// iterate the arr[] from start to end
// for(int i=0;i<arr.length;i++)
// check the each value of arr[] matches with x
    // if arr[i] == x
        // return i
//    else return -1;

package Searching;

public class LinearSearch {

//    O(n)
    int linearSearch(int arr[], int x) {
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==x)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        LinearSearch linearSearch = new LinearSearch();

        int array[] = {10,20,30,35,40,27,50,100};
        int x=40;

        int result = linearSearch.linearSearch(array,x);
        if(result==-1)
            System.out.println("Element " + x + " not found!");
        else
            System.out.println("Element " + x + " found at index of "+result);
    }
}
