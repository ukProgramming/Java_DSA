package com.arrayDSA;

public class Adding_UpdatingEle {
    public static void printArray(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void demoArray()
    {
        int[] arr=new int[5];
        //printArray(arr);
        arr[0]=5;
        arr[1]=3;
        arr[2]=8;
        arr[3]=90;
        arr[4]=10;

        //arr[5]=5;  It will give array Out of Bound Index Exception.

        int[] array={2,5,3,6,8,11};
        printArray(arr);
        printArray(array);

    }
    public static void main(String[] args) {

        demoArray();
    }
}
