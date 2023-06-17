import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream1 {
    public static void main(String args[]){
    String string ="Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum";
    Map<String, Long> wordCount = Arrays.stream(string.toLowerCase().split("\\W+"))
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    for(Map.Entry<String, Long> map : wordCount.entrySet())
    {
        System.out.println(map.getKey()+" "+map.getValue());
    }
        List<Integer> list = List.of(2,3,4,5);
//        list.add(22); //this line throws an error
        Stream<Integer> stream1 = list.stream();
//        List<Integer> list2 = stream1.filter(i->i%2==0).collect(Collectors.toList());
        List<Integer> listall = stream1.filter(i->i%2==1).peek(x -> System.out.println(x)).toList();


}
}
