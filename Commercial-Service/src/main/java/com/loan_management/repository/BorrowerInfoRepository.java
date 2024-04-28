package com.loan_management.repository;

import com.loan_management.entity.BorrowerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BorrowerInfoRepository extends JpaRepository<BorrowerInfo, Long> {
    BorrowerInfo findByClientId(String clientId);
}