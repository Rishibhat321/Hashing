import java.util.HashSet;

public class HashingForPair1 {
    public static int sumExists(int[] arr, int N, int sum) {

        HashSet<Integer> h = new HashSet<Integer>();

        for(int i:arr)
        {
            if(h.contains(sum-i))
            {
                return 1;
            }
            else{
                h.add(i);
            }
        }
        return 0;
    }
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 14;
        int N = arr.length;

        int res = sumExists(arr,  N, sum);

        if(res==1){
            System.out.println("Pair exists");
        }
        else{
            System.out.println("No pair exists");
        }

    }
}
