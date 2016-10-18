import java.util.Scanner;

public class QuadraticFormula
{
    public static void  main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Oh, I see how it is. You want the value of x, given that you have a polynominal in the form ax^2+bx+c that is equal to 0. Sure. For free. Of course.");
        double a,b,c;
        System.out.print( "a: ");
        a = scanner.nextDouble();
        System.out.print( "b: ");
        b = scanner.nextDouble();
        System.out.print( "c: ");
        c = scanner.nextDouble();
        
        double ftop = 0-a;
        double conjugate = Math.sqrt((b*b)-(4*a*c));
        double bot = 2*a;
        
        double anspos = (ftop+conjugate)/bot;
        double ansneg = (ftop-conjugate)/bot;
        System.out.println( "Well, here it is: " +anspos);
        System.out.println( "Oh, you want TWO answers? You're really giving me a workout: "+ansneg);
    }
}
