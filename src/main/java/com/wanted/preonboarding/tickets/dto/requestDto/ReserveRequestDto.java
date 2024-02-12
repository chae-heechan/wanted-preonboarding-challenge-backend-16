package com.wanted.preonboarding.tickets.dto.requestDto;

import lombok.Builder;
import lombok.Getter;

import java.util.UUID;

@Getter
@Builder
public class ReserveRequestDto {

    private String name;

    private String phoneNumber;

    private int balance;

    private UUID performanceId;

    private int round;

    private String line;

    private int seat;
}
