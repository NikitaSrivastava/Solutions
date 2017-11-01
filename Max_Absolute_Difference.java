
//https://www.interviewbit.com/problems/maximum-absolute-difference/

public class Solution {
    public int maxArr(ArrayList<Integer> A) {
    
     int n=A.size(),max1=A.get(0);
     int max2=A.get(0), min1=A.get(0),min2=A.get(0);
     int ans=0;

  for(int i=0;i<n; i++){
    max1=Math.max(max1, A.get(i)+i);
    max2=Math.max(max2, A.get(i)-i);
    min1=Math.min(min1,  A.get(i)+i);
    min2=Math.min(min2, A.get(i)-i);
  }

   ans = Math.max(ans, (max2 - min2));
   ans = Math.max(ans, (max1 - min1));

   return ans;
}
}


