import java.util.*;
public class Hashing {
    public static int HashMapNearlyIdentical(int[] a){
        HashMap<Integer, Integer> H = new HashMap<>();
        for(int value : a){
            H.put(value, H.getOrDefault(value,0) + 1);
        }

        int longest = 0;
        for(int key : H.keySet()){
            if(H.containsKey(key + 1)){
                longest = Math.max(longest, H.get(key)+(int) H.get(key +1));
            }

        }
        
        return longest;
    }
}
