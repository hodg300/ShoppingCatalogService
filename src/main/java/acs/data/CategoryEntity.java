package acs.data;
import javax.persistence.*;
import org.hibernate.validator.constraints.NotEmpty;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="CATEGORIES")
public class CategoryEntity {

    @Id
    private String name;        // EMAIL PK VARCHAR(255)

    @NotEmpty(message="Description can not be empty")
    private String description ;    // FIRST VARCHAR(255)

    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private Set<ProductEntity> productsElements;

    public CategoryEntity() {
        this.productsElements = new HashSet<>();
    }

    public CategoryEntity(String name, String description) {
        super();
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public Set<ProductEntity> getProductsElements() {
        return productsElements;
    }

    public void setProductsElements(Set<ProductEntity> productsElements) {
        this.productsElements = productsElements;
    }

    public void addProductElement(ProductEntity product) {
        this.productsElements.add(product);
    }


}
