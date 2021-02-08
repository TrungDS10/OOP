// import java.util.*;
// class Order{
//     private int orderID;
//     private String item;
//     private String itemName;
//     private double itemPrice;
//     private int itemID;
//     public Order(){

//     }
//     public Order(int orderID, String itemName, double itemPrice, int itemID, String item){
//         this.orderID = orderID;
//         this.item = item;
//         this.itemID = itemID;
//         this.itemPrice = itemPrice;
//         this.itemName = itemName;
//     }
//     public void setOrderID(int orderID){
//         this.orderID = orderID;
//     }
//     public int getOrderID(){
//         return orderID;
//     }
//     public void setItemName(String itemName){
//         this.itemName = itemName;
//     }
//     public String getItemName(){
//         return itemName;
//     }
//     public void setItemPrice(double itemPrice){
//         this.itemPrice = itemPrice;
//     }
//     public double getItemPrice(){
//         return itemPrice;
//     }
//     public void setItemID(int itemID){
//         this.itemID = itemID;
//     }
//     public int getItemID(){
//         return itemID;
//     }
//     public void setItem(String item){
//         this.item = item;
//     }
//     public String getItem(){
//         return item;
//     }
//     public void calculateAverageCost(){
//         System.out.println("How many item you want to enter?");
//         Scanner scanner = new Scanner(System.in);
//         int n = scanner.nextInt();
//         double[] arr = new double[n];
//         double total = 0;
//         for(int i=0; i<arr.length; i++){
//         	System.out.print("Enter item price No."+(i+1)+": ");
//         	arr[i] = scanner.nextDouble();
//         }
//         scanner.close();
//         for(int i=0; i<arr.length; i++){
//         	total = total + arr[i];
//         }
//         double average = total / arr.length;
//         System.out.format("The average is: %.3f", average);
//     }
// }
// public class Commerce {
//     static Scanner sc = new Scanner(System.in);
//     static void input(Order tt){
//         System.out.println("Input list of item");
//         tt.setItem(sc.next());
//         ;
//         sc.nextLine();
//         System.out.println("Input item ID");
//         tt.setItemID(sc.nextInt());
//         System.out.println("Input item name");
//         tt.setItemName(sc.next());
//     }
//     public static void main(String[] args) {
//         Order ord[] = null;
//         int n = 0;
//         System.out.println("Enter number of order: ");
//         n = sc.nextInt();
//         ord = new Order[n];
//         for (int i = 0; i < n; i++) {
//             System.out.println("Order "+(i+1)+": ");
//             ord[i] = new Order();
//             input(ord[i]);
//         }
//         Order or = new Order();
//         or.calculateAverageCost();
//     }
// }
