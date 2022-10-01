import java.util.*;
class P11
{
	public static void union(int a1[],int a2[])
	{
		/* Approach 1:      works for unsorted array
		int i;
		HashSet<Integer> ans=new HashSet<>();
		for(i=0;i<a1.length;i++)
		{
			ans.add(a1[i]);
		}
		for(i=0;i<a2.length;i++)
		{
			ans.add(a2[i]);
		}
		Iterator iter=ans.iterator();
		System.out.println("Union Elements:");
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		System.out.println("Union Size: "+ans.size());
		*/
		
		int i=0,j=0;
		HashSet<Integer> ans=new HashSet<>();
		while(i<a1.length && j<a2.length)
		{
			if(a1[i]<a2[j])
			{
				ans.add(a1[i]);
				i++;
			}
			else if(a1[i]>a2[j])
			{
				ans.add(a2[j]);
				j++;
			}
			else 	//a1[i]==a2[j]
			{
				ans.add(a1[i]);
				i++;
				j++;
			}
		}
		// print remaining elements of the larger array (IMP)
		//not needed in intersection because in that we need common
		while(i<a1.length)
		{
			ans.add(a1[i]);
			i++;
		}
		while(j<a2.length)
		{
			ans.add(a2[j]);
			j++;
		}
		System.out.println("Union Elements:");
		Iterator iter=ans.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		System.out.println("Union Size: "+ans.size());
	}
	
	public static void intersection(int a1[],int a2[])
	{
		HashSet<Integer> ans=new HashSet<>();
		int i=0,j=0;
		while(i<a1.length && j<a2.length)		//since the arrays are sorted
		{
			if(a1[i]<a2[j])
			{
				i++;
			}
			else if(a1[i]>a2[j])
			{
				j++;
			}
			else		//a1[i]==a2[j], put it into intersection
			{
				ans.add(a1[i]);
				i++;
				j++;
			}
		}
		System.out.println("Intersection Elements:");
		Iterator iter=ans.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		System.out.println("Intersection Size: "+ans.size());
	}
	
	public static void main(String args[])throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array 1 size:");
		int n1=sc.nextInt();
		int a1[]=new int[n1];
		System.out.println("Enter array 1 elements:");
		int i;
		for(i=0;i<n1;i++)
		{
			a1[i]=sc.nextInt();
		}
		System.out.println("Enter array 2 size:");
		int n2=sc.nextInt();
		int a2[]=new int[n2];
		System.out.println("Enter array 2 elements:");
		for(i=0;i<n2;i++)
		{
			a2[i]=sc.nextInt();
		}
		System.out.println("Array 1:");
		for(i=0;i<n1;i++)
		{
			System.out.println(a1[i]);
		}
		System.out.println("\nArray 2:");
		for(i=0;i<n2;i++)
		{
			System.out.println(a2[i]);
		}
		union(a1,a2);
		intersection(a1,a2);
	}
}