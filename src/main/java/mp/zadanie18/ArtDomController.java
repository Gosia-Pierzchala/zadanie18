package mp.zadanie18;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ArtDomController {
    private ProductRepositorium productRepositorium;

    public ArtDomController(ProductRepositorium productRepositorium) {
        this.productRepositorium = productRepositorium;
    }

    @GetMapping("/lista/kategoria=domowe")
    @ResponseBody
    public String artDomowe(){
        List<Product> lista = productRepositorium.getProducts();
        String result = "";
        double sum = 0;
        for (Product product: lista) {
            String kategoria = product.getKategoria();
            if(kategoria.equals("artykuły gosp. domowego")){
            result = result + product.toString() + "<br>";
            double cena = product.getCena();
            sum = sum + cena;
        }
    }
    return result + "<br>" + "Suma cen wyżej pokazanych produktów to: " + sum;
    }
}
