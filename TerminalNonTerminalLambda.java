import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalNonTerminalLambda {
    public static void main(String[] args) {

        List<Long> list = List.of(1l,2l,4l,1l,3l,4l,22l,34l);
        List<Long> collect = list.stream().distinct().collect(Collectors.toList());
        System.out.println(collect);
        List<Long> collect1 = list.stream().sorted().collect(Collectors.toList());
        System.out.println(collect1);
        OptionalDouble max = Stream.of(1d, 2d, 3d)
                .mapToDouble(Double::doubleValue).max();
        System.out.println(max.getAsDouble());
        double maximum = Stream.of(1d, 2d, 3d)
                .mapToDouble(Double::doubleValue).max().getAsDouble();
        System.out.println(maximum);
        double average = Stream.of(1d, 2d, 3d)
                .mapToDouble(Double::doubleValue).findAny().getAsDouble();
        System.out.println(average);
        Map<Long,Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        map.entrySet().forEach(i-> System.out.println(i.getKey()+" "+i.getValue()));
        Optional<Double> findany = Stream.of(1d, 2d, 3d).filter(i->i>2d).findAny();
        System.out.println(findany);
        Optional<Double> findFirst = Stream.of(1d, 2d, 3d).filter(i->i>1d).findFirst();
        System.out.println(findFirst);
        boolean anymatch = Stream.of(1d, 2d, 3d).anyMatch(i->i>1d);
        System.out.println(anymatch);
    }
}
