package Pratice;


interface A{
    void show();

}
interface B{
    void cain();
}

abstract class D{
    void dis(){

    }

}
interface E extends A,B{

}

abstract class Interface implements A,B,E {
}

interface R extends A,B{

}