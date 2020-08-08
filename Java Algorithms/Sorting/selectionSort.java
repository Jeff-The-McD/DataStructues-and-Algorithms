
public class selectionSort 
{
	public static void sort(int[] arr)
	{
		int i,j,smallest;
		int n = arr.length;
		for(i=0;i<n;++i)
		{
			smallest = i;
			
			for(j=i+1;j<n;++j)
			{
				if(arr[j] < arr[smallest])
					smallest = j;
				
				int temp = arr[i];
				
				arr[i] = arr[smallest];
				arr[smallest] = arr[i];
			}
		}
	}

}
