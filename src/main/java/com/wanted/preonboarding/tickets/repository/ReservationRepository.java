package com.wanted.preonboarding.tickets.repository;

import com.wanted.preonboarding.tickets.domain.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, UUID> {

    @Override
    Optional<Reservation> findById(UUID uuid);

}
