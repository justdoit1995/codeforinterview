package codeforinterview;

public class binaryInsertSort {
	public static void main(String args[]) {
		int[] source= {1,23,413124,21233,2,44};
		binarySort(source);
	}
	public static void binarySort(int[] source) {
		int high,low,mid;
		for(int i=1;i<source.length;i++) {
			low=0;
			high=i-1;
			int temp=source[i];
			while(low<=high) {
				mid=(low+high)>>1;
			if(temp<source[mid]) {
				high=mid-1;
			}else {
				low=mid+1;
			}
			for(int j=i-1;j>=low;j--) {
				source[j+1]=source[j];
			}
			source[low]=temp;
			}
		}
	}
}
