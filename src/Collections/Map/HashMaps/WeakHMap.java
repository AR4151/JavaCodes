package Collections.Map.HashMaps;

import java.util.WeakHashMap;
/*
1. HashMap behavior:
toString() method: When you print the HashMap, if the key or value has overridden the toString() method, that overridden
 method will be called to represent the object as a string.
finalize() method: In a HashMap, if the key is no longer referenced elsewhere in your code and garbage collection (GC) runs,
 the object might be eligible for GC, but HashMap holds a strong reference to the key. This means that until you remove
 the entry from the HashMap, the object will not be collected, and thus finalize() won't be called unless the entry is explicitly removed.
2. WeakHashMap behavior:
toString() method: When printing a WeakHashMap, the toString() method of the key (or value) will also be called,
just like in HashMap. If the key class has overridden toString(), the overridden method will be used.
finalize() method: In a WeakHashMap, the keys are weakly referenced. When the key object has no other strong references
elsewhere in the program, it becomes eligible for GC.
When GC happens:
    The key object can be collected.
    Before the key object is removed from memory, its finalize() method will be called if it's overridden, and the entry in WeakHashMap will be removed.*/

public class WeakHMap {
    public static void main(String[] args) throws InterruptedException {
        WeakHashMap m = new WeakHashMap();
        //HashMap m = new HashMap();
        Temp t = new Temp();
        m.put(t,"Roshan");
        System.out.println(m);
        System.out.println(t);
        t=null;
        System.gc();
        Thread.sleep(5000);
        System.out.println(m);

    }
}
class Temp{
    public String toString(){
        return "temp";
    }
    public void finalize(){
        System.out.println("Finalize Method");
    }

}

