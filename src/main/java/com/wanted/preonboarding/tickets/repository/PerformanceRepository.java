package com.wanted.preonboarding.tickets.repository;


import com.wanted.preonboarding.tickets.domain.Performance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface PerformanceRepository extends JpaRepository<Performance, UUID> {

    @Override
    Optional<Performance> findById(UUID uuid);
}
