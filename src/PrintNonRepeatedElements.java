import java.util.*;
import java.util.HashSet;

public class PrintNonRepeatedElements {
   public static ArrayList<Integer> printNonRepeated(int[] arr, int n)
    {
        HashSet<Integer> s = new HashSet<Integer>();
        HashSet<Integer> s2= new HashSet<Integer>();

        ArrayList<Integer> list  =new ArrayList<Integer>();

        if(n==1)
        {
            list.add(arr[0]);
            return list;
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


        for(int i=0;i<n;i++)
        {
            if(!s2.contains(arr[i]))
            {
                list.add(arr[i]);
            }
        }


        return list;
    }
    public static void main(String[] args) {

       int[] arr = {10,20,40,30,10};
       int n = arr.length;

       ArrayList<Integer> res = printNonRepeated(arr, n);

        System.out.println(res);

    }
}
