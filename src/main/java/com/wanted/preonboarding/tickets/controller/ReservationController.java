package com.wanted.preonboarding.tickets.controller;

import com.wanted.preonboarding.tickets.BaseResponse;
import com.wanted.preonboarding.tickets.dto.requestDto.ReserveRequestDto;
import com.wanted.preonboarding.tickets.dto.responseDto.ReserveResponseDto;
import com.wanted.preonboarding.tickets.service.ReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequiredArgsConstructor
@RequestMapping("/ticket")
public class ReservationController {

    private final ReservationService reservationService;

    /**
     * 공연 예약
     *
     * @param reserveRequestDto
     * @return ResponseEntity<BaseResponse<ReserveResponseDto>>
     */
    @PostMapping("/reserve")
    private ResponseEntity<BaseResponse<ReserveResponseDto>> reserve(@RequestBody ReserveRequestDto reserveRequestDto) {
        return ResponseEntity.ok()
            .body(BaseResponse.<ReserveResponseDto>builder()
                .message("Success")
                .statusCode(HttpStatus.OK)
                .data(reservationService.reserve(reserveRequestDto))
                .build());
    }
}
