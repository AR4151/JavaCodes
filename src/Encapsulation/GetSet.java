package Encapsulation;

class GetSet1 {
    private String name="R";
    private int age = 20;

    public void setAge(int age){
        this.age=age;

    }
    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
}
public class GetSet {
    public static void main(String[] args) {
        GetSet1 gg = new GetSet1();
        gg.setAge(25);
        gg.setName("Roshan");
        System.out.println(gg.getName());
        System.out.println(gg.getAge());

        GetSet1 ggg = new GetSet1();
        ggg.setAge(20);
        ggg.setName("Rohan");
        System.out.println(ggg.getName());
        System.out.println(ggg.getAge());
    }
}
