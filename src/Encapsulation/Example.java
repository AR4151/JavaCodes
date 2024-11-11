package Encapsulation;

class Ens{
    private String Name;
    private int age;
    private String City;

    public void setName(String Name){
        this.Name=Name;
    }
    public void setAge(int age){
        this.age=age;
    }

    public void setCity(String City){
        this.City = City;
    }
    public String getName(){
        return Name;
    }
    public int getAge(){
        return age;
    }
    public String getCity(){
        return City;
    }

}

public class Example {
    public static void main(String[] args) {
        Ens ss = new Ens();
        ss.setName("Roshan");
        ss.setAge(24);
        ss.setCity("Udgir");
        System.out.println(ss.getName());
        System.out.println(ss.getAge());
        System.out.println(ss.getCity());
    }



}
