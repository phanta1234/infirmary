package DFS;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class dfs_code {
	private LinkedList<Integer> adj[];
		dfs_code(int n)
	{
		adj= new LinkedList[n];
		for(int i=0;i<n;i++)
		{
			adj[i]= new LinkedList();
		}
	}
	public void addEdge(int u, int v)
	{
		adj[u].add(v);
	}
	public void func(int a)
	{
		boolean[] val= new boolean[100];
		for(int j=0;j<a;j++)
		{
			val[j]=false;
		}
		func2(a,val);
	}
	public void func2(int a,boolean[]temp)
	{
		int count=0;
		System.out.println(a+" ");
		temp[a]=true;
		Iterator<Integer> itr=adj[a].iterator();
		while(itr.hasNext())
		{
			int c= itr.next();
			if(!(temp[c]))
			{
				func2(c,temp);
			}
		}
	}
	public static void main(String[]args)
	{
		dfs_code d= new dfs_code(4);
		d.addEdge(0,2);
		d.addEdge(0,1);
		d.addEdge(0,3);
		d.addEdge(1,0);
		d.addEdge(1,3);
		d.addEdge(2,0);
		d.addEdge(3,2);
		d.func(0);
	}
}
