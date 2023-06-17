public class CountNoOfObjects {
    //program to find the number of objects created
    static int noOfObjects = 0;
    {
        noOfObjects++;
    }
    public CountNoOfObjects()
    {

    }
    public CountNoOfObjects(String s)
    {

    }
    public CountNoOfObjects(int s)
    {

    }
    public static void main(String args[])
    {
        CountNoOfObjects ob1 = new CountNoOfObjects();
        CountNoOfObjects ob2 = new CountNoOfObjects("ashish");
        CountNoOfObjects ob3= new CountNoOfObjects(1);
        System.out.println(CountNoOfObjects.noOfObjects);
    }
}
