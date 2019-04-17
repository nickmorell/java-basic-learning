/*
    A class usually has a package. A package is a namespace that organizes a set of related classes and interfaces.
    Conceptually you can think of packages as being similar to different folders on your computer.
*/
package overview;

/*
    All java programs will have at least one Class. A class can be used to represent and object
    or functionality. A class contains an access level (public, private, or the default package-private),
    the class keyword (case sensitive) and the name of the class / Object. The class name cannot be the
    same name as the package, note these takes into consideration case. So in this example the package overview
    and the class Overview are seen as different.
 */
public class Overview {


    /*
        These are variables, specifically class variables. They are defined inside the class and are accessible to
        any and all methods. Variables here can be defined with an optional access level and static keyword. However
        they must be defined with the variable type and a variable name while you can also optionally assign its value here.
     */
    public int publicClassVariable;
    private String privateClassVariable;
    boolean packagePrivateClassVariable = false;

    /*
        This is called a constructor. It has an access level and uses the same name the class it is in.
        If a constructor with no parameters is not explicitly created the compiler will insert a default one that
        does nothing. A constructor is called when you initialize a new object of the type of class it is in.
     */
    public Overview(){
        publicClassVariable = 4;
    }

    /*
        A constructor and all methods can have methods with the same name and access level but must have differing
        parameters. In this instance you can create an Overview object while passing in a String object and you will
        hit this constructor instead of using the default one like the one above or the one created by the compiler.
     */
    public Overview(String x){
        privateClassVariable = x;
    }


    /*
        A class does not always need to have a main method as it can be a blue print for an object, we will tackle this later,
        however if you want a complete running application you will need a class with a main method. A method has an access level,
        potentially the static variable but it can be left out, we will go over that later but it is necessary for a main method,
        the return type (void is the return type of nothing), the name of the method and then in parenthesis a comma separated list
        of parameters.

        The args parameter in a main method allows variables from the command line to be processed. For instance a ls or dir
        command in your terminal does not have to take parameters but if you want to check a specific folders files then you pass
        in an argument which are space separated.
     */
    public static void main(String[] args){


        /*
            This is a print line statement. This will print the string inside its parenthesis to the console
            and after that will insert a new line character or break statement. There is however a print statement,
            you simply just remove the ln, this will print the string but not insert the new line.
         */
        System.out.print("Hello ");
        System.out.println("World");

    }

}
