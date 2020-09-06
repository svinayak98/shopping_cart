package controller;
import java.util.List;
import java.util.Optional;
import model.Shopping_cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.ShoppingService;

@RestController

public class ShoppingController {
    @Autowired
    ShoppingService shoppingService;


    @GetMapping(value = "/products")
    public List<Shopping_cart> getAllProducts() {
        return shoppingService.getAllProducts();
    }

    @GetMapping("/products/code")
    public Shopping_cart retrieveProduct(@PathVariable String code) {
        return shoppingService.getProductByCode(code);
    }

    @DeleteMapping("/products/code")
    public void deleteProduct(@PathVariable String code) {
        shoppingService.delete(code);
    }

    @PostMapping("/products")
    public String createProduct(@RequestBody Shopping_cart shopping, String code) {
        shoppingService.saveOrUpdate(shopping);
        return shopping.getCode();

    }

    @PutMapping("/products/code")
    public Shopping_cart updateProduct(@RequestBody Shopping_cart shopping) {
        shoppingService.saveOrUpdate(shopping);
        return shopping;
    }
}
