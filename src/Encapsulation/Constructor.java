package Encapsulation;


class Ex{
    String Name;
    int Age;
    float Height;
    String Weight;

    Ex(String Name,int Age,float Height,String Weight){
        this.Name = Name;
        this.Age = Age;
        this.Height = Height;
        this.Weight = Weight;
    }
    public String getName(){
        return Name;
    }
    public int getAge(){
        return Age;
    }
    public float getHeight(){
        return Height;
    }
    public String getWeight(){
        return Weight;
    }

}

public class Constructor {
    public static void main(String[] args) {

        Ex xx = new Ex("Roshan", 25, 5.7f, "60kg");
        System.out.println(xx.getName());
        System.out.println(xx.getAge());
        System.out.println(xx.getHeight());
        System.out.println(xx.getWeight());
    }
}
