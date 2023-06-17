import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.abs;

public class ContainsDuplicate2 {
    public static void main(String args[]) {
        int[] array ={1,2,3,4,1};
        int gap =3;
        System.out.println(containsNearbyDuplicate(array,gap));
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> elementToIndexMap= new HashMap<>();
        for(int i=0;i< nums.length;i++)
        {
            if(elementToIndexMap.containsKey(nums[i])&&abs(elementToIndexMap.get(nums[i])-i)<=k)
            {
                return true;
            }
            else
            {
                elementToIndexMap.put(nums[i],i);
            }
        }
        return false;
    }
}
