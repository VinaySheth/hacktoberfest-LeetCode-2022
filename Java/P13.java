//Kadane's Algorithm

import java.util.*;
class P13
{
	public static int max_contiguous(int a[])
	{
		int max_ans=Integer.MIN_VALUE;	// final max contiguous sum, we are not taking 0
										// because it will give wrong answer if
										// first element is negative
		int max_present=0;	// max contiguous sum uptil the present element
		int i;
		for(i=0;i<a.length;i++)
		{
			max_present=max_present+a[i];	//add current element to present max
			if(max_ans<max_present)
			{
				max_ans=max_present;
			}
			if(max_present<0)
			{
				max_present=0;	//uptil now the overall sum is negative, so start fresh
			}
		}
		return max_ans;
	}
	
	public static void main(String args[])throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size:");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter array elements:");
		int i;
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Original Array:");
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("Maximum Contiguous Sum: "+max_contiguous(a));
	}
}