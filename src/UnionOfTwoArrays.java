import java.util.HashSet;

public class UnionOfTwoArrays {

    public static int doUnion(int[] a, int n, int[] b, int m)
    {
        HashSet<Integer> h =new HashSet<Integer>();

        for(int ele:a)
        {
            h.add(ele);
        }

        for(int ele:b)
        {
            h.add(ele);
        }

        return h.size();
    }
    public static void main(String[] args) {

       int[] arr1 = {1, 2, 3, 4, 5};
       int[] arr2 = {1, 2, 3};

       int res = doUnion(arr1, arr1.length, arr2, arr2.length);

        System.out.println(res);
    }
}
