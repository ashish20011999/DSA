public class signFunction {
    public static void  main(String args[])
    {
        int[] nums = {-1,-2,-3,-4,3,2,1};
        System.out.println(signFunctionValue(nums));
    }
    public static int signFunctionValue(int[] nums)
    {   int result=1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                return 0;
            }
            else if(nums[i]<0)
            {
                result = -1*result;
            }
            else if(nums[i]>0)
            {
                result = 1*result;
            }
        }
        return result;
    }
}
