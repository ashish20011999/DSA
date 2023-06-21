import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Customer
{
    String name;
    List<String> phone;
    Customer(String name, List<String>phone)
    {
        this.name = name;
        this.phone = phone;
    }
    public String getName()
    {
        return this.name;
    }
}
public class FlatmapDataFlattering {
    public static void main(String[] args) {
        Customer customer1 = new Customer("ashish", Arrays.asList("84555", "45466"));
        Customer customer2 = new Customer("kumar", Arrays.asList("04555", "95466"));
        Customer customer3 = new Customer("samal", Arrays.asList("24555", "95466"));

        List<Customer> customers = new ArrayList<>();
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);

        List<String> collect = customers.stream().map(customer -> customer.getName()).collect(Collectors.toList());
        //this is an example of data mapping
        //mapping is one to one, i.e we are streaming a list while getting a list
        parse(collect);

        //let us see example of data flattering
        // we will stream a stream of objects, rather than streaming objects only in case of data mapping, so it is one
        // to many mapping, which will return a single list
        List<String> collect1 = customers.stream().flatMap(customer -> customer.phone.stream()).collect(Collectors.toList());
        System.out.println(Arrays.toString(new List[]{collect1}));
        parse(collect1);
    }
    public static void parse(List<?> obj)
    {
        obj.stream().forEach(System.out::println);
    }
}
