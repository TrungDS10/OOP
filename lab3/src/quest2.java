// import java.util.Scanner;
// class MyPoint{
//     private int x;
//     private int y;
//     public MyPoint(){

//     }
//     public MyPoint(int x, int y){
//         this.x = x;
//         this.y = y;
//     }
//     public void setX(int x){
//         this.x = x;
//     }
//     public int getX(){
//         return x;
//     }
//     public void setY(int y){
//         this.y = y;
//     }
//     public int getY(){
//         return y;
//     }
// }
// class MyTriangle{
//     public MyPoint v1;
//     public MyPoint v2;
//     public MyPoint v3;
//     public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3){
//         v1 = new MyPoint(x1, y1);
//         v2 = new MyPoint(x2, y2);
//         v3 = new MyPoint(x3, y3);
//     }
//     public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3){
//         this.v1 = v1;
//         this.v2 = v2;
//         this.v3 = v3;
//     }
//     public String toString(){
//         return String.format("MyTriangle[v1=(%f,%f),v2=(%f,%f),v3=(%f,%f)]", v1.getX(), v1.getY(), v2.getX(), v2.getY(), v3.getX(), v3.getY());
//     }
//     public double getDistance(MyPoint v1, MyPoint v2) {
//         return Math.sqrt(Math.pow(v1.getX() - v2.getX(), 2)+ Math.pow(v1.getY() - v2.getY(), 2));
//     }
//     public double getPerimeter(){
//         return getDistance(v1, v2) + getDistance(v1, v3) + getDistance(v2, v3);
//     }
//     public String getType() {
//         if (getDistance(v1, v2) == getDistance(v1, v3)&& getDistance(v1, v3) == getDistance(v2, v3)) {
//             return "Equilateral"; 
//         }
//         else if (getDistance(v1, v2) != getDistance(v1, v3)&& getDistance(v1, v3) != getDistance(v2, v3)&& getDistance(v1, v2) != getDistance(v2, v3)) {
//             return "Scalene"; 
//         }
//         else{
//             return "Isosceles"; 
//         }
//     }
// } 
// public class quest2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Point 1");
//         System.out.println("Enter x1, y1");
//         int x1 = sc.nextInt();
//         int y1 = sc.nextInt();
//         System.out.println("Point 2");
//         System.out.println("Enter x2, y2");
//         int x2 = sc.nextInt();
//         int y2 = sc.nextInt();
//         System.out.println("Point 3");
//         System.out.println("Enter x3. y3");
//         int x3 = sc.nextInt();
//         int y3 = sc.nextInt();
//         MyPoint v1 = new MyPoint(x1, y1);
//         MyPoint v2 = new MyPoint(x2, y2);
//         MyPoint v3 = new MyPoint(x3, y3);
//         MyTriangle mt = new MyTriangle(v1, v2, v3);
//         System.out.println(mt.getPerimeter());
//         System.out.println(mt.getType());
//         sc.close();
//     }
// }
