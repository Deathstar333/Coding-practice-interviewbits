import java.util.*;

public class InsertionSort {
	
	ArrayList<Integer> insertionSorting(ArrayList<Integer> A) {
		//sorting in ascending order
		int n = A.size(), value = 0, hole = 0;
		for(int i = 1; i < n; i++) {
			
			value = A.get(i);
			hole = i;
			while(hole > 0 && A.get(hole-1) > value) {
				
				A.set(hole, A.get(hole-1));
				hole = hole - 1;
				
			}
			A.set(hole, value);
		}
		return A;
	}
	
	public static void main(String args[]) {
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		InsertionSort C1 = new InsertionSort();
		
		System.out.println("Enter the length of the array: ");
		int len = scan.nextInt();
		int token = 0;
		
		System.out.println("Enter the array elements: ");
		for(int i = 0; i < len; i++) {
			
			token = scan.nextInt();
			arr.add(token);
			
		}
		
		System.out.println("The entered array: " + arr);
		arr = C1.insertionSorting(arr);
		System.out.println("The sorted array: " + arr);
		
	}
	
	
}