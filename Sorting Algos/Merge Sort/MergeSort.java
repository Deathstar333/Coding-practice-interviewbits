import java.util.*;
import java.io.*;

class MergeSort {
	
	ArrayList<Integer> merge(ArrayList<Integer> A, ArrayList<Integer> L, ArrayList<Integer> R) {
		
		int n = A.size(), nL = L.size(), nR = R.size();
		int i = 0, j = 0, k = 0;
		while( i < nL && j < nR ) {
			
			if(L.get(i) <= R.get(j)) {
				A.set(k,L.get(i));
				i++;
			}
			else {
				A.set(k,R.get(j));
				j++;
			}
			k++;
		}
		while( i < nL ) {	
			A.set(k,L.get(i));
			i++;
			k++;
		}
		while ( j < nR ) {
			A.set(k,R.get(j));
			j++;
			k++;
		}
		return A;
	}
	
	ArrayList<Integer> mergeSorting(ArrayList<Integer> A) {
		
		int n = A.size();
		if(n < 2) {
			return A;
		}
		int mid = n/2;
		ArrayList<Integer> L = new ArrayList<Integer>();
		ArrayList<Integer> R = new ArrayList<Integer>();
		for(int i = 0; i < mid; i++) {
			L.add(A.get(i));
		}
		
		for(int i = mid; i < n; i++) {
			R.add(A.get(i));
		}
		L = mergeSorting(L);
		R = mergeSorting(R);
		A = merge(A,L,R);
		return A;
		
	}
	
	public static void main(String args[]) {
		
		ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(1,2,6,3,5,4));
		MergeSort C = new MergeSort();
		
		System.out.println("Original array: ");
		System.out.println(A);
		
		A = C.mergeSorting(A);
		
		System.out.println("Sorted array:");
		System.out.println(A);
	}
	
}