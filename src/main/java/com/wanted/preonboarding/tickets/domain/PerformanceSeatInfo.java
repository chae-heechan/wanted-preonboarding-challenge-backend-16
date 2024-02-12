package com.wanted.preonboarding.tickets.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PerformanceSeatInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "performance_id", columnDefinition = "BINARY(16)", nullable = false)
    private Performance performance;

    @Column(nullable = false)
    private String line;

    @Column(nullable = false)
    private int seat;

    @Column(nullable = false, columnDefinition = "BOOLEAN")
    private boolean isReservable;

}
