package com.wanted.preonboarding.tickets.service;

import com.wanted.preonboarding.tickets.domain.Performance;
import com.wanted.preonboarding.tickets.domain.PerformanceSeatInfo;
import com.wanted.preonboarding.tickets.domain.Reservation;
import com.wanted.preonboarding.tickets.dto.requestDto.ReserveRequestDto;
import com.wanted.preonboarding.tickets.dto.responseDto.ReserveResponseDto;
import com.wanted.preonboarding.tickets.exception.TicketException;
import com.wanted.preonboarding.tickets.exception.TicketExceptionInfo;
import com.wanted.preonboarding.tickets.repository.PerformanceRepository;
import com.wanted.preonboarding.tickets.repository.PerformanceSeatInfoRepository;
import com.wanted.preonboarding.tickets.repository.ReservationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReservationServiceImpl implements ReservationService {

    private final ReservationRepository reservationRepository;
    private final PerformanceRepository performanceRepository;
    private final PerformanceSeatInfoRepository performanceSeatInfoRepository;


    /**
     * 공연 예약
     *
     * @param reserveRequestDto
     * @return ReserveResponseDto
     */
    @Override
    public ReserveResponseDto reserve(ReserveRequestDto reserveRequestDto) {

        Performance performance = performanceRepository.findById(reserveRequestDto.getPerformanceId())
            .orElseThrow(() -> new TicketException(TicketExceptionInfo.NOT_FOUND_PERFORMANCE));

        PerformanceSeatInfo performanceSeatInfo = performanceSeatInfoRepository.findByPerformanceIdAndLineAndSeat(
                reserveRequestDto.getPerformanceId(), reserveRequestDto.getLine(), reserveRequestDto.getSeat())
            .orElseThrow(() -> new TicketException(TicketExceptionInfo.NOT_FOUND_SEAT));

        if(!performanceSeatInfo.isReservable()) {
            throw new TicketException(TicketExceptionInfo.SOLD_OUT);
        }

        Reservation reservation = reservationRepository.save(
            Reservation.builder()
                .performanceId(reserveRequestDto.getPerformanceId())
                .title(performance.getTitle())
                .round(reserveRequestDto.getRound())
                .name(reserveRequestDto.getName())
                .phoneNumber(reserveRequestDto.getPhoneNumber())
                .line(performanceSeatInfo.getLine())
                .seat(performanceSeatInfo.getSeat())
                .build()
        );

        return ReserveResponseDto.builder()
            .name(reservation.getName())
            .phoneNumber(reservation.getPhoneNumber())
            .performanceId(reservation.getPerformanceId())
            .title(reservation.getTitle())
            .round(reservation.getRound())
            .line(reservation.getLine())
            .seat(reservation.getSeat())
            .build();

    }
}
