package org.zerock.apiserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zerock.apiserver.domain.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
