package com.arrayDSA;

public class Resize_Array {

    public static int[] resizeArray(int[] arr, int capacity) {
        int[]  temp=new int[capacity];
        for (int i = 0; i < arr.length; i++) {
            temp[i]=arr[i];
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] original={12,4,9,23,12};
        System.out.println("Original Array Length:"+original.length);
        original=resizeArray(original,10);
        System.out.println("Length of Array after Resizing:"+original.length);
    }
}
