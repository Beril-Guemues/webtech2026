package htw.webtech.foodtracker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Arrays;

@RestController
@RequestMapping("/products")

public class ProductController {

    @GetMapping
    public List<Product> getAllProducts() {
        return Arrays.asList(
                new Product(1, "Vollmilchschokolade", 550, 7.5, 55.0),
                new Product(2, "Hähnchenbrust", 165, 31.0, 0.0),
                new Product(3, "Apfel", 52, 0.3, 14.0),
                new Product(4, "Basmati Reis", 130, 2.7, 28.0),
                new Product(5, "Wasser", 0, 0.0, 0.0),
                new Product(6, "Spiegelei", 196, 13.0, 1.4),
                new Product(7, "Rindersteak", 250, 26.0, 0.0),
                new Product(8, "Nudeln", 350, 12.0, 71.0)
        );
    }
}