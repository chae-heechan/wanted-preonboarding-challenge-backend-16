package com.wanted.preonboarding.tickets.exception;

import com.wanted.preonboarding.tickets.BaseResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(TicketException.class)
    public ResponseEntity<BaseResponse<TicketException>> ticketExceptionHandler(TicketException exception) {
        return ResponseEntity.status(exception.getInfo().getStatus())
            .body(BaseResponse.<TicketException>builder()
                .message(exception.getInfo().getMessage())
                .build());
    }

}
