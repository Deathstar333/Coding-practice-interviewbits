import java.util.*;

public class QuickSort {
	
	public int partition(ArrayList<Integer> A, int start, int end) {
		int pivot = A.get(end),temp = 0;
		int pIndex = start;
		for(int i = start; i < end; i++) {
			if( A.get(i) <= pivot ) {
				temp = A.get(i);
				A.set(i, A.get(pIndex));
				A.set(pIndex, temp);
				pIndex++;
			}
		}
		A.set(end, A.get(pIndex));
		A.set(pIndex, pivot);
		return pIndex;
	}
	
	public void quickSorting(ArrayList<Integer> A, int start, int end) {
		if(start < end) {
			int pIndex = partition(A,start,end);
			quickSorting(A,start,pIndex-1);
			quickSorting(A,pIndex+1,end);
		}
	}
	
	public static void main(String args[]) {
		
		ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(2,3,6,7,1,4,5,8));
		QuickSort Q = new QuickSort();
		
		System.out.println("Unsorted Array: " + A);
		Q.quickSorting(A,0,A.size()-1);
		System.out.println("Sorted Array: " + A);
		
	}
	
}