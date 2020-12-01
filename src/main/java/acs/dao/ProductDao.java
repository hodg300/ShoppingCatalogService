package acs.dao;

import acs.data.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDao  extends JpaRepository<ProductEntity, String> {

}
