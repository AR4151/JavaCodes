package Java8.RealWorldProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

/*flatMap()-
 map() does only mapping, but flatMap() performs mapping as well as flattening. Flattening means transforming data from
 Stream<Stream<T>> to Stream<T>. This is the main difference between map() and flatMap().

 flatMap() operation takes Stream<Stream<T> as input and produces a result Stream of type R. It’s mapper function produces
 multiple values for each value of input stream and those multiple values are flattened into a result Stream<R>.

   In the context of Java Streams, T and R are type parameters used to represent generic types. Here's what they mean:
    T: This represents the type of elements in the input stream. It is a placeholder for any type, and it is used to
     indicate that the stream can contain elements of any type.
    R: This represents the type of elements in the resulting stream after applying a transformation. It is also a
     placeholder for any type, indicating that the resulting stream can contain elements of any type.
 */

public class Institute {
    String name;
    List<String> locations;

    public Institute(String name, List<String> locations){
        this.name = name;
        this.locations = locations;

    }
    public String getName(){
        return name;
    }
    public List<String> getLocations(){
        return locations;
    }

    public static void main(String[] args) {
        List<Institute> instituteList = new ArrayList<Institute>();

        instituteList.add(new Institute("IIM", Arrays.asList("Bangalore", "Ahmedabad", "Kozhikode", "Lucknow")));
        instituteList.add(new Institute("IIT", Arrays.asList("Delhi", "Mumbai", "Kharagpur")));
        instituteList.add(new Institute("NIFT", Arrays.asList("Hyderabad", "Mumbai", "Patna", "Bangalore")));

        //Q1-> Get names of all institutes
        List<String> nameOfInstitutes = instituteList.stream().map(Institute::getName).collect(Collectors.toList());
        System.out.println("The of name all the Institutions are :"+nameOfInstitutes);

        //Q2-> Get unique locations of all institutes
        List<String> getAllLocations = instituteList.stream().flatMap(institute -> institute.getLocations().stream()).distinct().collect(Collectors.toList());
        System.out.println("The unique locations are: \n"+getAllLocations);

        final Object Present = new Object();
        System.out.println(Present);

    }
}
