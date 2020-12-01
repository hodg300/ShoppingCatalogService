package acs.rest;

import acs.boundary.ProductBoundary;
import acs.logic.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController {
    private ProductsService productsService;

    @Autowired
    public ProductsController(ProductsService productsService) {
        this.productsService = productsService;
    }

    /*--------------------- POST APIS ------------------- */

    // Store product
    @RequestMapping(path = "/shopping/products", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ProductBoundary createProduct(@RequestBody ProductBoundary productBoundary) {
        return productsService.createProduct(productBoundary);
    }
}
