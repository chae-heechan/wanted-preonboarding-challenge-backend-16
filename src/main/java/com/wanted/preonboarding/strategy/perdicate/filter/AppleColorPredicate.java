package com.wanted.preonboarding.strategy.perdicate.filter;

import com.wanted.preonboarding.strategy.dto.Apple;
import org.springframework.stereotype.Component;

import static com.wanted.preonboarding.strategy.dto.Color.GREEN;

@Component
public class AppleColorPredicate extends ApplePredicate {
    @Override
    public boolean filter(Apple apple) {
        return GREEN.equals(apple.getColor());
    }
}
