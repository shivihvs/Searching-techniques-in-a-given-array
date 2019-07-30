package BubSort;

import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args)
	{
		int []a=new int[100];
		int i,j,t;
		System.out.println("enter the number of element in an array");
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
	    System.out.println("enter the array elements");
	    for(i=0;i<n;i++)
	    {
	     int m=scn.nextInt();
	     a[i]=m;
	    }
	    for(i=0;i<n;i++)
	    {
	    	for(j=0;j<n-i-1;j++)
	    	{
	    		if(a[j]>a[j+1])
	    		{
	    			t=a[j];
	    			a[j]=a[j+1];
	    			a[j+1]=t;
	    		}
	    	}
	    		
	    	}
	    for(i=0;i<n;i++)
	    {
	    	System.out.println(a[i]);
	    }
	    }

}
