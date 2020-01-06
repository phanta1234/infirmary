package knap01;

public class knap_class {
	public static int max(int a, int b)
	{
		if(a>b)
			return a;
		else
			return b;
	}
	public static int Knapsack(int[]wt, int W, int[]val, int n)
	{
		int[][] K= new int[n+1][W+1];
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=W;j++)
			{
				if(i==0 || j==0)
				{
					K[i][j]=0;
				}
				else if(wt[i-1]<=j)
				{
					K[i][j]=max(val[i-1]+K[i-1][j-wt[i-1]],K[i-1][j]);
				}
				else
				{
					K[i][j]= K[i-1][j];
				}
			}
		}
		return K[n][W];
	}
public static void main(String[]args)
{
	int[]wt= new int[] {10,20,30};
	int[]val= new int[] {60,100,120};
	int n= val.length;
	int W=50;
	int f=Knapsack(wt,W,val,n);
	System.out.println(f);
}
}
