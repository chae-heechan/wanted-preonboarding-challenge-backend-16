package com.wanted.preonboarding.tickets.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum TicketExceptionInfo {
    NOT_FOUND_PERFORMANCE(HttpStatus.NOT_FOUND, "공연을 찾을 수 없습니다."),
    SOLD_OUT(HttpStatus.NOT_FOUND, "해당 좌석은 이미 예약되었습니다."),
    NOT_FOUND_SEAT(HttpStatus.NOT_FOUND, "좌석을 찾을 수 없습니다.");

    private final HttpStatus status;
    private final String message;

    TicketExceptionInfo(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }
}
