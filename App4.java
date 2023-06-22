import java.io.Closeable;
import java.io.IOException;

class MyResource12 implements Closeable {
    public void close() {
        System.out.print("r1 ");
    }
}

class MyResource21 implements AutoCloseable {
    public void close() throws IOException {
        System.out.print("r2 ");
        throw new IOException();
    }
}

public class App4 {
    public static void main(String[] args) {
        try (
             MyResource21 r2 = new MyResource21();
             MyResource12 r1 = new MyResource12();)
        {
            System.out.print("try ");
        }
        catch (Exception e) {
            System.out.print("catch ");
            for (Throwable t: e.getSuppressed()) {
                System.out.println(t.getClass().getName());
            }
        }
    }
}