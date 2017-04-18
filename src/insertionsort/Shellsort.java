package insertionsort;

public class Shellsort {
	public void shes(int[] unsort) {
		int len=unsort.length;
		int gap,i,j;
		int temp;
		for(gap=len>>1;gap>0;gap>>=1){
			for(i=gap;i<len;i++){
				temp=unsort[i];
				for(j=i-gap;j>=0&&unsort[j]>temp;j-=gap){
					unsort[j+gap]=unsort[j];
				}
				unsort[j+gap]=temp;
			}
		}
	}
}
