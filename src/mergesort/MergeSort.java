package mergesort;

public class MergeSort {
	public void mers(int[] unsort) {
		sort(unsort,0,unsort.length-1);
	}

	private void sort(int[] unsort, int low, int high) {
		// TODO 自动生成的方法存根
		if(high<=low)
			return;
		int mid = low +(high-low)/2;
		sort(unsort, low, mid);
		sort(unsort, mid+1, high);
		merge(unsort,low,mid,high);
	}

	private void merge(int[] unsort, int low, int mid, int high) {
		// TODO 自动生成的方法存根
		int[] helper=new int[unsort.length];
		for(int k=low;k<=high;k++)
			helper[k]=unsort[k];
		int i=low,j=mid+1;
		for(int k=low;k<=high;k++){
			if(i>mid){
				unsort[k]=helper[j];
				j++;
			}else if (j>high) {
				unsort[k]=helper[i];
				i++;
			}else if (helper[i]>helper[j]) {
				unsort[k]=helper[j];
				j++;
			}else{
				unsort[k]=helper[i];
				i++;
			}
		}
	}
}
