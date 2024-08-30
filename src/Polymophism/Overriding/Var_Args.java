package Polymophism.Overriding;


class Args{
    void Va(int...x) {
        System.out.println("Args_Class");

    }                                          /*
                                               So here, its not Overriding.Var-Args methods can only be Overridden by Var-Args methods not by any other
                                               So here, method resolution take care by the Compiler not by JVM because it's not Overriding if i make int...x to int x, then
                                               it is Overriding and the Method Resolution take care by the JVM and Output will be 1)Args_Class==>Var_Args_Class==>Var_Args_Class.
                                               */

}
public class Var_Args extends Args {

    void Va(int x){
        System.out.println("Var_Args_Class");
    }

    public static void main(String[] args) {
        Args a = new Args();
        Var_Args va = new Var_Args();
        Args aa= new Var_Args();

        a.Va(10);     /* */
        va.Va(15);
        aa.Va(20);

    }
}
