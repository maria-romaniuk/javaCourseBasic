package homeworks.homework33.task2;

import java.util.HashMap;
import java.util.Map;

public class ProductCatalog {
    private Map<Integer, Product> catalog;

    public ProductCatalog() {
        this.catalog = new HashMap<>();
    }
    public void addProduct(int productId, Product product){
        if (!catalog.containsKey(productId)){
            catalog.put(productId,product);
            System.out.println(" Product" + catalog.get(productId).getName() + " added to catalog");
        } else{
            System.out.println("Product " + catalog.get(productId).getName() + " is already exist.");
        }
    }

    public void deleteProduct(int productId){
        if (catalog.containsKey(productId)){
            System.out.println("Product " + catalog.get(productId).getName() + " deleted.");
            catalog.remove(productId);
        } else{
            System.out.println("Product " + catalog.get(productId).getName() + " doesn't exist or already removed.");
        }
    }

    public Product findById(int productId){
        Product product = catalog.get(productId);
        if (product == null){
            System.out.println("Product with " + productId + " ID not founded");
        }
        return product;
    }

    public void printCatalog(){
        for (Map.Entry<Integer, Product> entry : catalog.entrySet() ){
           Integer key = entry.getKey();
            System.out.print("ID: "+ key + " | ");
            entry.getValue().print();
        }
    }
}
