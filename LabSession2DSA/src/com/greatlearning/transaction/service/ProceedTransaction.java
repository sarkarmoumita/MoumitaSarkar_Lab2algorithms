package com.greatlearning.transaction.service;
import java.util.Scanner;
public class ProceedTransaction {
	public static  void check_transaction(int arr[],int target)
	{   
		
		Scanner sc=new Scanner(System.in);
		while(target>0)
		{  
			int no_of_trans=0;
			System.out.println("Enter the value of the target");
			int target_value=sc.nextInt();
			int sum=0;
			boolean status=false;
			for(int i=0;i<arr.length;i++)
			{
			   sum=sum+arr[i];
			   no_of_trans++;
			   if(sum>=target_value) {
				   status=true;
			       break;}
			}//end for
		   if(!status)
		      System.out.println("Given target is not achieved");
		   else	   
			  System.out.println("Target achieved after "+no_of_trans+"transactions");
		   target--;
		  }//end while
		}}	
		

	
