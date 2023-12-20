package com.arrayDSA;

public class Minimum_Value {
    public static int findMinimum(int[] arr)
    {
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min=arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr={4,6,89,1,0,-20};
        System.out.println(findMinimum(arr));
    }
}
