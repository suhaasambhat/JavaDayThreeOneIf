package dayThreePartOne;

public class GreatNumber {
    public static void main(String[] args){
        int a=44,b=13,c=22;
//        int b=11;
//        int c=12;
        if(a>b && a>c){
            System.out.println("A is greatest");
        }

        else if (b>a && b>c) {
            System.out.println("B is greatest");
        }

        else {
            System.out.println("C is greatest");
        }
    }
}
