
public class MergeSort 
{
	public static void sort(int arr[], int left, int right)
	{
		if(left<right)
		{
			// Find the middle point
			int mid = left+(right-left)/2;
			
			// Sort 1st and 2nd halves
			
			sort(arr,left,mid);
			
			sort(arr,mid,right);
			
			merge(arr,left,mid,right);
		}
	}
	
	
	public static void merge(int arr[],int left, int mid, int right)
	{
		// The two subarrays sizes
		
		int size1 = mid-left+1;
		
		int size2 = right-mid;
		
		int Left[] = new int[size1];
		int Right[] = new int[size2];
		
		for(int i = 0;i<size1;++i)
			Left[i] = arr[left+i];
		for(int j = 0;j<size2;++j)
			Right[j] = arr[mid+1+j];
		
		/*Merging the two temp arrays*/
		
		int i = 0, j= 0;
		
		// Initial index of merged 
		int k = left;
		
		while(i<size1 && j<size2)
		{
			if(Left[i]<=Right[j])
			{
				arr[k] = Left[i];
				i++;
			}
			
			else
			{
				arr[k] = Right[j];
				j++;
			}
			k++;
		}
		
		while(i<size1)
		{
			arr[k] = Left[i];
			i++;
			k++;
		}
		
		while(j<size2)
		{
			arr[k] = Right[j];
			j++;
			k++;
		}
		
		
	}

}
