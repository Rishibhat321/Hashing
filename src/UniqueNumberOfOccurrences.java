import java.util.*;
import java.util.HashMap;

public class UniqueNumberOfOccurrences {

    public static boolean isFrequencyUnique(int n, int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        HashSet<Integer> set = new HashSet<Integer>();

        for(int i=0;i<n;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }
            else{
                map.put(arr[i],map.get(arr[i])+1);
            }
        }


        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            Integer key = e.getKey();
            Integer val = e.getValue();

            set.add(val);
        }

        return (set.size()==map.size());
    }

    public static void main(String[] args) {

        int[] arr = {2, 2, 5, 10, 1, 2, 10, 5, 10, 2};

        boolean res =  isFrequencyUnique(arr.length, arr);

        if(res){
            System.out.println("Unique Occurrences");
        }
        else{
            System.out.println("No unique Occurrences");
        }


    }
}
