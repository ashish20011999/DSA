public interface Test2 {

    //default method can have the method implementation,
    //for example 5 classes implements the same inteface having same code implementation for a method
    // if we want to add a new implementation then we can keep it default for the 5 classes and get a new implementation
    //for the  new class.
    default void method2() {
        System.out.println("method2");
    }

    static void method3() {
        System.out.println("method3");
    }

    public abstract void method4();
}