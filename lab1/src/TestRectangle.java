// import java.util.Scanner;
// class Rectangle{
//     private double width;
//     private double height;
//     public Rectangle(){

//     }
//     public Rectangle(double width, double height){
//         this.height = height;
//         this.width = width;

//     }
//     public void setWidth(double width){
//         if (width < 0) {
//             System.out.println("Error, plz type again");
//             width = 1;
//         }
//         this.width = width;
//     }
//     public double getWidth(){
//         return width;
//     }
//     public void setHeight(double height){
//         if (height < 0) {
//             System.out.println("Error, plz type again");
//             height = 1;
//         }
//         this.height = height;
//     }
//     public double getHeight(){
//         return height;
//     }
//     public void display(){  
//         int i, j; 
//         for (i = 1; i <= height; i++) { 
//             for (j = 1; j <= width; j++) { 
//                 if (i == 1 || i == height ||  j == 1 || j == width)             
//                     System.out.print("*");             
//                 else
//                     System.out.print(" ");             
//             } 
//             System.out.println(); 
//         } 	
//     }
// }
// public class TestRectangle {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         Rectangle rec1 = new Rectangle();
//         System.out.println("Enter height of rectange 1: ");
//         rec1.setHeight(sc.nextDouble());
//         System.out.println("Enter width of rectangle 1: ");
//         rec1.setWidth(sc.nextDouble());
//         Rectangle rec2 = new Rectangle();
//         System.out.println("Enter height of rectange 2: ");
//         rec2.setHeight(sc.nextDouble());
//         System.out.println("Enter width of rectangle 2: ");
//         rec2.setWidth(sc.nextDouble());
//         Rectangle rec3 = new Rectangle();
//         System.out.println("Enter height of rectange 3: ");
//         rec3.setHeight(sc.nextDouble());
//         System.out.println("Enter width of rectangle 3: ");
//         rec3.setWidth(sc.nextDouble());
//         Rectangle rec4 = new Rectangle();
//         System.out.println("Enter height of rectange 4: ");
//         rec4.setHeight(sc.nextDouble());
//         System.out.println("Enter width of rectangle 4: ");
//         rec4.setWidth(sc.nextDouble());
//         Rectangle rec5 = new Rectangle();
//         System.out.println("Enter height of rectange 5: ");
//         rec5.setHeight(sc.nextDouble());
//         System.out.println("Enter width of rectangle 5: ");
//         rec5.setWidth(sc.nextDouble());
//         sc.close();
//         System.out.println("Rectangle 1: ");
//         rec1.display();
//         System.out.println("Rectangle 2: ");
//         rec2.display();
//         System.out.println("Rectangle 3: ");
//         rec3.display();
//         System.out.println("Rectangle 4: ");
//         rec4.display();
//         System.out.println("Rectangle 5: ");
//         rec5.display(); 
//     }
// }
