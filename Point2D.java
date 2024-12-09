import java.util.Scanner;

// public class Main
// {
//   public static void main(String[] args)
//   {
//     Point2D p1 = new Point2D();
//     Point2D p2 = new Point2D();

//     p1.setX(0);
//     p1.setY(1);
//     p1.showX();
//     p1.showY();
    
//     p2.setX(1);
//     p2.setY(0);
//     p2.showX();
//     p2.showY();
//   }
// }

public class Point2D
{
    private int x;
    private int y;

    public void setX(int xInput){
        x = xInput;
    }

    public void setY(int yInput){
        y = yInput;
    }

    public void showX(){
        System.out.println(x);
    }

    public void showY(){
        System.out.println(y);
    }
}
