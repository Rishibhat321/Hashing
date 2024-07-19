import java.util.HashSet;

public class IntersectionOfTwoArrays {

    public static int NumberofElementsInIntersection(int[] a, int[] b, int n, int m) {

        HashSet<Integer> h = new HashSet<Integer>();
        int count=0;

        for(int ele:b)
        {
            h.add(ele);
        }

        for(int i=0;i<n;i++)
        {
            if(h.contains(a[i]))
            {
                count++;
                h.remove(a[i]);
            }
        }
        return count;
    }
    public static void main(String[] args) {

        int[] a  = {89, 24, 75, 11, 23};
        int[] b = {89, 2, 4};
        int n = a.length;
        int m = b.length;

        int res = NumberofElementsInIntersection(a, b, n, m);

        System.out.println(res);
    }
}
