package shivani;

import java.util.Scanner;
public class SelectonSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int i,j,min,loc,x;
		int a[]=new int[100];
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the number of element in an array");
		int n=scn.nextInt();
		System.out.println("enter the array elements");
		for(i=0;i<n;i++)
		{
		  int t=scn.nextInt();
		  a[i]=t;
		}
		for(i=0;i<n-1;i++)
		{
			min=a[i];
			loc=i;
			for(j=i+1;j<n;j++)
			{
				
				if(a[j]<min)
				{
					min=a[j];
					loc=j;
					
				}
			}
			if(loc!=i)
			{
				x=a[i];
				a[i]=a[loc];
				a[loc]=x;
			}
		}
		System.out.println("sorted elementss aare");
		
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}

	}

}
