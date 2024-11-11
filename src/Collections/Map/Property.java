package Collections.Map;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Property {
    public static void main(String[] args) throws IOException {
        Properties p = new Properties();
        FileInputStream fis  = new FileInputStream("D:\\Java_Programs\\Basic\\src\\Collections\\Map\\abc.txt");
        p.load(fis);
        System.out.println(p);
        String s = p.getProperty("name");
        System.out.println(s);
        p.setProperty("Roshan", "8500");
        FileOutputStream fos = new FileOutputStream("D:\\Java_Programs\\Basic\\src\\Collections\\Map\\abc.txt");
        p.store(fos,"Updated by Roshan");
    }
}
