package Polymophism;


class Parent{
    void Test(){
        System.out.println("Parent");
    }
}
class Child extends Parent {
    //@Override
    final void Test(int a) {
        System.out.println("Child");;
    }

    public static void main(String[] args) {
        Child pp = new Child();
        Parent v = new Parent();
        //Child p = new Parent();  // Why It's Invalid: The type Child is more specific than Parent.
        // Since Parent could be just the base class and doesn't have to include the additional members or overridden methods in Child,
        // Java prevents you from assigning a Parent reference to a Child variable without casting.
        Parent vv = new Child();
        Sub ss = new Sub();

        pp.Test(); // ==> Child
        v.Test(); // ==> Parent
        vv.Test(); // ==> Child
        ss.Test(); // ==> Parent-Child

    }
}
class Sub extends Parent{
    @Override
    void Test(){
        System.out.println("Parent-->SubChild");
    }

}
class SubClass extends Child{
    /* If the method is final then only that method we cannot Override in another Subclass.
    @Override
    void Test(){
        System.out.println("Parent-->SubChild");
    }
    */


}
