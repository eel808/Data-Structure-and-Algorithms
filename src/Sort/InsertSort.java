package Sort;

import java.util.Arrays;

import org.junit.Test;

public class InsertSort {
	
	@Test
	public void insertSort(){
		int[] arr={22,7,16,80,5,55,123,997,32};
		for(int unsorted=1;unsorted<arr.length;unsorted++){
			for(int i=unsorted;i>0;i--){
				if(arr[i]<arr[i-1]){
					int temp=arr[i];
					arr[i]=arr[i-1];
					arr[i-1]=temp;
				}
				else {
					break;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
