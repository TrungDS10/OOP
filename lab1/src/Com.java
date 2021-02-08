// import java.util.*;
// class Item {
//     private final int ID;
//     private final int price;
//     private final String name;
//     private static int numItems = 0;
//     public Item(String name, int price) {
//         this.ID = ++numItems;
//         this.name = name;
//         this.price = price;
//     }
//     public int getID() {
//         return ID;
//     }
//     public int getPrice() {
//         return price;
//     }
//     public String getName() {
//         return name;
//     }
// }
// class Order {
//     private final int ID;
//     private final List<Item> items;
//     private static int numOrders = 0;
//     public Order(List items) {
//         this.ID = ++numOrders;
//         this.items = items;
//     }
//     double calculateAverageCost() {
//         double sum = 0;
//         for (Item item : items) {
//             sum += item.getPrice();
//         }
//         return sum / items.size();
//     }
// }
// public class Com {

//     public static void main(String[] args) {
//         Item A = new Item("Beef", 10000);
//         Item B = new Item("Hotdog", 20000);
//         Item C = new Item("Chicken", 30000);

//         Order ord1 = new Order(Arrays.asList(A, B));
//         Order ord2 = new Order(Arrays.asList(B, C));
//         Order ord3 = new Order(Arrays.asList(C, A));

//         System.out.println(ord1.calculateAverageCost());
//         System.out.println(ord2.calculateAverageCost());
//         System.out.println(ord3.calculateAverageCost());

//     }
// }