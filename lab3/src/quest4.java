// class Point2D{
//     protected float x = 0.0f;
//     protected float y = 0.0f;
//     public Point2D(){

//     }
//     public Point2D(float x, float y){
//         this.x = x;
//         this.y = y;
//     }
//     public void setX(float x){
//         this.x = x;
//     }
//     public float getX(){
//         return x;
//     }
//     public void setY(float y){
//         this.y = y;
//     }
//     public float getY(){
//         return y;
//     }
//     public void setXY(float x, float y){
//         this.x = x;
//         this.y = y;
//     }
//     public float[] getXY(){
//         return new float[]{x,y};
//     }
//     public String toString(){
//         return String.format("(%f,%f)",x,y);
//     }
// }
// class Point3D extends Point2D{
//     private float z = 0.0f;
//     public Point3D(float x, float y, float z){
//         super(x, y);
//         this.z = z;
//     }
//     public Point3D(){

//     }
//     public void setZ(float z){
//         this.z = z;
//     }
//     public float getZ(){
//         return z;
//     }
//     public void setXYZ(float x, float y, float z){
//         this.setX(x);
//         this.setY(y);
//         this.z = z;
//     }
//     public float[] getXYZ(){
//         return new float[]{this.getX(), this.getY(), z};
//     }
//     @Override
//     public String toString(){
//         return String.format("(%.2f,%.2f,%.2f)", this.getX(), this.getY(), z);
//     }
// }
// public class quest4 {
//     public static void main(String[] args) {
//         Point3D point3d = new Point3D(3,4,5);
//         System.out.println("Input x,y,z");
//         System.out.println(String.format("X: %s \nY: %s \nZ: %s \nPoint in 3D shape: %s", 
//         point3d.getX(), point3d.getY(), point3d.getZ(), point3d.toString()));    
//     }
// }
