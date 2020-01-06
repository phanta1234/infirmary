package topological;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
public class tp_sort {
	LinkedList<Integer> adj[];
	Stack s= new Stack();
	tp_sort(int a)
	{
		adj= new LinkedList[a];
		for(int i=0;i<a;i++)
		{
			adj[i]=new LinkedList();
		}
	}
	public void addEdge(int u, int v)
	{
		adj[u].add(v);
	}
	public void topo(int a)
	{
		boolean[]b= new boolean[a];
		for(int i=0;i<a;i++)
		{
			b[i]=false;
		}
		for(int i=0;i<a;i++)
		{
			if(!b[i])
			{
				topo_final(i,b);
			}
		}
		while (s.empty()==false)
		System.out.println(s.pop()+" ");
	}
	public void topo_final(int d,boolean[]b)
	{
		
		b[d]=true;
		//s.push(d);
		Iterator<Integer> itr = adj[d].iterator();
		while(itr.hasNext())
		{
			int f=itr.next();
			if(!b[f])
			{
				topo_final(f,b);
			}
		}
		s.push(d);
	}
public static void main(String[]args)
{
	tp_sort obj = new tp_sort(6);
	obj.addEdge(5, 2); 
    obj.addEdge(5, 0); 
    obj.addEdge(4, 0); 
    obj.addEdge(4, 1); 
    obj.addEdge(2, 3); 
    obj.addEdge(3, 1); 
	obj.topo(6);
}
}
