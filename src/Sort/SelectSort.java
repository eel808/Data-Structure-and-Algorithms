package Sort;

import java.util.Arrays;

import org.junit.Test;

public class SelectSort {
	
	@Test
	public void selectSort(){
		int[] arr={22,7,16,80,5,55,123,997,32};
		for(int min=0;min<arr.length-1;min++){
			for(int i=min+1;i<arr.length;i++){
				if(arr[i]<arr[min]){
					int temp=arr[min];
					arr[min]=arr[i];
					arr[i]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
