package Encapsulation;

class Practice {
    private String Name;
    private int age;
    private String Weight;

    // Setters
    public void SetName(String Name){
        this.Name = Name;
    }
    public void SetAge(int Age){
        this.age = Age;
    }
    public void SetWeight(String Weight){
        this.Weight = Weight;
    }

    // Getters
    public String GetName(){
        return Name;
    }
    public int GetAge(){
        return age;
    }
    public String GetWeight(){
        return Weight;
    }

}

public class EncPractice{
    public static void main(String[] args) {
        Practice get = new Practice();
        //Using Setters
        get.SetName("Roshan");
        get.SetAge(25);
        get.SetWeight("59Kgs");
        //Using Getters
        System.out.println(get.GetName());
        System.out.println(get.GetAge());
        System.out.println(get.GetWeight());




    }
}

