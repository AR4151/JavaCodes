package PracticeSets;

public class CommonElements {
    public static void main(String[] args) {
        int [] num1 = {13,25,24,12,48,22};
//        int [] num2 = {12,45,65,48,47,69};
        //int [] num3 = {12,77,48,66,47,99};
        int [] num4 = {12,25,27,12,48,22};
        boolean a = false;
        for(int i=0;i<num1.length;i++){
            if(num1[i]==num4[i]){
                a = true;
            }
        }
        if (a) {
            System.out.println("Arrays are equal");
        } else{
            System.out.println("Arrays are not equal");
        }
    }
}
