public class LongestConsecutiveSubsequence_Naive_onlyForPositiveNumbers {

    public static int findLongestConseqSubseq(int arr[], int N)
    {
        int max = arr[0];
        int s = 1;
        int r = 1;

        for(int i=1;i<N;i++)
        {
            if(max<arr[i])
            {
                max = arr[i];
            }
        }

        int[] res = new int[max+1];

        for(int i=0;i<res.length;i++)
        {
            res[i] = -1;
        }

        for(int i=0;i<N;i++)
        {
            res[arr[i]]++;
        }

        for(int i=0;i<res.length-1;i++)
        {
            if(res[i]!= -1 && res[i+1]!= -1)
            {
                s++;
            }
            else{
                s=1;
            }

            r = Math.max(s,r);

        }

        return r;
    }
    public static void main(String[] args) {

        int[] arr = {2,6,1,9,4,5,3};
        int N = arr.length;


        int result = findLongestConseqSubseq(arr, N);

        System.out.println(result);

    }
}
