package Pratice;
import java.util.Scanner;

// Inheritance Practice Set -


//Parent Class1-
class SportCar{
    String CompanyName,Price,Colour,CarName;
    void show(){
        System.out.println("This is Best Car in the World");

    }
    void Details(){
        System.out.println("It's Top Speed is 300km/hr");
        System.out.println("The Car can Accelerate 0-97km/hr in just 2.8seconds");
    }

}
class Car extends SportCar{
    public static void main(String[] args){
        Car Veneno = new Car();

        Veneno.CompanyName = "Lamborghini";
        Veneno.Price = "4cr";
        Veneno.Colour = "Red";

        System.out.println("Company Name is "+Veneno.CompanyName);
        System.out.println("Car Price is "+Veneno.Price);
        System.out.println("Car Colour is "+Veneno.Colour);

        Veneno.show();
        Veneno.Details();



    }
}


// Practice Set 2-

//Parent Class2-
class Animal{
    String name,height,age;
    public void Function1() {
        System.out.println("I can eat.");

    }
    public void Function2() {

        System.out.println("I can make you Smile.");
    }
}

//Child Class2-
class Dog extends Animal{
    void display(){
        System.out.println("Name of the Dog is "+name);
        System.out.println("Height of the Dog is "+height);
        System.out.println("Age of the Dog is "+age);
    }

}

class Main{
    public static void main(String[] args){
        Dog Labra = new Dog();
        Labra.name = "Sheru.";
        Labra.height = "2.5ft.";
        Labra.age = "2yrs.";

        Labra.display();
        Labra.Function1();
        Labra.Function2();



    }
}

//Practice Set 3-
//Parent Class 3-
class FlatSystem{
    String type,furnished;

    void fac(){
        System.out.println("24hrs Water and Electricity");
        System.out.println("Mountain facing balcony");
    }
}
class Flat extends FlatSystem{
    public static void main(String[]args){
        Flat features = new Flat();
        features.type = "2.5bhk";
        features.furnished = "Semi-Furnished";

        System.out.println("The Flat is "+features.type);
        System.out.println("The Flat is "+features.furnished);
        features.fac();


    }
}

//Practice Set 4-
//Parent Class 4-

class Mobile{
    String company,Name,OS,Price,Colour,
Processors;
    String Screen = "5.5inch";
    void features(){
        System.out.println("The Camera is 40mega pxl");
        System.out.println("The Battery is 4000mAh");
    }
    void camera(){
        System.out.println("The Images are so clean and clear.");
        System.out.println("You can shoot a short film on this Smartphone");
    }
}
// Child Class 4-
class SmartPhone extends Mobile{
    public static void main(String[]args){
        Mobile mb = new Mobile();
        mb.company = "Apple";
        mb.OS = "Apple iOS";
        mb.Name = "iPhone15";
        mb.Price = "1,00,000";
        mb.Colour = "Matte Black";

        System.out.println(mb.company);
        System.out.println(mb.OS);
        System.out.println(mb.Colour);
        System.out.println(mb.Name);
        System.out.println(mb.Price);

        mb.features();
        mb.camera();

    }

}

// Practice Set 5 -
//Parent Class 5-

class Nifty50{
    String StockName,Weightage;
    int SharePrice;String MarketCap;

    void imp(){
        System.out.println("Nifty50 is the National Index of Which represents the Stock Market Movements.");
        System.out.println("In Nifty50 Index there 50 companies.");

    }
    void Main(){
        System.out.println("Reliance is Important stock of Nifty50.");

    }
}

class Share extends Nifty50{
    public static void main(String[]args){
    Share ss = new Share();
    ss.StockName = "Reliance";
    ss.SharePrice = 3200;
    ss.MarketCap = "9 Lakh Crores";

    ss.imp();
    ss.Main();
    System.out.println(ss.StockName);
    System.out.println(ss.SharePrice);
    System.out.println(ss.MarketCap);
}
}

//Practice Set 6-
//Parent Class 6-
class EvenOdd{
    int a,b;

    static void Even(int a,int b){
        if(a%2==0 && b%2==0){
            System.out.println("Both the numbers are Even.");
        }
        else{
            System.out.println("Can't say Anything");
        }
    }

     static void Odd(int a,int b){
        if(a%2 !=0 && b%2 !=0){
            System.out.println("Both are the Odd Number");
        }
        else{
            System.out.println("Can't say Anything");
        }
    }

}

//Child Class
class Number extends EvenOdd{
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int c = sc.nextInt();
        System.out.println("Enter the Number");
        int d = sc.nextInt();
        Even(c,d);
        Odd(c,d);
        //EvenOdd eo = new EvenOdd();
        //eo.Even( c, d);

    }
}

























