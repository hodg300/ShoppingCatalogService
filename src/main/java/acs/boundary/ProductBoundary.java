package acs.boundary;
import acs.data.CategoryEntity;

import java.util.Map;

public class ProductBoundary {

    private String id;
    private String name;
    private Integer price;
    private String image;
    private Map<String, Object> productDetails;
    private CategoryBoundary origin;

    public ProductBoundary() {
    }
    // TODO Add category attribute
    public ProductBoundary(String id, String name, Integer price, String image, Map<String, Object> productDetails) {
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

    public CategoryBoundary getOrigin() {
        return origin;
    }

    public void setOrigin(CategoryBoundary origin) {
        this.origin = origin;
    }
}
