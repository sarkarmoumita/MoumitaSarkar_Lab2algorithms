package com.greatlearning.transaction.main;
import  com.greatlearning.transaction.service.ProceedTransaction; 
import java.util.Scanner;
public class driver {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the transaction array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the values of the array");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the number of targets");
		int target=sc.nextInt();
		ProceedTransaction.check_transaction(arr,target);
	}

}
