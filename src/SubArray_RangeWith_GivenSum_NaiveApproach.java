public class SubArray_RangeWith_GivenSum_NaiveApproach {
  public static int subArraySum(int[] arr, int n, int sum)
    {
        int s = 0;
        int count = 0;

        for(int i=0;i<n;i++)
        {
            s=0;
            for(int j=i;j<n;j++)
            {
                s += arr[j];

                if(s==sum)
                {
                    count++;
                }
            }
        }

        return count;
    }
    public static void main(String[] args) {

      int[] arr = {10,2,-2,-20,10};
      int sum = -10;

      int res = subArraySum(arr, arr.length , sum);

        System.out.println(res);
    }
}
