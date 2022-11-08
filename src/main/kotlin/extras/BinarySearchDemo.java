package extras;

import java.lang.reflect.Array;

 class BinarySearchDemo {
    public static void main(String[] args) {
        int[] sortedList = {5,7,9,12,15,20,24,27,32,40,50,65,72};
        //System.out.println(sortedList.length);
        System.out.println(findNumber(sortedList,sortedList.length));


    }

     static int findNumber(int[] list, int size){
        int l=0;
        int r=size-1;
        int mid=-5;
        int num =8;

        while(l<=r){
            mid = (l+r)/2;
            if(list[mid]==num){
                print("matched l -> "+l+" :: r-> "+r+" :: mid -> "+(l+r)/2);
                return mid;
            }
            else if(num<list[mid]){
                r=mid-1;
                print("num small:  l -> "+l+" :: r-> "+r+" :: mid -> "+(l+r)/2);
            }
            else{
                l=mid+1;
                print("num big:  l -> "+l+" :: r-> "+r+" :: mid -> "+(l+r)/2);
            }
        }


        return -99;
    }


    int binarySearch(int array[], int x, int low, int high) {

        if (high >= low) {
            int mid = low + (high - low) / 2;

            // If found at mid, then return it
            if (array[mid] == x)
                return mid;

            // Search the left half
            if (array[mid] > x)
                return binarySearch(array, x, low, mid - 1);

            // Search the right half
            return binarySearch(array, x, mid + 1, high);
        }

        return -1;
    }


    private static void print(String message){
            System.out.println(message+"\n");
    }



}
