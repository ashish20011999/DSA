import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ContainsDuplicate {
    public static void main(String args[])
    {
        int[] array = {1,2,3,1};
        System.out.println(CheckDuplicates(array));
    }
    public static boolean CheckDuplicates(int[] array)
    {   Map<Integer,Integer> elementCountMap = new HashMap<>();
        for(int i=0;i<array.length;i++)
        {
            elementCountMap.putIfAbsent(array[i],0);
            elementCountMap.put(array[i],elementCountMap.get(array[i])+1);
            if(elementCountMap.get(array[i])>1)
            {
                return false;
            }
        }
        return true;
    }
}
