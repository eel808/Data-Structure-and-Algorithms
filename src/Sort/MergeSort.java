package Sort;

import java.util.Arrays;

import org.junit.Test;

public class MergeSort {
	
	@Test
	public void mergeSort(){
		int[] arr={22,7,16,80,5,55,123,997,32,11,222,355,999};
	    sort(arr,0,arr.length-1);
	    System.out.println(Arrays.toString(arr));
	}
	
	public void sort(int[] arr,int left,int right){
		if(right>left){
			int mid=(left+right)/2;
			sort(arr,left,mid);
			sort(arr,mid+1,right);
			merge(arr,left,mid,right);	
		}	
	}
	
	public void merge(int[] arr,int left,int mid,int right){
		int[] temp=new int[right-left+1];
		int index=0;
		int l=left;
		int r=mid+1;     
		while(l<=mid&&r<=right){
			if(arr[l]<arr[r]){
				temp[index++]=arr[l++];
			}
			else{
				temp[index++]=arr[r++];
			}
		}
		while(l<=mid){
			temp[index++]=arr[l++];
		}
		while(r<=right){
			temp[index++]=arr[r++];
		}
		for(int i=0;i<temp.length;i++){
			arr[left+i]=temp[i];
		}
	}

}
