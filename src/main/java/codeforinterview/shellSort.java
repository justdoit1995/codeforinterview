package codeforinterview;

import java.util.Arrays;

public class shellSort {
	public static void main(String args[]) {
		int[] arr= {3234,23,1345,45,5566};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	//希尔排序：针对有序序列在插入时采用交换法
	private static void sort(int[] arr) {
		for(int gap=arr.length/2;gap>0;gap/=2) {
			for(int i=gap;i<arr.length;i++) {
				int j=i;
				while(j-gap>=0&&arr[j]<arr[j-gap]) {
					swap(arr,j,j-gap);
					j-=gap;
				}
			}
		}
	}
	
	private static void swap(int[] arr,int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
