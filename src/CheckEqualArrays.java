import java.util.*;
import java.util.HashMap;

public class CheckEqualArrays {
    public static boolean check(long[] A,long[] B,int N)
    {
        HashMap<Long, Integer> map1 = new HashMap<Long, Integer>();
        HashMap<Long, Integer> map2 = new HashMap<Long, Integer>();

        int count=0;

        for(int i=0;i<N;i++)
        {
            if(!map1.containsKey(A[i])){

                map1.put(A[i],1);
            }
            else{

                map1.put(A[i], map1.get(A[i])+1);
            }
        }


        for(int i=0;i<N;i++)
        {
            if(!map2.containsKey(B[i]))
            {
                map2.put(B[i],1);
            }
            else{

                map2.put(B[i], map2.get(B[i])+1);
            }
        }

        int s = map1.size();

        for(Map.Entry<Long, Integer> e : map1.entrySet())
        {
            Long key = e.getKey();
            Integer val = e.getValue();

            if(!map2.containsKey(key)){
                return false;
            }

            else if(val == map2.get(key)){
                count++;
            }

        }

        return (count==s);

    }
    public static void main(String[] args) {

        long[] A = {1, 2, 5, 4, 0};
        long[] B  = {2, 4, 5, 0, 1};
        int N = A.length;

        boolean res= check( A, B, N);

        System.out.println(res);

    }
}