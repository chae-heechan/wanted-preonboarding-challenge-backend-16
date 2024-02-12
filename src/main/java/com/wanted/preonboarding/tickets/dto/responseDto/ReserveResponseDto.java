package com.wanted.preonboarding.tickets.dto.responseDto;

import lombok.Builder;
import lombok.Getter;

import java.util.UUID;

@Getter
@Builder
public class ReserveResponseDto {

    private String name;

    private String phoneNumber;

    private UUID performanceId;

    private String title;

    private int round;

    private String line;

    private int seat;
}
