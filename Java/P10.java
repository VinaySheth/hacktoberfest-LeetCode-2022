//2 pointer approach 
//TC: O(n)
//Auxilliary space: O(1)

import java.util.*;
class P10
{
	public static void transform(int a[],int l,int r)
	{
		int temp;
		while(l<=r)
		{
			if(a[l]>=0 && a[r]>=0)	//if both are positive
			{						// simply decr r
				r--;
			}
			else if(a[l]<0 && a[r]>=0)	//l is negative, r is positive
			{							// this is what we want
				l++;
				r--;
			}
			else if(a[l]>=0 && a[r]<0)	//l is positive, r is negative
			{							//swap a[l] and a[r], inc l, decr r
				temp=a[l];
				a[l]=a[r];
				a[r]=temp;
				l++;
				r--;
			}
			else 						//l and r both are negative
			{							// simply incr l
				l++;
			}
		}
	}
	
	public static void main(String args[])throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size:");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter array elements:");
		int i,l=0,r=n-1;
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Original Array:");
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		transform(a,l,r);
		System.out.println("Transformed Array:");
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}
}