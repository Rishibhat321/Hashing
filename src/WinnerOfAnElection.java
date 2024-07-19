import java.util.*;
import java.util.HashMap;

public class WinnerOfAnElection {
    public static String[] winner(String[] arr, int n)
    {
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        String[] res = new String[2];

        for(String ele:arr)
        {
            if(!map.containsKey(ele)){

                map.put(ele,1);
            }
            else{
                map.put(ele, map.get(ele)+1);
            }
        }

        int max_value = 0;
        String win = "";

        for(Map.Entry<String, Integer> e : map.entrySet()){
            String key = e.getKey();
            Integer val = e.getValue();

            if(val>max_value){
                max_value = val;
                win = key;
            }
            else if(val == max_value && win.compareTo(key) > 0){
                win = key;
            }
        }

        res[0] = win;

        String str = Integer.toString(max_value);

        res[1] = str;

        return res;

    }

    public static void main(String[] args) {

        String[] arr = {"john" , "johnny" , "jackie" , "johnny" ,"john", "jackie" ,"jamie" ,
                "jamie" , "john" , "johnny" , "jamie" ,"johnny" ,"john"};

        String[] res = winner( arr, arr.length);

        for(String ele  :res){
            System.out.print(ele + " ");
        }


    }
}
