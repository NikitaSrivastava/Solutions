//https://www.interviewbit.com/problems/find-duplicate-in-array/

public class Solution {
  // DO NOT MODIFY THE LIST
  public int repeatedNumber(final List<Integer> a) {
      int f=0;
      int arr[]=new int[a.size()];
      for(int i=0; i < a.size(); i++){
          if(arr[a.get(i)] == 1)
             return a.get(i);
          else{
              int c=a.get(i);
              arr[c]++;
          }
      }
    
      if(f==0)
      return -1;
      return 1;
  }
}


