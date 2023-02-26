package topic3;

public class Operations {

    static void printAritmeticOperations(float a, float b){
        System.out.println("Operatii aritmetice:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("Adunare: a + b = " + (a+b));
        System.out.println("Scadere: a - b = " + (a-b));
        System.out.println("Scadere: b - a = " + (b-a));
        System.out.println("Inmultire: a * b = " + (a*b));
        System.out.println("Impartire: a / b = " + (a/b));
        System.out.println("Impartire: b / a = " + (b/a));
        System.out.println("Restul impartirii: a % b = " + (a%b));
        System.out.println("Restul impartirii: b % a = " + (b%a));

        a++;
        b++;
        System.out.println("Increment: a++ = " + (a));
        System.out.println("Increment: b++ = " + (b));

        a--;
        b--;
        System.out.println("Decrement: a-- = " + (a));
        System.out.println("Decrement: b-- = " + (b));
    }

    static void printLogicOperations(boolean a, boolean b){
        System.out.println("\nOperatori logici:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("a&&b = " + (a&&b));
        System.out.println("a||b = " + (a||b));
        System.out.println("!(a&&b) = " + !(a&&b));
        System.out.println("!(a||b) = " + !(a||b));
    }

    static void printRelationarOperations(float a, float b){
        System.out.println("\nOperatii relationale:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a==b = " + (a==b));
        System.out.println("a!=b = " + (a!=b));
        System.out.println("a>b = " + (a>b));
        System.out.println("a<b = " + (a<b));
        System.out.println("a>=b = " + (a>=b));
        System.out.println("a<=b = " + (a<=b));
    }

    static void useForAndWhile(){
        System.out.println("\nInstructiunea for:");
        for (int x = 10; x < 20; x++){
            System.out.println("value of x: " + x);
        }

        System.out.println("\nInstructiunea while:");
        int x = 20;
        while (x > 10){
            System.out.println("value of x: " + x);
            x--;
        }

    }
}
