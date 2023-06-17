import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class KthSmallestElement
{
    public static void main(String args[])
    {
        int[] arr ={3,6,2,4,9,8,7};
        int k =2;
        System.out.println(KSmallestElement1(arr, k));
    }
    public static int KSmallestElement(int[] arr, int k)
    {
        Arrays.sort(arr);
        if(k<=arr.length)
        return arr[k-1];
        else
            return -1;
    }
    public static int KSmallestElement1(int[] arr, int k)
    {
        Map<Integer,Integer> elementFreq = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(!elementFreq.containsKey(arr[i]))
            {
                elementFreq.put(arr[i],1);
            }
            else {
                elementFreq.put(arr[i],elementFreq.get(arr[i])+1);
            }

        }
        int count=0;
        for(Map.Entry<Integer,Integer> entryset: elementFreq.entrySet())
        {
            count+=entryset.getValue();
            if(count>=k)
            {
                return entryset.getKey();
            }
        }
        return -1;
    }
}
