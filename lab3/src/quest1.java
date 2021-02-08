// // import java.awt.Graphics;
// import java.util.*;
// import java.util.List;
// abstract class MyShape extends java.lang.Object{
//     abstract void Draw();
// }
// abstract class MyBoundedShape extends MyShape{
//     abstract float GetArea();
// }
// class MyLine extends MyShape{
//     private float length;
//     public MyLine(float length) {
//         this.length = length;
//     }
//     @Override
//     public void Draw(){
//         for (int i = 0; i < length; i++) {
//             System.out.print("-");
//         }
//         System.out.println();
//     }
// }

// class MyOval extends MyBoundedShape {
//     private float R;
//     private float r;
//     public MyOval(float R, float r){
//         this.R = R;
//         this.r = r;
//     }
//     @Override
//     public float GetArea(){
//         return R*r*(float)Math.PI;
//     }
//     @Override
//     public void Draw(){
//         // int x = 0;
//         // int y = 0;
//         // Graphics g = g.drawOval(x, y, r, R);
//     }
// }
// class MyRectangle extends MyBoundedShape{
//     private float width;
//     private float height;
//     public MyRectangle(float width, float height){
//         this.height = height;
//         this.width = width;
//     }
//     @Override
//     public float GetArea() {
//         return width*height;
//     }
//     @Override
//     public void Draw(){
//         for (int i = 0; i < width; i++) {
//             System.out.print(" -");
//         }
//         System.out.println();
//         for (int i = 0; i < height; i++) {
//             for (int j = 0; j <= width; j++) {
//                 if (j == 0 || j == width) {
//                     System.out.print("| ");
//                     continue;
//                 }
//                 System.out.print("  ");
//             }
//             System.out.println();
//         }
//         for (int i = 0; i < width; i++) {
//             System.out.print(" -");
//         }
//         System.out.println();
//     }
// }
// public class quest1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         List<MyShape> lShapes = new ArrayList<>();
//         for (int i = 1; i <= 5; i++) {
//             System.out.print(String.format("Please choose shape[%d]: [line, oval, rectangle] -> ", i));
//             try{
//                 String choose = sc.nextLine();
//                 if (choose.equalsIgnoreCase("line")) {
//                     System.out.println("Enter length: ");
//                     lShapes.add(new MyLine(sc.nextFloat()));
//                     sc.nextLine();
//                 }
//                 else if(choose.equalsIgnoreCase("oval")){
//                     System.out.println("Enter R and r take turn: ");
//                     lShapes.add(new MyOval(sc.nextFloat(), sc.nextFloat()));
//                     sc.nextLine();
//                 }
//                 else if(choose.equalsIgnoreCase("rectangle")){
//                     System.out.println("Enter width and length: ");
//                     lShapes.add(new MyRectangle(sc.nextFloat(), sc.nextFloat()));
//                     sc.nextLine();
//                 }
//                 else{
//                     throw new Exception();
//                 }
//             }
//             catch(Exception e){
//                 System.out.println("Invalid");
//                 i--;
//             }
//         }
//         for(MyShape s: lShapes){
//             s.Draw();
//             if (s instanceof MyBoundedShape) {
//                 System.out.println(String.format("Area of %s is: %.2f", s.getClass().getSimpleName(), ((MyBoundedShape) s).GetArea()));
//             }
//         }
//         sc.close();
//     }
// }
