package quicksort;

public class Inplace {
	public void quicks(int[] unsort,int a) {
		if(a==1)
			sort(unsort,0,unsort.length-1);
		else
			sort1(unsort,0,unsort.length-1);
	}

	private void sort(int[] unsort, int l, int u) {
		// TODO 自动生成的方法存根
		if(l>=u)
			return;
		int m=l;
		for(int i=l+1;i<=u;i++){
			if(unsort[i]<unsort[l]){
				m+=1;
				int temp=unsort[m];
				unsort[m]=unsort[i];
				unsort[i]=temp;
			}
		}
		int temp=unsort[m];
		unsort[m]=unsort[l];
		unsort[l]=temp;
		sort(unsort, l, m-1);
		sort(unsort, m+1, u);
	}
	public void sort1(int[] unsort,int l,int u) {
		if(l>=u)
			return;
		int pivot=unsort[l];
		int left=l+1;
		int right=u;
		while(left<=right){
			while(left<=right&&unsort[left]<pivot){
				left++;
			}
			while(left<=right&&unsort[right]>=pivot){
				right--;
			}
			if(left>right)
				break;
			int temp=unsort[left];
			unsort[left]=unsort[right];
			unsort[right]=temp;
		}
		int temp=unsort[right];
		unsort[right]=unsort[l];
		unsort[l]=temp;
		
		sort1(unsort,l,right-1);
		sort1(unsort, right+1, u);
	}
}
