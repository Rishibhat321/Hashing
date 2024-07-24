import java.util.*;
import java.util.HashMap;

public class SortAnArrayAccordingToTheOther {

    public static int[] sortA1ByA2(int[] A1, int N, int[] A2, int M)
    {

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();


        int[] arr = new int[N];

        for(int i=0;i<N;i++)
        {
            if(!map.containsKey(A1[i])){

                map.put(A1[i], 1);
            }
            else{
                map.put(A1[i], map.get(A1[i])+1);
            }
        }

        int val=0;
        int c=0;
        int j=0;
        int e=0;


        for(int i=0;i<M;i++){
            e = A2[i];
            c=0;

            if(map.containsKey(e)){
                val = map.get(e);
                while(c<val){
                    arr[j] = e;
                    c++;
                    j++;
                }

                map.remove(e);
            }

        }



        if(arr[0] == 0){
            Arrays.sort(A1);

            return A1;
        }

        c=0;
        int ind = j;

        for(Map.Entry<Integer, Integer> set : map.entrySet()){

            Integer key = set.getKey();
            Integer v = set.getValue();
            c=0;

            while(c<v){
                arr[j]=key;
                j++;
                c++;
            }
        }

        Arrays.sort(arr, ind, N);
        return arr;

    }
    public static void main(String[] args) {

        int[] A1 = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8};
        int[] A2 = {2, 1, 8, 3};

        int[] res = sortA1ByA2(A1, A1.length, A2, A2.length);

        for(int ele: res){
            System.out.print(ele + " ");
        }

    }
}
