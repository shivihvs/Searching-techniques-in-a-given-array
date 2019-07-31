package InsSort;
import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,key;
		Scanner scn=new Scanner(System.in);
		int a[]=new int[100];
		
		
		System.out.println("enter the number of element in an array");
		int n=scn.nextInt();
		System.out.println("enter the array elements");
		for(i=0;i<n;i++)
		{
		  int t=scn.nextInt();
		  a[i]=t;
		}
		for(i=1;i<n;i++)
		{
			key=a[i];
			j=i-1;
			while(j>=0&&a[j]>key)
			{
				a[j+1]=a[j];
				j=j-1;
				a[j+1]=key;
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}

		
		

	}

}
