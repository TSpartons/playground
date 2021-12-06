package junit_kick_start;

public class Trees

{
    // Main driver method
    public static void main(String[] args)
    {
        // Creating a Set interface with reference to
        // TreeSet
        java.util.Set<String> ts1 = new java.util.TreeSet<>();

        // Elements are added using add() method
        ts1.add("Here");
        ts1.add("Is");
        ts1.add("A");
        ts1.add("Sentence");


        // Elements get stored in default natural
        // Sorting Order(Ascending)
        System.out.println(ts1);
    }
}
