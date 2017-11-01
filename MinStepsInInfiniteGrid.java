//https://www.interviewbit.com/problems/min-steps-in-infinite-grid/      --InterviewBit Link 

public class Solution {
    // X and Y co-ordinates of the points in order.
    // Each point is represented by (X.get(i), Y.get(i))
    public int coverPoints(ArrayList<Integer> x, ArrayList<Integer> y) {
        int st = 0,step = 0 ;
        for(int i=0; i < x.size()-1 ; i++){
         st = Math.max(Math.abs(x.get(i+1)-x.get(i)),Math.abs(y.get(i+1)-y.get(i));
         step +=st;
        }  
        return step<0?-step:step;
    }
    
}
