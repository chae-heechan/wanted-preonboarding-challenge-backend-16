package com.wanted.preonboarding.strategy.perdicate.filter;

import com.wanted.preonboarding.strategy.dto.Apple;
import org.springframework.stereotype.Component;

@Component
public class AppleHeavyWeightPredicate extends ApplePredicate {
    @Override
    public boolean filter(Apple apple) {
        return apple.getWeight() > 15;
    }
}
