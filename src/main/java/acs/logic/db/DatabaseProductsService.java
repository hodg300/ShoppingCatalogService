package acs.logic.db;
import acs.boundary.ProductBoundary;
import acs.dao.ProductDao;
import acs.data.ProductEntity;
import acs.logic.ProductsService;
import acs.logic.utils.ProductConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
public class DatabaseProductsService implements ProductsService {
    private ProductDao productDao; // Data access object
    private ProductConverter converter;

    @Autowired
    public DatabaseProductsService(ProductDao productDao, ProductConverter converter) {
        this.productDao = productDao;
        this.converter = converter;
    }

    @Override
    @Transactional
    public ProductBoundary createProduct(ProductBoundary productBoundary) {
        productBoundary.setId(UUID.randomUUID().toString());
        ProductEntity productEntity = this.converter.toEntity(productBoundary);
        productEntity = this.productDao.save(productEntity);
        return this.converter.fromEntity(productEntity);
    }


}
