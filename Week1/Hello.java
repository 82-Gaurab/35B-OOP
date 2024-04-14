package Week1;

public class Hello{
    public static void main(String[] args) {
        /* 1. Write a program that prints Hello World! to the console. Save the program as Hello.java. */
        System.out.println("Hello World!");

        /* 2. Extend/Modify the above program to print two additional lines:
                This is my first program
                I am on module ST4003CEM
                System.out.print (not println) and produces the same output. */

        System.out.print("This is my first program\n");
        System.out.print("I am on module ST4003CEM");

        /* 3. Write a program that prints the following output:
            A "quoted" String is
            'much' better if you learn
            the rules of "escape sequences."
            Also, "" represents an empty
            String. Don't forget: use \"
            instead of " !
            '' is not the same as " */

        System.out.println("A \"quoted\" string is");
        System.out.println("\'much\' better if you learn");
        System.out.println("the rules of \"escape sequence\"");
        System.out.println("Also, \"\" represents an empty string.");
        System.out.println("Don't forget:  use \" \ninstead of \"! \n'' is not the same as \"");

        /* 4. WAP that prints the following pattern:
                *
                **
                ***
                **** */
        System.out.print("*\n**\n***\n****");
    }
}