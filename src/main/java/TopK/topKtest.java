package TopK;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class topKtest {
//获取数组中最小的几个数（最大堆）
	//获取数组中最大的几个数（最小堆）
	public static void main(String argsp[]) {
		
	}
	
	public static ArrayList<Integer> GetLeastNumbers_Solution(int[] input,int k){
		ArrayList<Integer> result = new ArrayList<Integer>();
		int length = input.length;
		if(k>length||k==0) {
			return result;
		}
	PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(k/*,new Comparator<Integer>() {
		public int compare(Integer o1,Integer o2) {
			return int(o2-o1);
		}
	}*/);
	for(int i=0;i<length;i++) {
		if(maxHeap.size()!=k) {
			maxHeap.offer(input[i]);
		}else if(maxHeap.peek()>input[i]) {
			Integer temp = maxHeap.poll();
			temp = null;
			maxHeap.offer(input[i]);
		}
	}
	for(Integer integer:maxHeap) {
		System.out.println(integer);
		result.add(integer);
	}
		return result;
	}
}
