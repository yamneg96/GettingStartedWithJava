import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListMethodExamples {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();

        // add(element): Adds an element to the end of the list
        myList.add("Apple");
        myList.add("Banana");
        System.out.println("After add(element): " + myList); // Output: [Apple, Banana]

        // add(index, element): Inserts an element at a specific position
        myList.add(0, "Cherry");
        System.out.println("After add(index, element): " + myList); // Output: [Cherry, Apple, Banana]

        // addAll(collection): Adds all elements from another collection
        List<String> anotherList = Arrays.asList("Date", "Fig");
        myList.addAll(anotherList);
        System.out.println("After addAll(collection): " + myList); // Output: [Cherry, Apple, Banana, Date, Fig]

        // addAll(index, collection): Inserts all elements at a specific position
        List<String> moreFruits = Arrays.asList("Grape", "Kiwi");
        myList.addAll(2, moreFruits);
        System.out.println("After addAll(index, collection): " + myList); // Output: [Cherry, Apple, Grape, Kiwi, Banana, Date, Fig]

        // get(index): Retrieves the element at a specific position
        String fruit = myList.get(1);
        System.out.println("Element at index 1: " + fruit); // Output: Apple

        // set(index, element): Replaces the element at a specific position
        myList.set(1, "Mango");
        System.out.println("After set(index, element): " + myList); // Output: [Cherry, Mango, Grape, Kiwi, Banana, Date, Fig]

        // remove(index): Removes the element at a specific position
        myList.remove(3);
        System.out.println("After remove(index): " + myList); // Output: [Cherry, Mango, Grape, Banana, Date, Fig]

        // remove(object): Removes the first occurrence of the specified element
        myList.remove("Banana");
        System.out.println("After remove(object): " + myList); // Output: [Cherry, Mango, Grape, Date, Fig]

        // iterator(): Returns an iterator for the list
        System.out.println("Iterating using iterator:");
        Iterator<String> iterator = myList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println(); // Output: Cherry Mango Grape Date Fig

        // listIterator(): Returns a list iterator for the list
        System.out.println("Iterating using listIterator (forward):");
        ListIterator<String> listIterator = myList.listIterator();
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + " ");
        }
        System.out.println(); // Output: Cherry Mango Grape Date Fig

        System.out.println("Iterating using listIterator (backward):");
        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous() + " ");
        }
        System.out.println(); // Output: Fig Date Grape Mango Cherry

        // removeAll(collection): Removes all elements present in another collection
        List<String> toRemove = Arrays.asList("Cherry", "Grape");
        myList.removeAll(toRemove);
        System.out.println("After removeAll(collection): " + myList); // Output: [Mango, Date, Fig]

        // clear(): Removes all elements from the list
        myList.clear();
        System.out.println("After clear(): " + myList); // Output: []

        // size(): Returns the number of elements in the list
        System.out.println("Size of the list: " + myList.size()); // Output: 0

        myList.addAll(Arrays.asList("One", "Two", "Three"));

        // toArray(): Converts the list to an array
        Object[] array = myList.toArray();
        System.out.println("Array elements:");
        for (Object element : array) {
            System.out.print(element + " ");
        }
        System.out.println(); // Output: One Two Three

        // contains(object): Checks if the list contains a specific element
        boolean containsTwo = myList.contains("Two");
        System.out.println("Contains 'Two'? " + containsTwo); // Output: true

        // indexOf(object): Returns the index of the first occurrence of an element
        int indexOfOne = myList.indexOf("One");
        System.out.println("Index of 'One': " + indexOfOne); // Output: 0

        // lastIndexOf(object): Returns the index of the last occurrence of an element
        myList.add("Three"); // Adding another "Three"
        int lastIndexOfThree = myList.lastIndexOf("Three");
        System.out.println("Last index of 'Three': " + lastIndexOfThree); // Output: 4

        // subList(fromIndex, toIndex): Returns a view of a portion of the list
        List<String> subList = myList.subList(1, 4); // Elements at index 1, 2, 3
        System.out.println("Sublist from index 1 to 3: " + subList); // Output: [Two, Three, Three]

        // isEmpty(): Checks if the list is empty
        boolean isEmpty = myList.isEmpty();
        System.out.println("Is the list empty? " + isEmpty); // Output: false

        // retainAll(collection): Retains only the elements present in another collection
        List<String> toRetain = Arrays.asList("Two", "Three");
        myList.retainAll(toRetain);
        System.out.println("After retainAll(collection): " + myList); // Output: [Two, Three, Three]

        ArrayList<Integer> section2 = new ArrayList<>();
        section2.ensureCapacity(1);
    }
}