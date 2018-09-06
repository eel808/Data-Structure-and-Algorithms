package Sort;

import java.util.Arrays;

import org.junit.Test;

public class QuickSort1 {
	
	@Test
	public void quickSort(){
		int[] arr={22,7,16,80,5,55,123,997,32,11,222,355,999,123};
		sort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
		
	}

	public void sort(int[] arr,int low,int high){
		if(low<high){
			int p=partition(arr,low,high);
			sort(arr,low,p-1);
			sort(arr,p+1,high);
		}	
	}
	

	public int partition(int[] arr,int low,int high){
		int i=low+1;
		int j=high;
		int pivot=arr[low];
		while(true){
			while(arr[j]>pivot) j--;
			while(arr[i]<=pivot){
				if(i==high){
					break;
				}
				i++;
			}
			if(i>=j){
				break;
			}
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		arr[low]=arr[j];
		arr[j]=pivot;
		return j;
	}

}
