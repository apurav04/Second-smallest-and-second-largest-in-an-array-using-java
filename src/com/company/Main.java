package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr = new int[5];
        Scanner s= new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        int small= arr[0];
        int large=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=small){
                small=arr[i];
            }
            if(arr[i]>=large){
                large=arr[i];
            }
        }
        System.out.println(small);
        System.out.println(large);
        int secondsmall=Integer.MAX_VALUE;
        int secondlarge=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<secondsmall && arr[i] != small){
                secondsmall=arr[i];
            }
            if(arr[i]>secondlarge && arr[i] != large){
                secondlarge=arr[i];
            }
        }
        System.out.println(secondlarge+"= second large");
        System.out.println(secondsmall+"= second small");

    }
}
