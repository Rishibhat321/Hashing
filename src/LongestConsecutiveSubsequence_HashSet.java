import java.util.HashSet;

public class LongestConsecutiveSubsequence_HashSet {

    public static int longestConsecutive(int[] nums) {

        if(nums.length==0)
        {
            return 0;
        }

        HashSet<Integer> set = new HashSet<Integer>();

        int res = 1;
        int curr = 1;

        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }

        for(int x:set)
        {
            if(!set.contains(x-1))
            {
                curr = 1;

                while(set.contains(x+curr))
                {
                    curr++;
                    res = Math.max(res,curr);
                }
            }
        }

        return res;

    }
    public static void main(String[] args) {

        int[] nums = {100,4,200,1,3,2};

        int result =  longestConsecutive(nums);

        System.out.println(result);

    }
}
