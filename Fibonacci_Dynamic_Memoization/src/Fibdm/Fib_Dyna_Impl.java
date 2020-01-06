package Fibdm;

import java.util.Scanner;

public class Fib_Dyna_Impl {
	public int Fib(int a, int[]memo)
	{
		if(memo[a]>0)
		{
			return memo[a];
		}
		if(a==0)
		{
			memo[a]=0;
			return 0;
		}
		else if(a==1)
		{
			memo[a]=1;
			return 1;
		}
		else
		{
			int m=Fib(a-1, memo)+Fib(a-2,memo);
			memo[a]=m;
			return m;
		}
	}
public static void main(String[]args)
{
	Scanner s= new Scanner(System.in);
	Fib_Dyna_Impl obj= new Fib_Dyna_Impl();
	System.out.println("Please Enter the value you want to know in the Fibonacci Series");
	int a=s.nextInt();
	int[]memo=new int[100];
	int c=obj.Fib(a-1,memo);
	System.out.println(c);
	s.close();
}
}
