package selectionsort;

public class Selection {
	public void Sels(int[] unsort) {
		int len=unsort.length;
		for(int i=0;i<len;i++){
			for(int j=i+1;j<len;j++){
				if(unsort[i]>unsort[j]){
					int temp=unsort[i];
					unsort[i]=unsort[j];
					unsort[j]=temp;
				}
			}
		}
	}
}
