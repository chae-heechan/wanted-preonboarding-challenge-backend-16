package com.wanted.preonboarding.tickets;

import lombok.Builder;
import org.springframework.http.HttpStatus;

@Builder
public record BaseResponse<T>(HttpStatus statusCode, String message, T data) {
}
