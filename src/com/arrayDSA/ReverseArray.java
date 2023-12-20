package com.arrayDSA;

public class ReverseArray {
    public static void reverseArray(int[] arr) {
        int left=0;
        int right=arr.length-1;

        while (left < right) {
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }

    public static void printArray(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void reverseArrayDynamic(int[] arr,int left,int right) {


        while (left < right) {
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] arr={2,11,5,10,7,8};
        System.out.println("Original Array:");
        printArray(arr);
        System.out.println("Reverse Array:");
        reverseArray(arr);
        printArray(arr);

        System.out.println("Reverse Array from index 2 to 4");
        reverseArrayDynamic(arr,2,4);
        printArray(arr);
    }
}
