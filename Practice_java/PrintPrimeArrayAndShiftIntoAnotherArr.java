import java.util.*;
public class PrintPrimeArrayAndShiftIntoAnotherArr
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array:");
		int size = sc.nextInt();
		System.out.println("\n-----------------------------");
		int a[]=new int[size];
		int b[]=new int[size];
		System.out.print("Enter array element:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("\n-----------------------------");
		for(int i=0;i<a.length;i++)
		{
			int n=a[i];
			int c=0;
			for(int j=1;j<=n;j++)
			{
				if(n%j==0)
				{
					c++;
				}
			}
		if(c==2)
		{
			b[i]=a[i];
		}
		}
		System.out.println("\n-----------------------------");
		System.out.print("Prime array element is:");
		for(int i=0;i<b.length;i++)
		{
			if(b[i]!=0)
			System.out.print(b[i]+" ");
		}
		System.out.println("\n-----------------------------------");
	}
}