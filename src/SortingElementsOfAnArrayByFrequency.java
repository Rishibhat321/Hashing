import java.util.*;
import java.util.HashMap;

public class SortingElementsOfAnArrayByFrequency {

   public static ArrayList<Integer> sortByFreq(int[] arr, int n)
    {


        ArrayList<Integer> list = new ArrayList<Integer>();

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int min=0;
        int c=0;
        int k=0;


        for(int i=0;i<n;i++)
        {
            if(!map.containsKey(arr[i]))
            {
                map.put(arr[i],1);
            }
            else{
                map.put(arr[i], map.get(arr[i])+1);
            }
        }

        while(!map.isEmpty())
        {
            min = 0;
            c = 0;

            for(Map.Entry<Integer, Integer> e : map.entrySet())
            {
                Integer key = e.getKey();
                Integer val = e.getValue();

                if(min<val)
                {
                    min = val;
                    k = key;
                }

                else if(min == val && k>key){
                    k = key;
                }
            }

            while(c<min){
                list.add(k);
                c++;
            }

            map.remove(k);

        }

        return list;

    }
    public static void main(String[] args) {

       int[] arr = {5,5,4,6,4};

       ArrayList<Integer> res = sortByFreq(arr, arr.length);

        System.out.println(res);


    }
}
