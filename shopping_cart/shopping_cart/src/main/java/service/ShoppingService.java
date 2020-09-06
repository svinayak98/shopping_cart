package service;
import java.util.ArrayList;
import java.util.List;
import model.Shopping_cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ShoppingRepository;

@Service
public class ShoppingService {
    @Autowired
    ShoppingRepository shopping;
    public List<Shopping_cart> getAllProducts()
    {
        List<Shopping_cart> shopping = new ArrayList<>();
        shopping.addAll(shopping.findAll());
        return shopping;
    }
    public Shopping_cart getProductByCode(String code)
    {
        return shopping.findByCode(code).get();
    }
    public void saveOrUpdate(final Shopping_cart shopping)
    {
        shopping.set(shopping);
    }
    public void delete(String code)
    {
        shopping.deleteByCode(code);
    }
    public void update(Shopping_cart shopping, String code)
    {
        shopping.save(shopping);
    }

}
