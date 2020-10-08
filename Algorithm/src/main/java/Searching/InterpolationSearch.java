// The idea of formula is to return higher value of pos
// when element to be searched is closer to arr[hi]. And
// smaller value when closer to arr[lo]
//pos = lo + [ (x-arr[lo])*(hi-lo) / (arr[hi]-arr[Lo]) ]
//
//        arr[] ==> Array where elements need to be searched
//        x     ==> Element to be searched
//        prev    ==> Starting index in arr[]
//        last    ==> Ending index in arr[]


package Searching;

public class InterpolationSearch {

    int interpolationSearch(int arr[] , int x) {

        // Find indexes of two corners
        int prev= 0;
        int last = arr.length-1;

        // Since array is sorted, an element present
        // in array must be in range defined by corner
        while (prev<=last) {

            if(prev==last) {
                if (arr[prev]==x)
                    return prev;
                else
                    return -1;
            }
            // Probing the position with keeping
            // uniform distribution in mind.
            int pos = prev + ((x-arr[prev])*(last-prev)/(arr[last]-arr[prev]));

            // Condition of X found
            if (arr[pos]==x)
                return pos;

            // If x is larger, x is in upper part
            else if (arr[pos]<x)
                prev =pos+1;

            // If x is smaller, x is in the lower part
            else
                last=pos-1;
        }

        return -1;

    }


    public static void main(String[] args) {
        InterpolationSearch ob = new InterpolationSearch();
        int array[] = {2,3, 8, 12, 34, 40,80,90,100};
        int x= 34;
        int result = ob.interpolationSearch(array, x);
        if (result==-1)
            System.out.println("Element "+x +" is not found");
        else
            System.out.println("Element "+x +" is found at index " +result);

    }
}
