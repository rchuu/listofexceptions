
// import java.util.ArrayList;
import java.util.*;

public class ListOfExceptions {
    public static void exceptionsList() {
        ArrayList<Object> list = new ArrayList<Object>();
        list.add(new Object()); // add a new object to the list
        list.add("13"); // add a string to the list
        list.add("hello world"); // add a string to the list
        list.add(14); // add an integer to the list
        list.add("goodbye world"); // add a string to the list

        // for (int i = 0; i < list.size(); i++) {
        // Integer castedValue = (Integer) list.get(i); // cast the object to an integer
        try {
            for (int i = 0; i < list.size(); i++) {
                Integer castedValue = (Integer) list.get(i); // cast the object to an integer
            }
        } catch (ClassCastException e) {
            System.out.println("catch the error here");
        }
    }
}