
public class MergeSort 
{
	public static void sort(int[] a, int n)
	{
		if(n<2)
		{
			return;
		}
		
		int mid = n/2;
		
		int[] L = new int[mid];
		int[] R = new int[n-mid];
		
		for(int i =0;i<mid;++i)
			L[i] = a[i];
		
		for(int i = mid; i<n; ++i)
			R[i-mid] = a[i];
		
		sort(L,mid);
		sort(R,n-mid);
		merge(a,L,R,mid,n-mid);
	}
	
	public static void merge(int[]a , int[] L,int[] R,int left, int right)
	{
		int i = 0, j = 0, k=0;
		
		while(i<left && j<right)
		{
			if(L[i]<=R[j])
				a[k++] = L[i++];
			else
				a[k++] = R[j++];
		}
		
		while(i<left)
			a[k++] = L[i++];
		
		while(j<right)
			a[k++] = R[j++];
		
	}
	public static void sort2(int arr[], int left, int right)
	{
		if(left<right)
		{
			// Find the middle point
			int mid = left+(right-left)/2;
			
			// Sort 1st and 2nd halves
			
			sort2(arr,left,mid);
			
			sort2(arr,mid,right);
			
			merge2(arr,left,mid,right);
		}
	}
	
	
	public static void merge2(int arr[],int left, int mid, int right)
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
