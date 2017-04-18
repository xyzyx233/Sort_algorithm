package maintest;

import insertionsort.Insertion;
import insertionsort.Shellsort;
import mergesort.MergeSort;
import quicksort.Inplace;
import selectionsort.Selection;

public class MainTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] unsort=new int[]{6, 5, 3, 1, 8, 7, 2, 4};
		Inplace selection=new Inplace();
		System.out.println("Before:");
		for(int i=0;i<unsort.length;i++){
			System.out.print(unsort[i]+" ");
		}
		selection.	quicks(unsort,2);
		System.out.println("\nAfter:");
		for(int i=0;i<unsort.length;i++){
			System.out.print(unsort[i]+" ");
		}
	}
}
