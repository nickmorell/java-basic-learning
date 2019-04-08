package control.loops;

public class While {

    public static void main(String[] args){
        int count = 0;

        /*
            The while loop is a tool that loops through a set of code multiple
            time until the boolean expression passed in evaluates to false.
            The format is:
            while(boolean expression){
                //Code goes here.
            }
         */
        while(count < 10){
            System.out.println("Count equals " + count);
            count++;
        }
        System.out.println("Outside of the while loop");
    }

}
