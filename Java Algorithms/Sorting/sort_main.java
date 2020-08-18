import java.time.Duration;
import java.time.Instant;
import java.util.*;
import java.util.Random;
import java.util.Arrays;
public class sort_main 
{
	public static void main(String[]args)
	{
		
		MergeSort m_sort = new MergeSort();
		
		QuickSort q_sort = new QuickSort();
		
		insertionSort i_sort = new insertionSort();
		
		selectionSort s_sort = new selectionSort();
		
		exchangeSort e_sort = new exchangeSort();
		
		BubbleSort b_sort = new BubbleSort();
		
		int[] test_array = new int [7];
		test_array = initArray(test_array);
		printArray(test_array);
		//m_sort.sort(test_array,0, test_array.length-1);
		//q_sort.sort(test_array,0,test_array.length-1);
		//i_sort.sort(test_array);
		//s_sort.sort(test_array);
		//e_sort.sort(test_array);
		b_sort.sort(test_array);
		System.out.println(isSorted(test_array));
		printArray(test_array);
	}
	
	public static boolean isSorted(int [] arr)
	{
		for(int i = 0;i<arr.length-1;++i)
		{
			if(arr[i]>arr[i+1])
				return false;
		}
		return true;
		
	}
	
	public static void printArray(int []test_array)
	{
		for(int i =0;i<test_array.length;++i)
		{
			System.out.print(test_array[i]+" ");
		}
		System.out.println();
	}
	
	public static int[] initArray(int[] arr)
	{
		Random rand = new Random();
		for(int i = 0;i<arr.length;++i)
		{
			arr[i] = rand.nextInt();
		}
		return arr;
	}
	
}
