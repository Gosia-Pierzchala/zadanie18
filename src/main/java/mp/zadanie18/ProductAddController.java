package mp.zadanie18;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProductAddController {
    private ProductRepositorium productRepositorium;

    public ProductAddController(ProductRepositorium productRepositorium) {
        this.productRepositorium = productRepositorium;
    }

    @GetMapping("/add")
    public String addUser(@RequestParam (value = "nazwa", required = false)String nazwa,
                          @RequestParam (value = "cena", required = false)double cena,
                          @RequestParam (value = "kategoria", required = false)String kategoria){
        Product product = new Product(nazwa, cena, kategoria);
        productRepositorium.addProduct(product);
        return "redirect:/lista";
    }
}
