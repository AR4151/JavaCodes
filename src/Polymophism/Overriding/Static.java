package Polymophism.Overriding;

class Stat{
    static void Main(){
        System.out.println("Stat Class");
    }
}

class Static extends Stat{

    static void Main(){      /* We cannot Override Static Method in subclass its not Overriding but its Method Hiding but we can Re-declare that static method.
                              So, whatever Static Belongs to Class not to Instance or Object */
        System.out.println("Static");
    }

    public static void main(String[]args){

        Stat.Main();
        Static.Main();
    }



}