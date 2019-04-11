
// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N) {
        int zero = '0';
        List<Integer> total = new ArrayList<Integer>();
        
        String bString = Integer.toBinaryString(N);

        int count = 0;
        for(int i = 0; i < bString.length(); i++){
            if(bString.charAt(i) == (char)zero){
                count++;    
            }else{
                total.add(count);
                count = 0;
            }
        }
        
        
        int result = 0;
        for(int j = 0; j < total.size(); j++){
            if(total.get(j) > result){
                result = total.get(j);
            }
        }
        
        return result;
        
    }