import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class methodsOfCollection {
    public static void main(String[] args) {
        // Create a Collection (using ArrayList as an example implementation)
        Collection<String> myCollection = new ArrayList<>();

        // 1. add(): Inserts the specified element to the collection
        myCollection.add("Apple");
        myCollection.add("Banana");
        myCollection.add("Orange");
        System.out.println("After adding elements: " + myCollection);

        // 2. size(): Returns the size of the collection
        int size = myCollection.size();
        System.out.println("Size of the collection: " + size);

        // 3. remove(): Removes the specified element from the collection
        boolean removed = myCollection.remove("Banana");
        System.out.println("Removed 'Banana'? " + removed);
        System.out.println("After removing 'Banana': " + myCollection);

        // 4. iterator(): Returns an iterator to access elements of the collection
        System.out.println("Iterating through the collection:");
        Iterator<String> iterator = myCollection.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
            //System.out.println(iterator.next());
        }

        // Create another collection for addAll and removeAll examples
        Collection<String> anotherCollection = new ArrayList<>();
        anotherCollection.add("Grape");
        anotherCollection.add("Kiwi");
        anotherCollection.add("Apple"); // Common element

        // 5. addAll(): Adds all the elements of a specified collection to the collection
        myCollection.addAll(anotherCollection);
        System.out.println("After adding another collection: " + myCollection);

        // Create a collection of elements to remove
        List<String> toRemove = new ArrayList<>();
        toRemove.add("Grape");
        toRemove.add("Kiwi");

        // 6. removeAll(): Removes all the elements of the specified collection from the collection
        boolean removedAll = myCollection.removeAll(toRemove);
        System.out.println("Removed all elements from toRemove? " + removedAll);
        System.out.println("After removeAll: " + myCollection);

        // 7. clear(): Removes all the elements of the collection
        myCollection.clear();
        System.out.println("After clearing the collection: " + myCollection);
        System.out.println("Is the collection empty? " + myCollection.isEmpty());
    }
}