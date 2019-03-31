package codeforinterview;

public class quickSort {
	public static void main(String args[]) {
		int[] a= {24,56,2,1};
		quickSort(a,0,3);
		for(int b:a) {
			System.out.println(b);
		}
	}
	private static void quickSort(int[] a,int low,int high) {
		if(low>high) {
			return;
		}
		int i=low;
		int j=high;
		int key=a[low];
		while(i<j) {
			while(i<j&&a[j]>key) {
				j--;
			}
			while(i<j&&a[i]<=key) {
				i++;
			}
			if(i<j) {
				int p=a[i];
				a[i]=a[j];
				a[j]=p;
			}
		}
		int p=a[i];
		a[i]=a[low];
		a[low]=p;
		quickSort(a,low,i-1);
		quickSort(a,i+1,high);
	}
}
