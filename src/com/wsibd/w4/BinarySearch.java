package com.wsibd.w4;

public class BinarySearch {

    public static void binarySearch(int[] arr, int key){
        int first = 0, last = arr.length -1, mid = (first + last) / 2;

        while( first <= last ){
            if ( arr[mid] < key ){
                first = mid + 1;
            }else if ( arr[mid] == key ){
                System.out.println("Element is found at index: " + mid);
                break;
            }else{
                last = mid - 1;
            }
            mid = (first + last)/2;
        }

        if ( first > last ){
            System.out.println("Element is not found!");
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 9, 6, 7, 4, 5, 3, 10, 1};
        binarySearch(arr, 10);
    }
}
