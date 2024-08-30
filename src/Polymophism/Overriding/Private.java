package Polymophism.Overriding;

class P{
    private void T(){
        System.out.println("T");
    }
}

public class Private extends P {

    private void T() {
       System.out.println("Parent");
    }

    public static void main(String[] args) {
        P P = new P();
        P p = new Private();
        Private pp = new Private();

        //p.T();
        pp.T();
        //P.T();


    }

}
