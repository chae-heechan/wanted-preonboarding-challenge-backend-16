package com.wanted.preonboarding.strategy.perdicate.filter;

import com.wanted.preonboarding.strategy.dto.Apple;

public abstract class ApplePredicate {
    public String getFilterName() {
        return getClass().getSimpleName();
    }

    public abstract boolean filter(Apple apple);
}
