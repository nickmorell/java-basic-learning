package primitives;

public class Strings {


    /*
        Size (bits): 16
        A char variable is a single character.
        When initialized they must only be wrapped with single quotes (')
     */
    char c = 'd';

    /*
        A String is not actually a primitive but due to the special attention
        it receives from the SDK it can be considered a sudo-primitive.
        A String is simply a bunch of characters side by side.
        When initialized the string needs to be wrapped in
        double quotes (").

        Strings are immutable meaning that the value cannot be changed. However you can
        update the value, so every time you change a value you are actually creating a
        brand new string and assigning it to the variable.
     */
    static String str = "Hello World";
    static String strAlt = String.valueOf("Hello World");

    /*
        Strings can be compared like all objects using == however
        it is not the best way to compare strings.  The == comparison
        will check the reference of the objects in memory, if they are the same
        then they will be equal. But when you want to compare the value
        of the Strings then you want to use the .equals() method. See below.
     */

    public static void main(String[] args){
        System.out.println(str == strAlt);

        String testComparison = new String("Hello World");
        System.out.println(str == testComparison);

        System.out.println(str.equals(testComparison));

        /*
            You can also combine strings by using concatenation.
         */
        String str1 = "Hello World!";
        String str2 = "How are you";
        String str3 = str1 + " " + str2;
        System.out.println(str3);


    }
}
