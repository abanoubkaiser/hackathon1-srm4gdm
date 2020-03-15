package edu.miu.cs.cs425.hackathon1srm4gdm.repository;

import edu.miu.cs.cs425.hackathon1srm4gdm.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
