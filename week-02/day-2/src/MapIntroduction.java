import java.util.HashMap;

public class MapIntroduction {
    public static void main(String[] args) {
        HashMap<Integer, Character> firstMap = new HashMap<Integer, Character>();

        System.out.println("This map is empty: " + firstMap.isEmpty());

        firstMap.put(97, 'a');
        firstMap.put(98, 'b');
        firstMap.put(99, 'c');
        firstMap.put(65, 'A');
        firstMap.put(66, 'B');
        firstMap.put(67, 'C');

        System.out.println(firstMap.keySet());

        System.out.println(firstMap.values());

        firstMap.put(68, 'D');

        System.out.println(firstMap.size());

        System.out.println(firstMap.get(99));

        firstMap.remove(97);

        System.out.println("firstMap contains 100: " + firstMap.containsKey(100));

        firstMap.clear();



    }
}

   /* We are going to play with maps. Feel free to use the built-in methods where possible.

        Create an empty map where the keys are integers and the values are characters

        Print out whether the map is empty or not

        Add the following key-value pairs to the map

        Key	Value
        97	a
        98	b
        99	c
        65	A
        66	B
        67	C
        Print all the keys

        Print all the values

        Add value D with the key 68

        Print how many key-value pairs are in the map

        Print the value that is associated with key 99

        Remove the key-value pair where with key 97

        Print whether there is an associated value with key 100 or not

        Remove all the key-value pairs*/