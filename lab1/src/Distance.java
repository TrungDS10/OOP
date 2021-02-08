 import java.util.Scanner;
 class Point{
     double x;
     double y;

     public Point() {

     }

     public Point(double x, double y) {
         this.x = x;
         this.y = y;
     }

     public static double distance(double x1, double x2, double y1, double y2) {
         double distance = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow(y1 - y2, 2));
         return distance;
     }
     public static double midpoint(double x1, double x2, double y1, double y2) {
         double midpointx = (x1+x2)/2;
         double midpointy = (y1+y2)/2;
         System.out.println("" + midpointx + " ; " + midpointy);
         return 0;
     }
 }
 public class Distance {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         Point p1 = new Point();
         System.out.println("Point 1");
         System.out.println("Enter x: ");
         p1.x = sc.nextDouble();
         System.out.println("Enter y: ");
         p1.y = sc.nextDouble();
         Point p2 = new Point();
         System.out.println("Point 2");
         System.out.println("Enter x: ");
         p2.x = sc.nextDouble();
         System.out.println("Enter y: ");
         p2.y = sc.nextDouble();
         sc.close();
         double dis = Point.distance(p1.x, p2.x, p1.y, p2.y);
         System.out.println(dis);
         double mid = Point.midpoint(p1.x, p2.x, p1.y, p2.y);
         System.out.println(mid);
     }
 }
