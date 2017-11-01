//https://www.interviewbit.com/problems/repeat-and-missing-number-array/

public class Solution {
    // DO NOT MODIFY THE LIST
    public ArrayList<Integer> repeatedNumber(final List<Integer> a) {
        int sq = 0, sum =0 , sumactual = 0, sqactual = 0,mul = 1,mulactual =1;;
        int save1 =0,save2 =0;
        ArrayList<Integer> n = new ArrayList<Integer> ();
        int arr [] = new int[a.size()];
        for(int i = 0; i< a.size(); i++ ){
           arr[i] = a.get(i) - 1;
        }
        for(int i = 0; i< a.size(); i++ ){
          arr[arr[i]%a.size()] += arr.length;
        }
          
        for(int i = 0; i<a.size();i++){
           if(arr[i]/a.size() == 2)
           save1 = i+1;
           else if(arr[i]/a.size() == 0)
               save2 = i+1;
        }
        
        n.add(save1);
        n.add(save2);
        return n;
    }
}

