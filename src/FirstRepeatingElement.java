import java.util.HashSet;

public class FirstRepeatingElement {
    public static int firstRepeated(int[] arr, int n) {

        HashSet<Integer> s = new HashSet<Integer>();
        HashSet<Integer> s2= new HashSet<Integer>();

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
            if(s2.contains(arr[i]))
            {
                return (i+1);
            }
        }

        return -1;
    }
    public static void main(String[] args) {

        int[] arr = {1, 5, 3, 4, 3, 5, 6};
        int res = firstRepeated(arr, arr.length);

        System.out.println(res);


    }
}
