package javalab;
import java.util.*;

class QuickSort{
	
	public void sort(int[] arr, int lb, int hb) {
		if (lb < hb)
		{
			int p = partition(arr, lb, hb);
			sort(arr,lb, p-1);
			sort(arr, p+1, hb);
		}
	}

	public int partition(int[] arr, int lb, int hb) {
		int pivot = arr[hb];
		int i = (lb-1);
		for (int j=lb; j<hb; j++)
		{
			if (arr[j] <= pivot)
			{
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[hb];
		arr[hb] = temp;
		return i+1;
	}	
}

public class QuickSortPrgm {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the limit of Array :");
		int lim = sc.nextInt();
		int arr[] = new int[lim];
		System.out.println("Enter the elements of Array :");
		for(int i = 0 ; i<lim;i++) {
			arr[i]=sc.nextInt();
		}
		
		int size = arr.length;
		QuickSort qs = new QuickSort();
		qs.sort(arr,0,size-1);
		
		System.out.println("\nSorted Array:\n");
		for (int i=0; i<size; ++i)
			System.out.print(arr[i]+" ");
		
		sc.close();
		
	}

}
