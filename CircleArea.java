import java.util.Scanner;
public class CircleArea
{
    public static void main(String args[]) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("SO, YOU WANT TO LEARN THE AREA OF A CERTAIN CIRLCE? WELL BUCKLE IN, BUDDY, BUCKLE IN.");
        System.out.print( "Think fast and give me the radius: ");
        double radius = scanner.nextDouble();
        double pi = 3.14;
        double area = pi*(radius*radius);
        System.out.print( "BOOM! THE ANSWER IS: " + area);
       
    }
}
