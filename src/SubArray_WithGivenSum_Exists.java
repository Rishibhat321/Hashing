import java.util.HashSet;

public class SubArray_WithGivenSum_Exists {

    public static boolean SubArrayWithSum(int[] arr,int n, int sum)
    {
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                return true;
            }
        }

        int prefix_sum = 0;

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


        int[] arr = {10,2,-2,-20,10};
        int sum = -10;

        boolean res = SubArrayWithSum(arr, arr.length , sum);

        if(res){
            System.out.println("Subarray with given sum exists");
        }
        else{
            System.out.println("Subarray with given sum does not exists");
        }
    }
}
