/*
1
2 1
3 2 1
4 3 2 1
5 4 3 2 1*/
public class NumPatternThree
{
	public static void main(String[]ar)
	{
		int n=5;
		for(int i=1;i<=n;i++) //5
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(j);
			}
		System.out.println();
		}
	}
}