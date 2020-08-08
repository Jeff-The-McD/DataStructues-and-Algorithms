
public class insertionSort 
{
	public static void sort(int[] arr)
	{
		int n, i ,j;
		
		n = arr.length;
		
		for(j=1;j<n;++j)
		{
			int key = arr[j];
			i = j-1;
			while((i>-1) && (arr[i]>key))
			{
				arr[i+1] = arr[i];
				i--;
			}
			arr[i+1] = key;
		}
		
	}

}
