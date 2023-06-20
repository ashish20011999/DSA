import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

abstract interface StringLength {
    public int stringLength(String string);
}

public class LambdaAndStream {
    public static void main(String[] args) {

//        --------------------/// lambda ///--------------------
        List<Integer> arrayList = new ArrayList<>();
        AbstractClass abstractClass = () -> {
            System.out.println("ashsih");
        };
        abstractClass.someMethod();
        Test1 test = (a, b) -> {
            return a + b;
        };
        System.out.println(test.dotest(8, 9));
        StringLength string =(str)->{
            return str.length();
        };
        System.out.println(string.stringLength("ashish"));
        //        --------------------/// lambda ///--------------------

        //        --------------------/// stream///--------------------

        List<Integer> mylist1 = List.of(2,3,4,5,6,7,8);
        List<String> myList2 = List.of("ashish","b");
        List<String> collect = myList2.stream().filter(i -> i.length() > 5).collect(Collectors.toList());
        List<String> collect1 = myList2.stream().map(i->i+" samal").filter(i -> i.length() > 5).collect(Collectors.toList());
        //map is used for iterating and performing over each element in the stream;

        parse(myList2);
        parse(mylist1);
        parse(collect);
        parse(collect1);
        }

    public static void parse(List<?> list) {
        list.stream().forEach(System.out::println);
    }


}
