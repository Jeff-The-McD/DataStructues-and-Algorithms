
public class exchangeSort 
{
	public static void sort(int[] arr)
	{
		int i,j;
		int n = arr.length;
		
		for(i=0;i<n;++i)
		{
			for(j=i+1;j<n;j++)
			{
				if(arr[j]<arr[i])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			
		}
	}

}
