import java.lang.reflect.Array;
import java.util.*;

public class ThreeSum {
    public static void main(String args[])
    {
        int[] array ={-1,0,1,2,-1,-4};
        int target = 0;
        Set<int[]> result = threeSumTriplets(array,target);
        result.stream().forEach(arrays ->{
            System.out.println(Arrays.toString(arrays));
        });
    }
    public static Set<int[]> threeSumTriplets(int[] array, int target)
    {   Set<int[]> result = new HashSet<>();
        int l = 0;
        for(int i=0;i<array.length;i++)
        {
            for(int j = i+1;j<array.length;j++)
            {
                for(int k = j+i;k<array.length;k++)
                {
                    if(array[i]+array[j]+array[k]==target)
                    {
                        int[] temp = new int[] {array[i],array[j],array[k]};
                        Arrays.sort(temp);
                        result.add(temp);
                    }
                }
            }
        }
        return result;
    }
}
