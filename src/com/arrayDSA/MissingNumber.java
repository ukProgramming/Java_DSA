package com.arrayDSA;

public class MissingNumber {
    public static int missingNumber(int[] arr) {
        int sum=0;
        int n=arr.length+1;
        int sumOfN=n*(n+1)/2;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];

        }
        return sumOfN-sum;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,6,7,8};
        int miss= missingNumber(arr);
        System.out.println(miss);
    }
}
