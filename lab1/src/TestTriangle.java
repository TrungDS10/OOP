// import java.util.Scanner;
// class Triangle{
//     private double edge1;
//     private double edge2;
//     private double edge3;
//     public Triangle(){

//     }
//     public Triangle(double edge1, double edge2, double edge3){
//         this.edge1 = edge1;
//         this.edge2 = edge2;
//         this.edge3 = edge3;
//     }
//     public void setEdge1(double edge1){
//         this.edge1 = edge1;
//     }
//     public double getEdge1(){
//         return edge1;
//     }
//     public void setEdge2(double edge2){
//         this.edge2 = edge2;
//     }
//     public double getEdge2(){
//         return edge2;
//     }
//     public void setEdge3(double edge3){
//         this.edge3 = edge3;
//     }
//     public double getEdge3(){
//         return edge3;
//     }
//     public void display(){
//         if (edge1 + edge2 <= edge3 && edge3 + edge2 <= edge1 && edge1 + edge3 <= edge2) {
//             System.out.println("Not a triangle");
//         }
//             else if (edge1 == edge2 && edge3 == edge2) {
//                 System.out.println("This is Equilateral");
//             }
//             else if ((edge1 == edge2 && edge2 != edge3) || (edge2 == edge3 && edge3 != edge1)|| (edge1 == edge3 && edge3 != edge2)) {
//                 System.out.println("This is Isosceles");
//             }
//             else if(edge1 != edge2 && edge3 != edge2 && edge1 != edge3){
//                 System.out.println("This is Scalene");
//             }
//     }
// }
// public class TestTriangle {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         Triangle tri = new Triangle();
//         System.out.println("Enter three edges of triangle");
//         tri.setEdge1(sc.nextDouble());
//         tri.setEdge2(sc.nextDouble());
//         tri.setEdge3(sc.nextDouble());
//         sc.close();
//         tri.display();
//     }
// }
