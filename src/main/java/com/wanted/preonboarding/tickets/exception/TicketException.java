package com.wanted.preonboarding.tickets.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class TicketException extends RuntimeException{

    private final TicketExceptionInfo info;
}
