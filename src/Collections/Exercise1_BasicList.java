package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Objects;

public class Exercise1_BasicList {
    public static void main(String[] args) {

        ArrayList<String> citys = new ArrayList<>();
        citys.add("Gondal State");
        citys.add("Jamnagar State");
        citys.add("Rajkot State");
        citys.add("Dwarka - The kingdom of God");
        citys.add("Junagadh State");

//      Arraylist Size
        System.out.println(citys.size());

//      Checking if list is empty or not
        if (citys.isEmpty()) {
            System.out.println("Your list is empty");
        } else {
            System.out.println("Your list is not empty");
        }

//      Checking if list contains the specific value in it
        if (citys.contains("Delhi")) {
            System.out.println("Delhi is present");
        } else {
            System.out.println("Delhi is not present");
        }

//      Enhanced For Loop
        for (String city : citys) {
            System.out.println(city);
        }

//      get() and set() example
        System.out.println(citys.get(2));
        citys.set(1, "Mumbai");
        System.out.println(citys);

//        Remove() by index and value example
        citys.remove(2);
        System.out.println(citys);
        citys.remove("Junagadh State");
        System.out.println(citys);

//        Adding duplicate values and looping through it
        citys.add("Mumbai");
        System.out.println(citys);
        int count = 0;
        for (String city : citys) {
            if (Objects.equals(city, "Mumbai")) {
                count++;
            }
        }
        System.out.println(count);

//        Finding first and last occurrence
        System.out.println(citys.indexOf("Mumbai"));
        System.out.println(citys.lastIndexOf("Mumbai"));
        System.out.println(citys);

//        Reverse of list without using collections.sort() method
        for (int i = 0, j = citys.size() - 1; i < j; i++, j--) {
            String temp = citys.get(i);
            citys.set(i, citys.get(j));
            citys.set(j, temp);
        }
        System.out.println(citys);

//        Sorting & Utility Methods
        ArrayList<String> names = new ArrayList<>();

        names.add("Kirtika");
        names.add("Dhruvit");
        names.add("Mayank");
        names.add("Twinkle");
        names.add("Parth");
        names.add("Jenil");
        names.add("Bhavisha");


//        sorting the arraylist using sort() algorithm.
//        Before Sorting
        System.out.println(names);
//        After Sorting
        Collections.sort(names);
        System.out.println(names);

//        Sorting numbers in descending using comparator and lambda
        ArrayList<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);
        number.add(6);
        number.add(7);

//        Finding min and max from number
        System.out.println(Collections.max(number));
        System.out.println(Collections.min(number));

//        No — the last index is NOT counted as 3 after removal.
//        After removing an element, the list shrinks and indexes are recalculated immediately.
        Person p1 = new Person("Bhavin", 29, "1-10-1997");
        Person p2 = new Person("ShaileshBhai", 55, "25-04-1972");
        Person p3 = new Person("ShilpaBen", 50, "12-05-1978");
        Person p4 = new Person("Jenil", 23, "08-12-2002");
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        System.out.println(persons);
        System.out.println(persons.get(1));
        persons.remove(2);
        // Something will break here - DEBUG IT
//        persons.set(3, p4);
        System.out.println(persons);

//        ----------------- Linkedlist -------------------

        LinkedList<Person> p = new LinkedList<Person>();
        p.add(p1);
        p.add(p2);
        p.add(p3);
        System.out.println(p);
    }
}