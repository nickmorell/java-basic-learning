package control.loops;

public class DoWhile {

    public static void main(String[] args){
        boolean isTrue = false;


        /*
            The do while is a variant of hte while loop where the loop will
            always run at least one time. The condition is checked at the end of
            the loop rather then the beginning.
            The format is:
            do {
                 // Code here
            } while(boolean expression)
         */

        do{
            System.out.println("Inside the do while.");
        }while(isTrue);

    }

}
