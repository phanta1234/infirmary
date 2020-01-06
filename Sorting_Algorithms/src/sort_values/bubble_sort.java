package sort_values;

import java.time.Duration;
import java.time.Instant;

public class bubble_sort {
 
	public void bub(int[] a, int b)
	{
		Instant start= Instant.now();
		for(int i=0;i<(b-1);i++)
		{
			for(int j=0;j<(b-1-i);j++)
			{
				if(a[j+1]<a[j])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		} 
		System.out.println("Sorted Array");
		for(int c=0;c<b;c++)
		{
			System.out.println(a[c]);
		}
		Instant end= Instant.now();
		Duration timeElapsed= Duration.between(start, end);
		System.out.println("Time Taken:"+timeElapsed.toMillis()+" milliseconds");
	}
}
