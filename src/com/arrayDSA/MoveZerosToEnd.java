package com.arrayDSA;

public class MoveZerosToEnd {
    public static void moveZeros(int[] arr) {
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0 && arr[j]==0)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            if (arr[j] != 0) {
                j++;
            }
        }


    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr={0,4,0,1,6,0,21,10};
        System.out.println("Original Array:");
        printArray(arr);
        System.out.println("Array after Moving Zeros..");
        moveZeros(arr);
        printArray(arr);
    }
}
