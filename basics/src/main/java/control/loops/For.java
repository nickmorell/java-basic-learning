package control.loops;

public class For {

    public static void main(String[] args){

        /*
            The for loop is an expression that allows
            you to loop over a certain piece of code until the middle
            expression passed in is true. The first part allows you to
            initialize a value, the middle section allows you to evaluate a boolean
            expression and the third section is the incrementer portion.
            The middle portion is the only thing required.
            The format is:
            for( initializer ; boolean expression ; incrementer) {
                // Code goes here
            }
         */
        for(int i=0; i < 10; i++){
            System.out.println("i is equal to: " + i);
        }

        System.out.println("\n");
        int count = 0;
        for(; count < 10; ){
            System.out.println("Count is equal to: " + count);
            count++;
        }


    }


}
