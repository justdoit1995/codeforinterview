package codeforinterview;

import java.util.Arrays;

public class heapSort {
	public static void main(String args[]) {
		int[] arr= {9,3,123,4,7445};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	private static void sort(int[] arr) {
		//1.构造大顶堆
		for(int i=arr.length/2-1;i>=0;i--) {
			adjustHeap(arr,i,arr.length);
		}
		//2.调整堆结构+交换堆顶元素与末位元素
		for(int j=arr.length-1;j>0;j--) {
			swap(arr,0,j);
			adjustHeap(arr,0,j);
		}
	}
	
	//调整大顶堆
	private static void adjustHeap(int[] arr,int i,int length) {
		int temp=arr[i];
		for(int k=i*2+1;k<length;k=k*2+1) {
			if(k+1<length&&arr[k]<arr[k+1]) {
				k++;
			}
			if(arr[k]>temp) {
				arr[i]=arr[k];
				i=k;
			}else {
				break;
			}
		}
		arr[i]=temp;
	}
	
	private static void swap(int[] arr,int a,int b) {
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	
}
