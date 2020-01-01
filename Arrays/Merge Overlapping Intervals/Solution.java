/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    
    public int partition(ArrayList<Interval> A, int start, int end) {
        Interval pivot = A.get(end),temp = new Interval();
        int pIndex = start;
        for(int i = start; i < end; i++) {
            if( A.get(i).start <= pivot.start ) {
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
    
    public void quickSorting(ArrayList<Interval> A, int start, int end) {
        if(start < end) {
            int pIndex = partition(A,start,end);
            quickSorting(A,start,pIndex-1);
            quickSorting(A,pIndex+1,end);
        }
    }
    
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        int n = intervals.size(), endIndex=0;
        quickSorting(intervals,0,n-1);
        
        ArrayList<Integer> combined = new ArrayList<Integer>();
        ArrayList<Interval> ans = new ArrayList<Interval>();
        
        for(int i=0; i<n; i++) {
            if(i == n-1) {
                combined.add(intervals.get(i).start);
                combined.add(intervals.get(i).end);
                break;
            }
            
            combined.add(intervals.get(i).start);
            if(intervals.get(i).end >= intervals.get(i+1).start) {
                endIndex = intervals.get(i).end;
                while(intervals.get(i).end >= intervals.get(i+1).start) {
                    endIndex = Math.max(endIndex, intervals.get(i+1).end);
                    i++;
                    //System.out.println("interval end: " + endIndex);
                    if(i == n-1) {
                        break;
                    }
                }
                combined.add(endIndex);
            }
            else {
                combined.add(intervals.get(i).end);
            }
        }
        System.out.println("combined indices: " + combined);
        
        n = combined.size();
        for(int i=0; i<n; i = i + 2) {
            Interval x = new Interval(combined.get(i),combined.get(i+1));
            ans.add(x);
        }
        return intervals;
    }
}