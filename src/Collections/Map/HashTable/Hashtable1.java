package Collections.Map.HashTable;


import java.util.Hashtable;

class Temp{
    int i;
    Temp(int i){
        this.i=i;
    }
    public int hashCode(){
        return i;
        //return i%9;
    }
    public String toString(){
        return i+"";
    }


}
public class Hashtable1 {
    public static void main(String[] args) {
        Hashtable h = new Hashtable(); //--> declare initial capacity as 25 then also Output will change
        h.put(new Temp(5),"A");
        h.put(new Temp(2),"B");
        h.put(new Temp(6),"C");
        h.put(new Temp(15),"D");
        h.put(new Temp(23),"E");
        h.put(new Temp(16),"F");
        System.out.println(h);
    }
}
