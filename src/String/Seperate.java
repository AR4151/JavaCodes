package String;

public class Seperate {

    public static void toUpperLowerCase(String s){

        StringBuilder UpperCase = new StringBuilder();
        StringBuilder LowerCase = new StringBuilder();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==s.toUpperCase().charAt(i)){
                UpperCase.append(s.toUpperCase().charAt(i));
            }
            else{
                LowerCase.append(s.charAt(i));
            }

        }
        String UpperCase1 = UpperCase.toString();
        String LowerCase1 = LowerCase.toString();
        System.out.println("UpperCase: "+UpperCase1);
        System.out.println("LowerCase: "+LowerCase1);
    }
    public static void main(String[] args) {
        toUpperLowerCase("ABCdEfgH");

    }
}
