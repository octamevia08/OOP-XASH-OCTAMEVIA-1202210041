import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
  boolean report = false;
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    Calculation c = new Calculation();
    int menu;
    boolean repeat = true;
    double res; 

    do {
      try {
        System.out.println("""
            ==Menu Program==
            1. Square
            2. Circle
            3. Trapezoid
            """);
        System.out.print("Select Menu : ");
        menu = s.nextInt();
        switch (menu) {
          case 1:
            System.out.print("\nEnter the length of the side of the square : ");
            double side = s.nextDouble();
            c.setSide(side);
            c.setSquare();
            res = c.getSquare();
            c.run();
            System.out.println("\nThe calculation result: "+res);
            break;
          case 2:
            System.out.print("\nEnter the length of the radius of the circle : ");
            double radius = s.nextDouble();
            c.setRadius(radius);
            c.setCircle();
            res = c.getCircle();
            c.run();
            System.out.println("\nThe calculation result: "+res);
            break;
          case 3: 
            System.out.print("\nInsert the side of the base of the trapezoid : ");
            double a = s.nextDouble();
            System.out.print("Enter the upper side of the trapezoid : ");
            double b = s.nextDouble();
            System.out.print("Enter the height side of the trapezoid : ");
            double t = s.nextDouble();
            c.setTripezoid(a, b, t);
            res = c.getTripezoid();
            c.run();
            System.out.println("\nThe calculation result: "+res);
            break;
          case 0:
            System.out.println("\nProgram End");
            break;
          default:
            System.out.println("\nOption not Available\n");
            continue;
        } 
        repeat = false;
      } catch (InputMismatchException e) {
        System.out.println("\n====Error: Input Must be number!!!====\n");
        e.getStackTrace();
      } catch (IllegalAccessException e){
        System.out.println(e);
        e.getStackTrace();
      }
      s.nextLine();
    } while (repeat);
    s.close();
  }
}