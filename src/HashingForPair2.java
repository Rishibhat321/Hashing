import java.util.HashSet;

public class HashingForPair2 {
    public static int sumExists(int[] arr, int N, int sum) {

        HashSet<Integer> h = new HashSet<Integer>();

        for(int ele:arr)
        {
            if(h.contains(sum-ele))
            {
                return 1;
            }
            else{
                h.add(ele);
            }
        }

        return 0;
    }
    public static void main(String[] args) {

        int[] arr  ={4, 3, 5, 6};
        int sum = 12;
        int N= arr.length;

        int res = sumExists(arr, N, sum);

        if(res==1){
            System.out.println("Pair exists");
        }
        else{
            System.out.println("Pair does not exists");
        }

    }
}
