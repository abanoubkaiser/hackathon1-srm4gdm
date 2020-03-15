package edu.miu.cs.cs425.hackathon1srm4gdm.service;

import edu.miu.cs.cs425.hackathon1srm4gdm.model.Product;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ProductService {

    public abstract List<Product> getAllProducts();
    public abstract Page<Product> getAllProductsPaged(int pageNo);
    public abstract Product saveProduct(Product product);
    public abstract Product getProductById(Long productId);

}
