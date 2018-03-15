package Sort;

import java.util.Arrays;

import org.junit.Test;

public class BubbleSort {
	
	@Test
    public void bubbleSort() {
		int[] arr={22,7,16,80,5,55,123,997,32};
		for(int indexOfLast=arr.length-1;indexOfLast>0;indexOfLast--){
			for(int i=0;i<indexOfLast;i++){
				if(arr[i]>arr[i+1]){
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
		} 
		System.out.println(Arrays.toString(arr));
	}

}
