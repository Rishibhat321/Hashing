import java.util.HashSet;
import java.util.*;

public class PositiveNegativePair {
    public static ArrayList<Integer> findPairs(int[] arr, int n)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();

        HashSet<Integer> h  = new HashSet<Integer>();

        for(int i=0;i<n;i++)
        {
            int neg= -1*arr[i];
            if(h.contains(neg))
            {
                if(neg<0)
                {
                    list.add(neg);
                    list.add(arr[i]);
                }
                else{
                    list.add(arr[i]);
                    list.add(neg);
                }
            }
            else{
                h.add(arr[i]);
            }
        }

        if(list.isEmpty())
        {
            list.add(0);
        }

        return list;
    }

    public static void main(String[] args) {

        int[] arr = {1,3,6,-2,-1,-3,2,7};

        ArrayList<Integer> res = findPairs( arr, arr.length);

        System.out.println(res);

    }
}
