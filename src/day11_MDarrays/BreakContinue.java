package day11_MDarrays;

public class BreakContinue {

    public static void main(String[] args) {

        breakStatement();
        System.out.println("************");
        continueStatement();

    }

    private static void continueStatement() {
        int i=0;
        while (i<=30){
            if (i==15){
                i+=5;
                continue;
                //   From the output, we observed that the while loop printed only those
                //   values that come before the condition, i.e. if(i==15). This is because
                //   when a “continue” statement occurs then the value of i is staying equal
                //   to 15 and does not get incremented. Therefore we have to increment the
                //   value of i=“i+5” in the if statement if we want to print all other values.
            }
            System.out.println("numbaer "+i);
            i+=5;
        }

    }

    private static void breakStatement() {
        int i=0;
        while (i<=30){
            System.out.println("number "+i);
            i+=5;
            if (i==15){
                break;
            }
        }

    }


}
//Conclusion
//   When a loop encounters a break statement then it terminates the entire loop however
//   when a loop encounters a continue statement then it
//   terminates/skips the current iteration and moves to the next iteration.