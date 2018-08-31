package mp.zadanie18;

import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ProductController {
    private ProductRepositorium productRepositorium;

    public ProductController(ProductRepositorium productRepositorium) {
        this.productRepositorium = productRepositorium;
    }

    @GetMapping("/lista")
    @ResponseBody
    public String productsAndPrices(){
        List<Product> lista = productRepositorium.getProducts();
        String result = "";
        double sum = 0;
        for (Product product: lista) {
            result = result + product.toString() + "<br>";
            double cena = product.getCena();
            sum = sum + cena;
        }
        return result + "<br>" + "Suma cen wyżej pokazanych produktów to: " + sum;
    }

}
