package com.wanted.preonboarding.tickets.service;

import com.wanted.preonboarding.tickets.dto.requestDto.ReserveRequestDto;
import com.wanted.preonboarding.tickets.dto.responseDto.ReserveResponseDto;

public interface ReservationService {

    ReserveResponseDto reserve(ReserveRequestDto reserveRequestDto);
}
