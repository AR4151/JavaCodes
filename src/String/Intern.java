package String;

public class Intern {
    public static void main(String[] args) {
        String ss = new String("Java");

        //Call intern() to ensure the String is in the String Pool
        ss.intern();
        //ss= ss.intern(); //If we assign same reference then ss will point towards object from SCP not from Heap
        // and the object from heap goes to GC because it doesn't reference

        String poolString = "Java";

        // Compare the hash codes of the two objects
        System.out.println("Heap object hash code: " + System.identityHashCode(ss));
        System.out.println("String Pool object hash code: " + System.identityHashCode(poolString));

        // Check if they point to the same object
        //System.out.println("ss == poolString: " + (ss.equals(poolString)));  // Should be false, as ss refers to the heap object
        System.out.println("ss == poolString: " + (ss == poolString));
    }
}

