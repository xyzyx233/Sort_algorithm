package insertionsort;

public class Insertion {
	public void Inss(int[] unsort) {
		int len=unsort.length;
		for(int  i=0;i<len;i++){
			int index=i, temp=unsort[i];
			while(index> 0 && unsort[index-1]>temp){
				unsort[index]=unsort[index-1];
				index--;
			}
			unsort[index]=temp;
		}
	}
}
