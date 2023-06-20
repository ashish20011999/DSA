public class IntefaceInstantiation {
    public static void main(String[] args){
//        Test obj = new Test();//this throws an error as the class is abstract
        Test1 obj = new Test1(){
            public int dotest(int a, int b){

                return a+b;
            }
        };
        System.out.println(obj.dotest(3,4));

        AbstractClass abstractClass = new AbstractClass() {
            //this is implementation of anonymous class
            public void someMethod() {
                System.out.println("concrete class method");
            }
        };
        abstractClass.someMethod();    }
}
abstract interface Test1{
    public abstract int dotest(int a, int b);

}
 abstract interface AbstractClass {
    public void someMethod();
}