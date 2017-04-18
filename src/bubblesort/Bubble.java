package bubblesort;

public class Bubble<T> implements Comp<T> {
	public void bsort(T[] unsort) {
		int len = unsort.length;
		for (int i = 1; i < len; i++) {
			for (int j = 0; j < len - i; j++) {
				if (compare(unsort[j],unsort[j + 1])) {
					T temp = unsort[j];
					unsort[j] = unsort[j + 1];
					unsort[j + 1] = temp;
				}
			}
		}
	}

	@Override
	public boolean compare(T a, T b) {
		return true;
	}
}
