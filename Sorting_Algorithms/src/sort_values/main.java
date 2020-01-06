package sort_values;

import java.util.Scanner;

public class main {
	public static void main(String[]args)
    {
		insertion_sort insert= new insertion_sort();
		bubble_sort bubble= new bubble_sort();
		selection_sort select= new selection_sort();
		Scanner s= new Scanner(System.in);
    	System.out.println("Please Enter the number of elements");
    	int n= s.nextInt();
    	int array[];
    	array=new int[n];
    	System.out.println("Please Enter the elements");
    	for(int j=0;j<n;j++)
    	{
    		array[j]=s.nextInt();
    	}
    	System.out.println("1. INSERTION SORT");
    	System.out.println("2. SELECTION SORT");
    	System.out.println("3. BUBBLE SORT");
    	System.out.println("Please Enter your choice");
    	int a= s.nextInt();
    	switch(a)
    	{
    	case 1:  insert.ins(array,n);
    	         break;
    	case 2:  select.sel(array,n);
    	         break;
    	case 3:  bubble.bub(array,n);
    	         break;
    	}
    }
}
