package sort_values;

import java.time.Duration;
import java.time.Instant;

public class selection_sort {

	public void sel(int[]a, int b)
	{
		Instant start = Instant.now();
		int min;
		for(int i=0;i<(b-1);i++)
		{
			min=i;
			for(int j=(i+1);j<b;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Sorted Array");
		for(int c=0;c<b;c++)
		{
			System.out.println(a[c]);
		}
		Instant end = Instant.now();
		Duration timeElapsed = Duration.between(start, end);
		System.out.println("Time taken: "+ timeElapsed.toMillis() +" milliseconds");
	}
	
}
