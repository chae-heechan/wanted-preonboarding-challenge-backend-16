package com.wanted.preonboarding.tickets.repository;

import com.wanted.preonboarding.tickets.domain.PerformanceSeatInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface PerformanceSeatInfoRepository extends JpaRepository<PerformanceSeatInfo, Long> {

    Optional<PerformanceSeatInfo> findByPerformanceIdAndLineAndSeat(UUID performanceId, String line, int seat);
}
