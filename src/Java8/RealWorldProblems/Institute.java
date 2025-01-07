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
    }
}
