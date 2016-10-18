import java.util.Scanner;
    public class AreaProgram
    {
        public static void main(String args[])
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("WHO WANTS SOME PERIMETERS?");
            double width, length, area, perimeter;
            System.out.print( "Gimme that width: ");
            width = scanner.nextDouble();
            System.out.print( "Gimme that length: ");
            length = scanner.nextDouble();
            
            area = length * width;
            perimeter = (length*2)+(width*2);
            
            System.out.println("You want your area? Here it is: " + area);
            System.out.println("You want your perimeter? Fine, take it. I dare you: "+perimeter);
            
            scanner.close();
        }
    }
