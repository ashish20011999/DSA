public class MaxSumSubArrSizeK {
    public static void main(String args[])
    {
        int[] arr = {71,19,-78,69,31};
        int k =4;
        System.out.println(MaxSumAtMostK(arr,k));
    }
    public static int TempMaxSum(int[]arr, int k)
    {   int current_sum = 0;
        int max_sum = 0;
        for(int i=0;i<k;i++)
        {
           current_sum+=arr[i];
        }
        max_sum=current_sum;
        for(int i=k;i<arr.length;i++)
        {
            current_sum+=arr[i]-arr[i-k];
            max_sum=Math.max(current_sum,max_sum);
        }
        return max_sum;
    }
    public static int MaxSumAtMostK(int[] arr, int k)
    {   int bestSum=0;
        for(int i=0;i<k;i++)
        {
            bestSum = Math.max(bestSum,TempMaxSum(arr,i));
        }
        return bestSum;
    }
}
