package acs.logic.utils;
import acs.boundary.ProductBoundary;
import acs.data.ProductEntity;
import org.springframework.stereotype.Component;

@Component
public class ProductConverter {
    public ProductBoundary fromEntity(ProductEntity entity) {
        ProductBoundary rv = new ProductBoundary();
        rv.setId(entity.getId());
        rv.setImage(entity.getImage());
        rv.setName(entity.getName());
        rv.setPrice(entity.getPrice());
        rv.setProductDetails(entity.getProductDetails());

        return rv;
    }

    public ProductEntity toEntity(ProductBoundary boundary) {
        ProductEntity rv = new ProductEntity();
        rv.setId(boundary.getId());
        rv.setImage(boundary.getImage());
        rv.setName(boundary.getName());
        rv.setPrice(boundary.getPrice());
        rv.setProductDetails(boundary.getProductDetails());
        return rv;
    }
}
