package Java8.LamdaFunction;

/*
1. Verbose:
Definition: Something is described as verbose when it uses more words (or more lines of code) than necessary.
In programming: Verbose code means the code is longer or has more boilerplate (extra) information than is needed to achieve a task.
2. Concise:
Definition: Concise means expressing something in fewer words (or fewer lines of code) without losing meaning.
In programming: Concise code accomplishes the same task but in a shorter and more efficient manner, often by eliminating boilerplate code.

Differences of Anonymous class and Lambda Expression:
Verbosity: The anonymous class version is more verbose because you need to declare a new class and override the method
explicitly. The lambda version is more concise.

Readability: Lambda expressions improve code readability by reducing boilerplate code, especially when implementing
 functional interfaces (interfaces with only one abstract method).

Type inference: In the lambda version, you don't need to specify the method or class explicitly—Java can infer that
you're implementing the Runnable interface and the run() method.
* */
/*class MyThread extends Thread{
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Child Thread");
        }
    }

}*/
public class NewThread {
    public static void main(String[] args) {

        Runnable r = () -> {
            for(int i=0;i<10;i++){
                System.out.println("Child Thread");
            }
        };/*new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++){
                    System.out.println("Child Thread");
                }
            }*/

        Thread t = new Thread(r);
        t.start();
        for(int i=0;i<10;i++){
            System.out.println("Main Thread");
        }
    }

}
