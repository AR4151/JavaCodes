package Blocks;

/*If we created Static Block to execute it we must have to provide at least one Main method for execution of code.
* 1) If in same class no need to create the object of the class
* 2) If in another clas then we must have to create Object ot that class*/
class Code {
    Code() {
        System.out.println("Code Constructor");
    }
    static{
        System.out.println("Static Block1");
        {
            System.out.println("Inst In Static");
            {
                System.out.println("Inst2");
                {
                    System.out.println("Inst3");
                }

            }
        }
    }
    {
        System.out.println("Instance Block1");

    }


}
class Code1{
    public static void main(String[] args) {
        Code c = new Code();
        Code cc = new Code();
    }

}
