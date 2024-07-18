import java.util.HashSet;

public class SubarrayWithZeroSum {

    // using the concept of Prefix Sum and Hashing

    public static boolean findsum(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                return true;
            }
        }

        int prefix_sum = 0;
        int sum = 0;

        HashSet<Integer> set = new HashSet<Integer>();

        for(int i=0;i<n;i++)
        {
            prefix_sum += arr[i];

            if(arr[i]==0){
                return true;
            }

            if(prefix_sum==0)
            {
                return true;
            }

            if(set.contains(prefix_sum-sum)){
                return true;
            }

            set.add(prefix_sum);
        }

        return false;


    }
    public static void main(String[] args) {

        int[] arr = {4,2,-3,1,6};
        int n = arr.length;

        boolean res = findsum(arr, n);

        System.out.println(res);

    }
}
