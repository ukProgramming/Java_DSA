package com.arrayDSA;

import java.util.Scanner;

public class LastOccurence {
    public static int lastOccurence(int[] arr, int x) {
        int last_index=-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==x)
            {
                last_index=i;
            }
        }
        return last_index;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Array Length..");
        int n=scanner.nextInt();
        System.out.println("Enter the Array Element:");
        int[] arr=new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i]=scanner.nextInt();
        }

        System.out.println("Enter the Element that you want...");
        int x=scanner.nextInt();
        System.out.println("Last Occurence of:"+x+"="+lastOccurence(arr,x));
    }
}
