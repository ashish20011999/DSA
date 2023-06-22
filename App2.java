import java.util.stream.Stream;

public class App2 {
    public static void main(String[] args) {
        Stream < Integer > nums = Stream.of(1, 2, 3, 4, 5);
        //stream has been operated on once
        nums.filter(n -> n % 2 == 1);
        //stream cannot be operated again
        nums.forEach(p -> System.out.print(p));
    }
}