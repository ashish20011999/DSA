import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumUsingMapOptimised {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int target = 9;
        int[] result = returnOutput(numbers,target);
        System.out.println(Arrays.toString(result));
    }
    public static int[] returnOutput(int[] numbers, int target)
    {   //searching in a map is O(1) complexity therefore we will put all the elements in a map
        //then we will search if the counter element in present in that map or not
        Map<Integer, Integer> elementToIndex = new HashMap<>();
        for(int i=0;i<numbers.length;i++)
        {
            if(elementToIndex.containsKey(target-numbers[i])){
             return new int[] {elementToIndex.get(target-numbers[i]),i};
            }
            else{
                elementToIndex.put(numbers[i],i);
            }
        }
        return new int[] {};
    }
}
