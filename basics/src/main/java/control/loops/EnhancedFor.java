package control.loops;

public class EnhancedFor {


    public static void main(String[] args){

        int[] intArray = {1,2,3,4,5,6,7,8,9};


        /*
            This type of for loop is an enhanced version. This
            for loops allows you to iterate over every object in a
            collection.
            The format is:
            for( datatype initialization : collection ) {
                // Code goes here
            }
        */

        for(int x : intArray) {
            System.out.println("X is equal to: " + x);
        }

        System.out.println("Out of enhanced for loop.");
    }

}
