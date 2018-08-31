package mp.zadanie18;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepositorium {

    List<Product> products = new ArrayList<>();

    public ProductRepositorium() {
        products.add(new Product("mleko", 3.5, "artykuły spożywcze"));
        products.add(new Product("czekolada", 4, "artykuły spożywcze"));
        products.add(new Product("garnek", 20, "artykuły gosp. domowego"));
        products.add(new Product("miotła", 14.99, "artykuły gosp. domowego"));
        products.add(new Product("klocki lego", 45, "inne"));
        products.add(new Product("puzzle", 35.4, "inne"));
    }

    public List<Product> getProducts(){
        return products;
    }

    public void addProduct(Product product){
        products.add(product);
    }
}
