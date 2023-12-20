package com.arrayDSA;

public class FindSecondMax {
    public static int findSecondMax(int[] arr) {
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax=max;
                max=arr[i];
            }else if(arr[i]>secondMax && arr[i]!=max)
            {
                secondMax=arr[i];
            }
        }
        return secondMax;

    }

    public static void main(String[] args) {
        int[] arr={23,56,7,3,90,2,10};
        System.out.println("Second Max from the Array is:"+findSecondMax(arr));
    }
}
