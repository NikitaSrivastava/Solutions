//https://www.interviewbit.com/problems/add-one-to-number/
public class Solution {
  public ArrayList<Integer> plusOne(ArrayList<Integer> a) {
      int p = a.size() - 1;
      int c =0;
      int k = 0;
      while(a.get(k++) == 0 && a.size()>1){
      a.remove(k);
      p--;
      }
      while(p >= 0){
             if(a.get(p) < 9 ){
                 a.set(p,a.get(p) + 1);
                 //if(c = 1)
                 c = 0;
                 break;
             }
             else if (a.get(p) == 9)
             {
                a.set(p,0);
                c = 1;
             }
             p--;    
      }
      if( c == 1)
        a.add(0,1);
      return a;
     }
}     



