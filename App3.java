import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class MyResource1 implements Closeable {
    public void close() {
        System.out.print("r1 ");
    }
}

class YTEDf {




}



class MyResource2 implements AutoCloseable {
    public void close() throws IOException {
        System.out.print("r2 ");
        throw new IOException();
    }
}

public class App3 {
    public static void main(String[] args) {
        try (MyResource1 r1 = new MyResource1(); MyResource2 r2 = new MyResource2();) {
            System.out.print("try ");
        } catch (Exception e) {
            System.out.print("catch ");
            for (Throwable t: e.getSuppressed()) {
                System.out.println(t.getClass().getName());
            }
        }

        List<Container> arr = new ArrayList<>();
        arr.add(new Container(1));
        arr.add(new Container(2));

        arr.stream().map(c -> c.getID()).collect(Collectors.toList());
    }

    public static class Container {
        int id;

        public Container(int id) {
            this.id = id;
        }

        public int getID() {
            return this.id;
        }
    }

}