package dayThreePartOne;

public class GradeDecide {
    public static void main(String[] args) {

         int marks=47;

            if (marks < 25) {

                System.out.println("Grade F");
            }

              else if (marks>25 && marks<45) {

                  System.out.println("Grade is E");
            }

                else if (marks>=45 && marks<50) {

                    System.out.println("Grade is D");
            }
                else if (marks>=50 && marks <60){

                    System.out.println(" Grade is C");
            }
                 else if (marks>=60 && marks<80) {

                     System.out.println("Grade is B");
            }

                 else if (marks>80 && marks<=100){

                     System.out.println("Grade is A");
        }
    }
}