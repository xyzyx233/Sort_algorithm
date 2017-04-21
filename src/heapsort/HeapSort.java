package heapsort;

public class HeapSort {
	/*
	 * ͨ���Ƚ�����ֵ��ѡ����С��ֵ������С��ֵ�ŵ����һ����Ҷ�ӽ���ϡ�
	 * */
	public void siftdown(int[] num,int k,int size,int sign){
		int half=size>>>1;
		while(k<half){
			int index=k;
			int l=(k<<1)+1;
			if(l<size && (sign*num[l])<(sign*num[index])){
				index=l;
			}
			int r=l+1;
			if(r<size && (sign*num[r])<(sign*num[index])){
				index=r;
			}
			if(k==index)
				break;
			int temp=num[k];
			num[k]=num[index];
			num[index]=temp;
		}
	}
	private void heapify(int[] nums,int size,int sign) {
		for(int i=size/2;i>=0;i--)
			siftdown(nums, i, size, sign);
	}
	private void minHeap(int[] nums,int size){
		heapify(nums, size, -1);
	}
	private void maxHeap(int[] nums,int size) {
		heapify(nums, size, 1);
	}
	public void sort(int[] nums,boolean ascending) {
		if(ascending){
			maxHeap(nums, nums.length);
			for(int i=nums.length-1;i>=0;i--){
				int temp=nums[0];
				nums[0]=nums[i];
				nums[i]=temp;
				maxHeap(nums, i);
			}
		}else {
			minHeap(nums, nums.length);
			for(int i=nums.length-1;i>=0;i--){
				int temp=nums[0];
				nums[0]=nums[i];
				nums[i]=temp;
				minHeap(nums, i);
			}
		}
	}
}
