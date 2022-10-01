import java.util.*;
class P12
{
	public static void main(String args[])throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size:");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter array elements:");
		int i,temp;
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Original Array:");
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		temp=a[n-1];
		for(i=n-2;i>=0;i--)
		{
			a[i+1]=a[i];
		}
		a[0]=temp;
		System.out.println("Shifted Array:");
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}
}