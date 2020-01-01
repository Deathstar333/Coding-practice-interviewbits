public class Solution {
    
    int partition(ArrayList<Integer> A, int start, int end) {
        int pivot = A.get(end);
        int pIndex = start, temp = 0;
        for(int i=start; i<end; i++) {
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
    
    void quickSort(ArrayList<Integer> A, int start, int end) {
        if(start < end) {
            int pIndex = partition(A,start,end);
            quickSort(A,start,pIndex-1);
            quickSort(A,pIndex+1,end);
        }
    }
    
    public ArrayList<Integer> wave(ArrayList<Integer> A) {
        int n =A.size();
        quickSort(A,0,n-1);
        
        //System.out.println("Array before wave: " + A);
        for(int i=0; i<n-1; i += 2) {
            int temp = A.get(i);
            A.set(i, A.get(i+1));
            A.set(i+1, temp);
        }
        //System.out.println("Array after wave: " + A);
        
        return A;
    }
}