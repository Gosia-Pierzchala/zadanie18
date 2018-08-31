package mp.zadanie18;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ArtInneController {
    private ProductRepositorium productRepositorium;

    public ArtInneController(ProductRepositorium productRepositorium) {
        this.productRepositorium = productRepositorium;
    }

    @GetMapping("/lista/kategoria=inne")
    @ResponseBody
    public String artInne(){
        List<Product> lista = productRepositorium.getProducts();
        String result = "";
        double sum = 0;
        for (Product product: lista) {
            String kategoria = product.getKategoria();
            if(kategoria.equals("inne")){
                result = result + product.toString() + "<br>";
                double cena = product.getCena();
                sum = sum + cena;
            }
        }
        return result + "<br>" + "Suma cen wyżej pokazanych produktów to: " + sum;
    }

}
