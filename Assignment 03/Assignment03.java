/*Create an ArrayList that can store only Strings. 
Create a printAll method that will print all the elements of the ArrayList using an Iterator.
*/

import java.util.ArrayList;
import java.util.Iterator;

public class Assignment03 {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("Item 1 - Apple");
        list.add("Item 2 - Mango ");
        list.add("Item 3 - Banana");
        list.add("Item 4 - Pine Apple");
        list.add("Item 5 - Strawberry");

        printAll(list);
    }

    static void printAll(ArrayList<String> list){
        Iterator<String> itr = list.iterator();

        while(itr.hasNext())
            System.out.println(itr.next());
    }
}
