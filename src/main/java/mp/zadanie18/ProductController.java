package mp.zadanie18;

import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    public String productsAndPrices(@RequestParam(value = "kategoria", required = false, defaultValue = "wszystkie") String category){
        List<Product> lista = productRepositorium.getProducts();
        String result = "";
        double sum = 0;
        for (Product product: lista) {
            if(category.equals("wszystkie")){
            result = result + product.toString() + "<br>";
            double cena = product.getCena();
            sum = sum + cena;
        } else if(category.equals("spozywcze")){
                String kategoria = product.getKategoria();
                if(kategoria.equals("artykuły spożywcze")){
                    result = result + product.toString() + "<br>";
                    double cena = product.getCena();
                    sum = sum + cena;
                }
            } else if(category.equals("domowe")){
                String kategoria = product.getKategoria();
                if(kategoria.equals("artykuły gosp. domowego")){
                    result = result + product.toString() + "<br>";
                    double cena = product.getCena();
                    sum = sum + cena;
                }
            } else if(category.equals("inne")){
                String kategoria = product.getKategoria();
                if(kategoria.equals("inne")){
                    result = result + product.toString() + "<br>";
                    double cena = product.getCena();
                    sum = sum + cena;
                }
            }
    }
    return result + "<br>" + "Suma cen wyżej pokazanych produktów to: " + sum;
    }
}
