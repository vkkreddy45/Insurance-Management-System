package com.insurance.repository;

import com.insurance.entity.Policy;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

@Repository
public interface PolicyRepository extends JpaRepository<Policy, Long> {
    // You can define custom query methods here if needed

}

