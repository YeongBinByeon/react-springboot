package org.zerock.apiserver.repository;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.zerock.apiserver.domain.Product;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {

    // 엘리먼트 엔티티 그래프 - 이걸 쓰면 연관된 엔티티를 같이 조인해서 로딩을 한다.
    @EntityGraph(attributePaths = "imageList")
    @Query("select p from Product p where p.pno = :pno")
    Optional<Product> selectOne(@Param("pno") Long pno);

    @Modifying
    @Query("update Product p set p.delFlag = :delFlag where p.pno = :pno")
    void updateToDelete( @Param("pno") Long pno, @Param("delFlag") boolean flag);

}
