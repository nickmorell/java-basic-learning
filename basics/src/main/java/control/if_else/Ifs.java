package control.if_else;

public class Ifs {

    public static void main(String[] args){

        /*
            If statements are used to direct a particular flow based on a boolean value.
            The if statement will only execute the following statements if the
            boolean value passed in is true. Otherwise it will skip the statements
            and continue on with the program.
            An if or else if statement are always structured as
            if(boolean expression)
            or
            else if(boolean expression)
         */

        /*
            Curly brackets({ }) are not required around the statement following the if
            since it is the only statement. Curly brackets ({ }) are only required
            if there is more than one statement to be executed. However, it is best practice
            to always use curly brackets as it is easier to read.
        */
        if(true)
            System.out.println("The statement was true.");
        if(false)
            System.out.println("The statement was false. Therefor it will not run.");

        int n = 3;
        if(n == 0){
            System.out.println("n is equal to 0");
        }else if(n == 1){
            System.out.println("n is equal to 1");
        }else{
            // Else statements do not require a boolean value because they are only executed if all other if's fail to have a true value.
            System.out.println("n is not equal to 1 or 0.");
        }
    }

}
