package Java8.LamdaFunction;

public class AnonyLamda {
    public void main(String[] args) {



            Runnable lambda = () -> {
                System.out.println(this); // Refers to the enclosing Example class
            };

            Runnable anonClass = new Runnable() {
                @Override
                public void run() {
                    System.out.println(this); // Refers to the anonymous Runnable class
                }
            };

            lambda.run();
            anonClass.run();
        }
    }


