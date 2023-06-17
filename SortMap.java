import java.util.*;

public class SortMap {
    public static void main(String args[])
    {
        Map<String, Integer> map = new HashMap<>();
        map.put("John", 25);
        map.put("Alice", 20);
        map.put("Bob", 30);
        map.put("Charlie", 18);
        List<Map.Entry<String,Integer>> mapToList = new ArrayList<>(map.entrySet());

        Comparator<Map.Entry<String,Integer>> comparator = Map.Entry.comparingByValue();
        mapToList.sort(comparator);

        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for(Map.Entry<String,Integer>entryset:mapToList)
        {
            sortedMap.put(entryset.getKey(),entryset.getValue());
        }
        System.out.println(sortedMap);
    }
}

