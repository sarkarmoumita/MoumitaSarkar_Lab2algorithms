package com.greatlearning.notecount.main;
import com.greatlearning.notecount.service.MergeSortMain;
import com.greatlearning.notecount.service.CountNotes;
import java.util.Scanner;
public class driver {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of currency denominations");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter all currency denominations");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the amount you have to pay");
		int amt=sc.nextInt();
		int left=0;
		int right=size-1;
		MergeSortMain.divide(arr,left,right);
		//MergeSortMain.printArray(arr);
		CountNotes.count(arr,amt);
		
	}

}
