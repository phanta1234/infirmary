package permutations;

import java.util.Scanner;

public class purstr {
    static int count=0;
	public void func(String c, int l, int r)
	{
		if(l==r)
			{
			System.out.println(c);
			count++;
			}
	    for(int i=l;i<=r;i++)
	  	{
	        c=swap(c,l,i);
            func(c,l+1,r);
            c=swap(c,l,i);
         
	  	}
	}
	public String swap(String c,int a, int b)
	{
		char ch[]= c.toCharArray();
		char q;
		q=ch[a];
		ch[a]=ch[b];
		ch[b]=q;
		c= new String(ch);
		return c;
	}
	public static void main(String[]args)
{
	purstr p = new purstr();
	Scanner s= new Scanner(System.in);
	String str= new String();
	System.out.println("Please Enter a string");
	str=s.nextLine();
	int a= str.length(); //n! values will come`	
    p.func(str, 0, a-1 );//O(n*n!)
    System.out.println(count);
    s.close();
}
}

