import java.util.HashMap;
import java.util.Map;

public class SubArrayDivisibleByK {

    public static void main(String args[])
    {

        int[] arr = {5,10,11,9,5};
        int k =5;
        int count =0;
//        SubArrayCount(arr,0,0,k,count);
//        System.out.println("Count of subarrays " +count);
        System.out.println(countSubArrays(arr,k));
    }
    public static int countSubArrays(int[] arr,int k)
    {
        int n=arr.length;
        Map<Integer,Integer> map = new HashMap<>();
        int sum=0;
        int count=0;
        map.put(0,1);
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            int rem = sum%k;
            if(rem<0)
            {
                rem+=k;
            }
            if(map.containsKey(rem))
            {
                count+=map.get(rem);
                map.put(rem,map.get(rem)+1);
            }
            else
            {
                map.put(rem,1);
            }
        }
        return count;
    }
    public static void SubArrayCount(int[] arr, int start, int end, int k,int count) {
        if(end==arr.length)
        {
            return;
        }
        else if(start>end)
        {
            SubArrayCount(arr,0,end+1,k,count);
        }
        else{
            int sum=0;
            for(int i = start;i<=end;i++)
            {
                sum+=arr[i];
            }
            if(sum%k==0)
            {
                System.out.print(sum+" ");
                System.out.print("[");
                for(int i = start;i<=end;i++)
                {
                    if(i!=end)
                        System.out.print(arr[i]+",");
                    else
                        System.out.print(arr[i]);
                }
                System.out.print("]"+" ");
                count++;
                System.out.println(count);

            }
            SubArrayCount(arr,start+1,end,k,count);
            return;
        }

    }
}
