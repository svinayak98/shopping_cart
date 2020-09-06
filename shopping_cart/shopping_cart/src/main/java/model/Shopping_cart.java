package model;
import javax.persistence.*;

@Entity
@Table
public class Shopping_cart {
    @Id
    @GeneratedValue
    @Column
    private String product;
    @Column
    private String code;
    @Column
    private int price;
    public Shopping_cart() {
        super();
    }

    public Shopping_cart(String product, String code, int price) {
        super();
        this.product = product;
        this.code = code;
        this.price = price;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getProduct() {
        return product;
    }
    public void setName(String name) {
        this.product = product;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

}
