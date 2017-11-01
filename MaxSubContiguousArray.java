//https://www.interviewbit.com/problems/max-sum-contiguous-subarray/

public class Solution {
  // DO NOT MODFIY THE LIST. 
  public int maxSubArray(final List<Integer> a) {
      int Large = -10000,sum = 0;
      for(int i=0; i< a.size() ;i++){
          sum+=a.get(i);
           
          if(sum < a.get(i)){
                   sum=a.get(i);
          }  
          if(sum > Large)
                   Large = sum;
      }
       return Large;
  }
}





