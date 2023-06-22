import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class product{
    String category;
    double price;

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
       this.price = price;
    }

    product(String category, int price)
    {
        this.category = category;
        this.price =price;
    }

}
class Order
{
    public List<product> getProducts() {
        return products;
    }
    public void setProducts(List<product> products) {
        this.products = products;
    }

    List<product> products;

}

public class StreamAndLambdaPractice{
    public static void main(String[] args) {
        List<product> products = new ArrayList<>();
        products.add(new product("book", 100));
        products.add(new product("cosmetic", 1010));
        products.add(new product("book", 10));
        products.add(new product("book", 101));

        List<product> book = products.stream().filter(p -> p.getCategory().equalsIgnoreCase("book")).filter(p -> p.getPrice() > 100).collect(Collectors.toList());
//        book.forEach(books-> System.out.println(books.getCategory()+" "+books.getPrice()));

        List<Order> orders = new ArrayList<>();
        List<product> products1 = new ArrayList<>();
        product product2 = new product("baby",100);
        product product3 = new product("book",101);
        product product4 = new product("cosmetic",500);
        products1.add(product2);
        products1.add(product3);
        products1.add(product4);
        Order order = new Order();
        order.setProducts(products1);
        orders.add(order);
        List<Order> baby = orders.stream().filter(o -> o.getProducts().stream().anyMatch(p->p.getCategory().equalsIgnoreCase("baby"))).collect(Collectors.toList());
//        baby.forEach(b->b.getProducts().forEach(bp->System.out.println(bp.getCategory()+" "+bp.getPrice())));
        Stream<product> book1 = products.stream().filter(p -> p.getCategory().equalsIgnoreCase("book")).filter(p -> p.getPrice() <= 100).peek(p -> p.setPrice(p.getPrice() * .9));
        book1.forEach(b-> System.out.println(b.getCategory()+" "+b.getPrice()));
    }

}
