package Encapsulation;


class AA{
    private String name;
    private int age;
    private String District;
    private int Wt;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDistrict() {
        return District;
    }

    public int getWt() {
        return Wt;
    }

    public AA(String name, int age, String district, int wt) {
        this.name = name;
        this.age = age;
        this.District = district;
        this.Wt = wt;
    }
}
public class UsingConst {
    public static void main(String[] args) {
        AA aa= new AA("Roshan",25,"Latur",57);
        System.out.println(aa.getName());
    }
}
