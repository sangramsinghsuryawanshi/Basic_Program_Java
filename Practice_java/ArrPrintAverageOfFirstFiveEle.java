import java.util.*;
public class ArrPrintAverageOfFirstFiveEle
{
	public static void main(String[]ar)
	{
		Scanner sc = new Scanner(System.in);
		int []a= new int[5];
		System.out.print("Enter value for array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("_______________________________");
		System.out.println("Average of array element:");
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		System.out.println((float)sum/a.length);
		System.out.println("_______________________________");
								
	}
}