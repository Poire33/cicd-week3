package ie.atu.productapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {
    private List<Product> productList = new ArrayList<>();
    public ProductController() {
        productList.add(new Product("100", "TV", "Electric", 399));
        productList.add(new Product("101", "Radio", "Electric", 99));
    }

    @GetMapping("/getProducts")
    public List getProduct()
    {
        return productList;
    }
}
