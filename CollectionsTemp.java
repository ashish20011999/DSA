import java.util.ArrayList;
import java.util.HashSet;
import java.util.Vector;

public class CollectionsTemp {

    public static void main(String[] args) {
        System.out.println("creating collection examples");
        /*
        creating collections
        1) Type Safe - same type of elements can be added to collection
        2) UnType Safe - different types of element can be added to collection.
         */

        //Type safe  collection
        ArrayList<String> names = new ArrayList<>();
        names.add("ashish");
        names.add("ashish");
//        names.add(24);//throws error
        System.out.println(names); //order is preserved and duplicates are allowed
        System.out.println(names.get(0)); //indexed collection


        //Untype safe
        ArrayList namesArray = new ArrayList();
        namesArray.add("ashsih");
        namesArray.add(12);
        namesArray.add(true);
        namesArray.remove(0); //remove via the index;c
        System.out.println(namesArray);

        ArrayList<ArrayList<Integer>> arrayIntArr = new ArrayList<>();
        ArrayList<Integer> newArr = new ArrayList<>();
        newArr.add(12);
        newArr.add(13);

        ArrayList<Integer> newArr1 = new ArrayList<>();
        newArr1.add(14);
        newArr1.add(15);
        arrayIntArr.add(newArr);
        arrayIntArr.add(newArr1);

        System.out.println(arrayIntArr);

        //removed element by object
        arrayIntArr.remove(newArr1);

        System.out.println(arrayIntArr);

        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);

        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(3);
        hashSet.add(10);
        hashSet.add(7);
        hashSet.add(8);
        hashSet.add(2);
        System.out.println(hashSet);
    }
}
