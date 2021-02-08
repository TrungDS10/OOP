public class Product{

    private static int count = 0;
    private String productName;
    private int amount;
    private String description;

    public Product(String productName, int amount, String description){
        this.amount = amount;
        this.productName = productName;
        this.description = description;
    }

    public void setProductName(String productName){
        this.productName = productName;
    }
    public String getProductName(){
        return productName;
    }

    public void setAmount(int amount){
        this.amount = amount;
    }
    public boolean increaseAmount(int amount){
        if (this.amount >= 0) {
            this.amount += amount;
            return true;
        }
        return false;
    }
    public boolean decreaseAmount(int amount){
        if (this.amount > 1) {
            this.amount -= 1;
            return true;
        }
        return false;
    }
    public int getAmount(){
        return amount;
    }

    public void setDescription(String description){
        this.description = description;
    }
    public String getDescription(){
        return description;
    }

    public static void addCount(int count){
        Product.count++;
    }
    public static int getCount(){
        return count;
    }

    public String toString(){
        return String.format("Name: %s\nAmount: %s\nDescription: $s", productName, amount, description);
    }
}