package acs.boundary;
import acs.data.CategoryEntity;

import java.util.Map;

public class ProductBoundary {

    private String id;
    private String name;
    private Float price;
    private String image;
    private Map<String, Object> productDetails;
    private CategoryBoundary category;

    public ProductBoundary() {
    }
    // TODO Add category attribute
    public ProductBoundary(String id, String name, Float price, String image, Map<String, Object> productDetails
    ,CategoryBoundary category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.image = image;
        this.productDetails = productDetails;
        this.category = category;
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

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
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

    public CategoryBoundary getCategory() {
        return category;
    }

    public void setCategory(CategoryBoundary category) {
        this.category = category;
    }
}
