package acs.data;

import org.hibernate.validator.constraints.NotEmpty;
import javax.persistence.*;
import java.util.Map;

@Entity
@Table(name="PRODUCTS")
public class ProductEntity {

    @Id
    private String id;        // ID PK VARCHAR(255)

    @NotEmpty(message="Name can not be empty")
    private String name;    // NAME VARCHAR(255)

    @NotEmpty(message="Price can not be empty")
    private Integer price;

    @NotEmpty(message="Image can not be empty")
    private String image;    // IMAGE VARCHAR(255)

    @Lob
    @Convert(converter = acs.logic.utils.MapToJsonConverter.class)
    private Map<String, Object> productDetails; // ELEMENT_ATTRIBUTES CLOB

    public ProductEntity() {}

    // TODO Add category attribute
    public ProductEntity(String id, String name, Integer price, String image, Map<String, Object> productDetails) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.image = image;
        this.productDetails = productDetails;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Map<String, Object> getProductDetails() {
        return productDetails;
    }

    public void setProductDetails(Map<String, Object> productDetails) {
        this.productDetails = productDetails;
    }
}
