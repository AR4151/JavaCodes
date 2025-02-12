package Java8.RealWorldProblems;

public class Student {
    int id;
    String name;
    double percentage;
    String specialization;

    public Student (){

    }
    public Student(int id,String name,double percentage,String specialization){
        this.id = id;
        this.name = name;
        this.percentage = percentage;
        this.specialization = specialization;
    }

    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPercentage(double percentage){
        this.percentage = percentage;
    }
    public void setSpecialization(String specialization){
        this.specialization = specialization;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPercentage() {
        return percentage;
    }

    public String getSpecialization() {
        return specialization;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", percentage=" + percentage +
                ", specialization='" + specialization + '\'' +
                '}';
    }
}
