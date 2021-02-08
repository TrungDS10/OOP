import java.util.*;
public class ProductList {
    private ArrayList<Product> listOfProducts = new ArrayList<>();

    public ProductList(){

    }
    public ProductList(ArrayList<Product> listOfProducts){
        this.listOfProducts = listOfProducts;
    }
    public ArrayList<Product> getListProduct(){
        return listOfProducts;
    }

    public void addProdcut(String productName, int amount, String description){
        listOfProducts.add(new Product(productName, amount, description));
    }
    public void addProdcut(Product newProduct){
        listOfProducts.add(newProduct);
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(Product item: listOfProducts){
            sb.append(item.toString());
        }
        return sb.toString();
    }
}
