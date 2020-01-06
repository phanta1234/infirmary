package sort_values;

import java.time.Duration;
import java.time.Instant;

public class insertion_sort {

	public void ins(int[] a, int b)
	{
		Instant start= Instant.now();
		for(int i=1;i<b;i++)
		{
			int z= a[i];
			int j=i-1;
			boolean x= true;
			while(j>=0 && x)
			{
				if(z<a[j])
				{
					a[j+1]=a[j];
					j--;
				}
				else
					x=false;
		
				a[j+1]=z;
			}
		}
		System.out.println("Sorted Array");
		for(int u=0;u<b;u++)
		{
			System.out.println(a[u]);
		}
		Instant end= Instant.now();
		Duration timeElapsed=Duration.between(start, end);
		System.out.println("Time Taken: "+timeElapsed.toMillis()+" Milliseconds");
	}
}
