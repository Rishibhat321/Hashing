import java.util.HashSet;

public class CountNonRepeatedElements {
   public static long countNonRepeated(int[] arr, int n)
    {
        HashSet<Integer> s = new HashSet<Integer>();
        HashSet<Integer> s2 = new HashSet<Integer>();

        if(n==1)
        {
            s2.add(arr[0]);
            return s2.size();
        }

        for(int i=0;i<n;i++)
        {
            if(s.contains(arr[i]))
            {
                s2.add(arr[i]);
            }
            else{
                s.add(arr[i]);
            }
        }


        s.clear();

        for(int i=0;i<n;i++)
        {
            if(!s2.contains(arr[i]))
            {
                s.add(arr[i]);
            }
        }

        return s.size();
    }
    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 3, 3, 4, 5, 6, 7};
        int N = arr.length;

        long res = countNonRepeated(arr, N);

        System.out.println(res);

    }
}
