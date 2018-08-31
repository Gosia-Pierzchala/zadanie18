package mp.zadanie18;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ArtSpozController {
    private ProductRepositorium productRepositorium;

    public ArtSpozController(ProductRepositorium productRepositorium) {
        this.productRepositorium = productRepositorium;
    }

    @GetMapping("/lista/kategoria=spozywcze")
    @ResponseBody
    public String artSpozywcze(){
        List<Product> lista = productRepositorium.getProducts();
        String result = "";
        double sum = 0;
        for (Product product: lista) {
            String kategoria = product.getKategoria();
            if(kategoria.equals("artykuły spożywcze")){
                result = result + product.toString() + "<br>";
                double cena = product.getCena();
                sum = sum + cena;
            }
        }
        return result + "<br>" + "Suma cen wyżej pokazanych produktów to: " + sum;
    }
}

