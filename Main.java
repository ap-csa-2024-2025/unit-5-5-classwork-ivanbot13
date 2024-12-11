import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    Point2D p1 = new Point2D(); // Create a new Point2D object

    System.out.println("Give me 2 numbers");
    int in_x = sc.nextInt();
    int in_y = sc.nextInt();

    p1.setX(in_x);
    p1.setY(in_y);
    
    System.out.println("You made a point at (" + p1.showX() + ", " + p1.showY() + ")");
  }
}
