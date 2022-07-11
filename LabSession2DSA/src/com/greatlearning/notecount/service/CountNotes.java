package com.greatlearning.notecount.service;

public class CountNotes {
	public static void count(int arr[],int amt) {
		int i=0;
		int notes[]=new int[arr.length];
		int j=-1;
		while(amt>=arr[arr.length-1])
		{
				notes[++j]=amt/arr[i];
				amt=amt%arr[i];
			
			i++;
			if(i>arr.length)
				break;
		}
		if(amt!=0)
			System.out.println("Exact amount cannot given with highest denomination");
		else
		{   
			System.out.println("Your payment approach in order to give minimum number of notes");
			for(int k=0;k<notes.length;k++)
			{
				if(notes[k]!=0)
				 System.out.println(arr[k]+":"+notes[k]);
				  
			}
		}
	}
}
