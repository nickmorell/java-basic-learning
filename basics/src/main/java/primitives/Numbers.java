package primitives;

public class Numbers {


    public static void main(String[] args){

        /*
            Size (bits): 8
            Minimum: -2^7
            Maximum: (2^7) - 1
        */
        byte b = 100;

        /*
            Size (bits): 16
            Minimum: -2^15
            Maximum: (2^15) - 1
        */
        short s = 30_000;

        /*
            Size (bits): 32
            Minimum: -2^31
            Maximum: (2^31) - 1
        */
        int i = 100_000_000;

        /*
            Size (bits): 64
            Minimum: -2^63
            Maximum: (2^63) - 1
        */
        long l = 1_000_000_000; // You can also append l or L to the end of a number to specify that it is a long

        /*
            Size (bits): 32
            Minimum: -2^149
            Maximum: (2-2^-23) * 2^127
        */
        float f = 1.345f; // You can also append f or F to the end of a number to specify that it is a float

        /*
            Size (bits): 64
            Minimum: -2^1074
            Maximum: (2-2^-52) - 2^1023
        */
        double d = 1.345363456; // You can also append d or D to the end of a number to specify that it is a double

        /*
         Due to size constraints on the primitive types, adding different numbers together can
         produce a different variable type result.

         byte + short = int;
         short + int = int;
         int + long = long;
         long + float = double;
         long + double = double;
         */

        byte testByte = 1;
        short testShort = 1;
        int testInt = 1;
        long testLong = 1;
        float testFloat = 1;
        double testDouble = 1;

        int testIntResult = testByte + testShort;
        testIntResult = testShort + testInt;
        long testLongResult = testInt + testLong;

    }

}
