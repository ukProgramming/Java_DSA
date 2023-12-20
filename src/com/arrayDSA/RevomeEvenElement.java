package com.arrayDSA;

public class RevomeEvenElement {
    public static int[] removeEven(int[] arr) {
        int oddCount=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddCount++;
            }
        }
        int[] result=new int[oddCount];
        int indx=0;
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i] % 2 !=0)
            {
                result[indx++]=arr[i];
            }

        }

        return result;
    }
    public static void main(String[] args) {
        int[] arr={3,2,4,7,10,6,5};
        int[] result=removeEven(arr);
        for (int x:result)
        {
            System.out.print(" "+x);
        }
    }
}
