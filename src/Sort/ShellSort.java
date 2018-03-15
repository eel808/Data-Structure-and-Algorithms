package Sort;

import java.util.Arrays;

import org.junit.Test;

public class ShellSort {
	
	@Test
	public void shellSort(){
		int[] arr={22,7,16,80,5,55,123,997,32,11,222,355,999};
		for(int gap=arr.length/2;gap>0;gap/=2){
			for(int unsorted=gap;unsorted<arr.length;unsorted++){
				for(int i=unsorted;i>=gap;i-=gap){
					if(arr[i]<arr[i-gap]){
						int temp=arr[i];
						arr[i]=arr[i-gap];
						arr[i-gap]=temp;
					}
					else{
						break;
					}	
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
