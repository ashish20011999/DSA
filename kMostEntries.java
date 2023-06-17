import java.util.*;

public class kMostEntries {
    public static void main(String args[])
    {
        int[] array = {1,1,1,2,2,3};
        int k = 2;
        System.out.println(Arrays.toString(kMostEntriesResult(array,k)));
    }
    public static int[] kMostEntriesResult(int[] array,int k)
    {   int[] result = new int[k];
        Map<Integer,Integer> elementCountMap = new HashMap<>();
        for(int i=0;i<array.length;i++)
        {
            elementCountMap.putIfAbsent(array[i],0);
            elementCountMap.put(array[i],elementCountMap.get(array[i])+1);

        }
        //sorting the map

        //creating a list out of the map
        List<Map.Entry<Integer,Integer>> elementToCount =new ArrayList<>(elementCountMap.entrySet());

        //comparator variable of the map entry type intialised to entry.compareByValue object
        Comparator<Map.Entry<Integer,Integer>> comparator = Map.Entry.comparingByValue(Comparator.reverseOrder());

        //sorting the map
        elementToCount.sort(comparator);

        int i=0;

        for(Map.Entry<Integer, Integer>entryset : elementToCount)
        {
           result[i] = entryset.getKey();
           i++;
           if(i==k)
           {
               break;
           }
        }
        return result;

    }
}
